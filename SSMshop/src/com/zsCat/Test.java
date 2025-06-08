package com.zsCat;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.util.StringUtils;

import com.github.abel533.easyxls.bean.Column;

public class Test {

	public static void main(String[] args) throws Exception {
		
//		connection.url=jdbc:mysql://localhost:3306/pigdemo?useUnicode=true&characterEncoding=utf8
//			connection.username=root
//			connection.password=root
			
			
		 String dbUrl="jdbc:mysql://localhost:3306/newcyhz?useUnicode=true&characterEncoding=utf8";
		 String dbUserName="root";
		 String dbPassword="root";
		 String jdbcName="com.mysql.jdbc.Driver";
		Class.forName(jdbcName);
		Connection con=DriverManager.getConnection(dbUrl,dbUserName,dbPassword);
		getMetaData("TB_IDEA",con);
	}
		 public static  List<Column> getMetaData(String tableName, Connection connection) throws SQLException {
		        List<Column> columnList = new ArrayList<Column>();

		        PreparedStatement pst = null;
		        ResultSet rs = null;
		        ResultSetMetaData rsd = null;
		       
		            //查询时没有数据，只返回表头信息
		            pst = connection.prepareStatement("select * from " + tableName + " where 1=2");
		            rsd = pst.executeQuery().getMetaData();

		            //查询主键
		            String primaryKey = null;
		            pst = connection
		                .prepareStatement("SELECT COLUMN_NAME FROM INFORMATION_SCHEMA.KEY_COLUMN_USAGE WHERE CONSTRAINT_NAME='PRIMARY' and TABLE_NAME = ?");
		            pst.setString(1, tableName.toUpperCase());
		            rs = pst.executeQuery();
		            if (rs.next()) {
		                primaryKey = rs.getString(1);
		            }

		            //查询列备注
		            pst = connection
		                .prepareStatement("select column_name, column_comment from information_schema.columns where table_name = ?");
		            pst.setString(1, tableName.toUpperCase());
		            rs = pst.executeQuery();

		            //先将注释放入到map再获取，防止有些列没有注释获取不对应的问题
		            Map<String, String> commentMap = new HashMap<String, String>();
		            while (rs.next()) {
		                commentMap.put(rs.getString("COLUMN_NAME"), rs.getString("column_comment"));
		            }

		            for (int i = 1; i <= rsd.getColumnCount(); i++) {
		                String name = rsd.getColumnName(i);
		                String dbType = rsd.getColumnTypeName(i);
		                String javaT="";
		                if("VARCHAR".equals(dbType.toUpperCase()) ||"VARCHAR2".equals(dbType.toUpperCase())||"CHAR".equals(dbType.toUpperCase())){
		                	javaT="String";
		                }else if("DATETIME".equals(dbType.toUpperCase()) ||"DATE".equals(dbType.toUpperCase())){
		                	javaT="Date";
		                }else if("INT".equals(dbType.toUpperCase()) ||"INTEGER".equals(dbType.toUpperCase())){
		                	javaT="Integer";
		                }
		                else if("BIGINT".equals(dbType.toUpperCase()) ||"bigint".equals(dbType.toUpperCase())){
		                	javaT="Long";
		                }
		             //   name=tuofeng(name);
		                String get=name.substring(0, 1).toUpperCase()+name.substring(1).toUpperCase();
		                String javaT1=javaT.substring(0, 1).toUpperCase()+javaT.substring(1).toUpperCase();
		               System.out.println("private "+javaT+" "+name.toLowerCase()+";");
		               System.out.println("public "+ javaT+" get"+get+"() {return "+ "this.get"+javaT+"(\""+name.toLowerCase()+"\");}");
		               System.out.println("public void set"+get+"("+javaT+" " +name.toLowerCase()+") {this.set(\""+name.toLowerCase()+"\","+name.toLowerCase()+");}");

		              
		            }
		       
		        return columnList;
		    }
		 
		 public static String tuofeng(String str){
				if(str.indexOf("_")>-1){
					String c=str.substring(str.indexOf("_"));
					return str.substring(0,str.indexOf("_"))+c.substring(1,2).toUpperCase()+c.substring(2);
				}else{
					return str;
				}
			}
	}


