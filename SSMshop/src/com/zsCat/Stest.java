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

public class Stest {

	public static void main(String[] args) throws Exception {
		
//		connection.url=jdbc:mysql://localhost:3306/pigdemo?useUnicode=true&characterEncoding=utf8
//			connection.username=root
//			connection.password=root
			
			
		 String dbUrl="jdbc:mysql://localhost:3306/pig?useUnicode=true&characterEncoding=utf8";
		 String dbUserName="root";
		 String dbPassword="root";
		 String jdbcName="com.mysql.jdbc.Driver";
		Class.forName(jdbcName);
		Connection con=DriverManager.getConnection(dbUrl,dbUserName,dbPassword);
		//getUpdate("sys_user","pig",con);
		getMetaData("sys_user",con);
		
		String a="COMMENT";
		//System.out.println(tuofeng(a.toLowerCase()));
	}
	 public static String tuofeng(String str){
			if(str.indexOf("_")>-1){
				String c=str.substring(str.indexOf("_"));
				String ss= str.substring(0,str.indexOf("_"))+c.substring(1,2).toUpperCase()+c.substring(2);
				if(ss.indexOf("_")>-1){
					String cc=ss.substring(ss.indexOf("_"));
					return ss.substring(0,ss.indexOf("_"))+cc.substring(1,2).toUpperCase()+cc.substring(2);
				}else{
					return ss;
				}
			}else{
				return str;
			}
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
		            StringBuffer entity=new StringBuffer();
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
		                if(!"id".equals(name.toLowerCase())){
		                	 if("VARCHAR".equals(dbType.toUpperCase()) ||"VARCHAR2".equals(dbType.toUpperCase())||"CHAR".equals(dbType.toUpperCase())){
				                	javaT="String";
				                }else if("DATETIME".equals(dbType.toUpperCase()) ||"DATE".equals(dbType.toUpperCase())||"timestamp".equals(dbType.toLowerCase())){
				                	javaT="Date";
				                }else if("INT".equals(dbType.toUpperCase()) ||"INTEGER".equals(dbType.toUpperCase())){
				                	javaT="Integer";
				                }else if("decimal".equals(dbType.toUpperCase()) ||"DECIMAL".equals(dbType.toUpperCase())){
				                	javaT="BigDecimal";
				                }
				                else if("BIGINT".equals(dbType.toUpperCase()) ||"bigint".equals(dbType.toUpperCase())){
				                	javaT="Long";
				                }
				             //   name=tuofeng(name);
				                String get=name.substring(0, 1).toUpperCase()+name.substring(1).toLowerCase();
				              //  String javaT1=javaT.substring(0, 1).toUpperCase()+javaT.substring(1).toLowerCase();
				                entity.append("private "+javaT+" "+name.toLowerCase()+";\n");
				                entity.append("public "+ javaT+" get"+get+"() {return "+ "this.get"+javaT+"(\""+name.toLowerCase()+"\");}\n");
				                entity.append("public void set"+get+"("+javaT+" " +name.toLowerCase()+") {this.set(\""+name.toLowerCase()+"\","+name.toLowerCase()+");}\n");

		                }
		              // System.out.println(entity.toString());
		              
		            }
		       System.out.println(columnList.toString());
		        return columnList;
		    }
		 
		 public static  String getSave(String tableName,String database, Connection connection) throws SQLException {
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
		            StringBuffer sb1=new StringBuffer();
		            //查询列备注
		            pst = connection
		                .prepareStatement("select column_name, column_comment from information_schema.columns where table_name = ? AND table_schema = ?");
		            pst.setString(1, tableName.toUpperCase());
		            pst.setString(2, database.toUpperCase());
		            rs = pst.executeQuery();

		            //先将注释放入到map再获取，防止有些列没有注释获取不对应的问题
		            Map<String, String> commentMap = new HashMap<String, String>();
		            while (rs.next()) {
		             //   commentMap.put(rs.getString("COLUMN_NAME"), rs.getString("column_comment"));
		            	 
		                String colname=rs.getString("COLUMN_NAME").toLowerCase();
		                String colComment=rs.getString("column_comment");
		                if(!"id".equals(colname.toLowerCase())){
//		                	System.out.println("<div class=\"center padding-10\">");
//			                System.out.println("<label>"+colComment+"：</label>");
//			                System.out.println("<input type=\"text\" class=\"width-50\" name=\""+colname+"\" datatype=\"*\"  nullmsg=\"请输入"+colComment+"！\"/>");
//			                System.out.println("</div>");
		                	sb1.append("<div class=\"center padding-10\">\n");
		                	sb1.append("<label>"+colComment+"：</label>\n");
		                	sb1.append("<input type=\"text\" class=\"width-50\" name=\""+colname+"\" datatype=\"*\"  nullmsg=\"请输入"+colComment+"！\"/>\n");
		                	sb1.append("</div>\n");
		            	 } 
		            }
		            System.out.println(sb1.toString());
		        return sb1.toString();
		    }
		 public static  String getUpdate(String tableName,String database, Connection connection) throws SQLException {
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
		            StringBuffer sb1=new StringBuffer();
		            StringBuffer list1=new StringBuffer();
		            StringBuffer list2=new StringBuffer();
		            //查询列备注
		            pst = connection
		                .prepareStatement("select column_name, column_comment from information_schema.columns where table_name = ? AND table_schema = ?");
		            pst.setString(1, tableName.toUpperCase());
		            pst.setString(2, database.toUpperCase());
		            rs = pst.executeQuery();

		            //先将注释放入到map再获取，防止有些列没有注释获取不对应的问题
		            Map<String, String> commentMap = new HashMap<String, String>();
		            while (rs.next()) {
		             //   commentMap.put(rs.getString("COLUMN_NAME"), rs.getString("column_comment"));
		            	 
		                String colname=rs.getString("COLUMN_NAME").toLowerCase();
		                String colComment=rs.getString("column_comment");
		                if(!"id".equals(colname.toLowerCase())){

		                	sb1.append("<tr class=\"FormData\">\n");
		                	sb1.append("<td class=\"CaptionTD\">"+colComment+"</td>\n");
		                	sb1.append("<td class=\"DataTD width-100\"><input type=\"text\" name=\""+colname+"\" datatype=\"*\"\n");
		                	sb1.append("nullmsg=\"请输入"+colComment+"！\" value=\"${course."+colname+"!}\"></td>\n");
		                	sb1.append("</tr>\n");
					
		                	list1.append("		<th class=\"center\">"+colComment+"</th>\n");
		                	
		                	list2.append("		<td class=\"center\">${item."+colname+"!}</td>\n");
		                	
		            	 } 
		            }
		         //   System.out.println(sb1.toString());
		            System.out.println(list1.toString());
		            System.out.println(list2.toString());
		        return sb1.toString();
		    }
		
	}


