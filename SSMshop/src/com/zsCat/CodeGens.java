package com.zsCat;



import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.github.abel533.easyxls.bean.Column;

/***
 * 
 * @author dell
 *
 */
public class CodeGens {

	public static String author="zs";
	public static String date= new Date().toLocaleString();
	public static String description="我的edu";
	//模块名称
	public static String model="edu";
	//功能模块
	public static String entityClass="EduCourseStudyhistory";
   // 实体类变量名称
	public static String lowerentity="eduCourseStudyhistory";
	public static String dbName="pig";
	public static String tableName="edu_course_studyhistory";
	
	public static String dbUrl="jdbc:mysql://localhost:3306/pig?useUnicode=true&characterEncoding=utf8";
	public static  String dbUserName="root";
	public static  String dbPassword="root";
	public static  String jdbcName="com.mysql.jdbc.Driver";
	 
	public static StringBuffer list1=new StringBuffer();
	public static StringBuffer list2=new StringBuffer();
	public static StringBuffer add=new StringBuffer();
	public static StringBuffer update=new StringBuffer();
	public static StringBuffer entitybuffer=new StringBuffer();
	public static StringBuffer collName=new StringBuffer();
	
	public static String collName1;
	static String packagePree="com.lanyuan.other.";
	//生成包结构
	public static String actionpackage=packagePree+model+"."+lowerentity+".action";
	public static String daopackage=packagePree+model+"."+lowerentity+".dao";
	public static String entitypackage=packagePree+model+"."+lowerentity+".entity";
	public static String daoimppackage=packagePree+model+"."+lowerentity+".daoimp";
	public static String servicepackage=packagePree+model+"."+lowerentity+".service";
	public static String serviceimppackage=packagePree+model+"."+lowerentity+".serviceimp";
	public static String controllerpackage=packagePree+model+"."+lowerentity+".controller";

	//创建实体类（通过一个模板来生成实体）
	public static void createEntityClass() throws IOException{
		String newClassName=getHomeDir("src/com/zsCat/web/"+model+"/model")+"/"+entityClass+".java";
		String actionTempContent = readFile(getHomeDir("src/template")+"entity.txt");
		new File(newClassName).getParentFile().mkdirs();
		if(!isExit(newClassName)){
			buildClass(actionTempContent, newClassName, entitypackage);
			System.out.println(entityClass+":"+newClassName);
			String ss=actionTempContent;
		}else{
			BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
			String line = reader.readLine();
			if(line != "" && line.equalsIgnoreCase("y")){
				buildClass(actionTempContent, newClassName, entitypackage);
				System.out.println("覆盖新的实体实体类："+entityClass+"成功了");
			}
		}
	
	}
	
	public static void createDaoClass() throws IOException{
		String newClassName=getHomeDir("src/com/zsCat/web/"+model+"/mapper")+"/"+entityClass+"Mapper.java";
		String actionTempContent = readFile(getHomeDir("src/template")+"dao.txt");
		new File(newClassName).getParentFile().mkdirs();
		if(!isExit(newClassName)){
			buildClass(actionTempContent, newClassName, entitypackage);
			System.out.println(entityClass+":"+newClassName);
			String ss=actionTempContent;
		}else{
			BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
			String line = reader.readLine();
			if(line != "" && line.equalsIgnoreCase("y")){
				buildClass(actionTempContent, newClassName, entitypackage);
				System.out.println("覆盖新的实体实体类："+entityClass+"成功了");
			}
		}
	}
	
	public static void createMapperClass() throws IOException{
		String newClassName=getHomeDir("src/com/zsCat/web/"+model+"/mapper")+"/"+entityClass+"Mapper.xml";
		String actionTempContent = readFile(getHomeDir("src/template")+"mapper.txt");
		new File(newClassName).getParentFile().mkdirs();
		if(!isExit(newClassName)){
			buildClass(actionTempContent, newClassName, entitypackage);
			System.out.println(entityClass+":"+newClassName);
			String ss=actionTempContent;
		}else{
			BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
			String line = reader.readLine();
			if(line != "" && line.equalsIgnoreCase("y")){
				buildClass(actionTempContent, newClassName, entitypackage);
				System.out.println("覆盖新的实体实体类："+entityClass+"成功了");
			}
		}
	}
	public static void createControllerClass() throws IOException{
		String newClassName=getHomeDir("src/com/zsCat/web/"+model+"/controller")+"/"+entityClass+"Controller.java";
		String actionTempContent = readFile(getHomeDir("src/template")+"controller.txt");
		new File(newClassName).getParentFile().mkdirs();
		if(!isExit(newClassName)){
			buildClass(actionTempContent, newClassName, entitypackage);
			System.out.println(entityClass+":"+newClassName);
			String ss=actionTempContent;
		}else{
			BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
			String line = reader.readLine();
			if(line != "" && line.equalsIgnoreCase("y")){
				buildClass(actionTempContent, newClassName, entitypackage);
				System.out.println("覆盖新的实体实体类："+entityClass+"成功了");
			}
		}
	}
	
	
	
	public static void createService() throws IOException{
		String newClassName=getHomeDir("src/com/zsCat/web/"+model+"/service")+"/"+entityClass+"Service.java";
		String actionTempContent = readFile(getHomeDir("src/template")+"service.txt");
		new File(newClassName).getParentFile().mkdirs();
		if(!isExit(newClassName)){
			buildClass(actionTempContent, newClassName, entitypackage);
			System.out.println(entityClass+":"+newClassName);
			String ss=actionTempContent;
		}else{
			BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
			String line = reader.readLine();
			if(line != "" && line.equalsIgnoreCase("y")){
				buildClass(actionTempContent, newClassName, entitypackage);
				System.out.println("覆盖新的实体实体类："+entityClass+"成功了");
			}
		}
	}
	
	public static void createListAll() throws IOException{
		String newClassName = getHomeDir("WebContent/WEB-INF/views")+model+"/"+lowerentity+"/"+lowerentity+".html";
		String actionTempContent = readFile(getHomeDir("src/template")+"listall.txt");
		new File(newClassName).getParentFile().mkdirs();
		if(!isExit(newClassName)){
			buildClass(actionTempContent, newClassName, entitypackage);
			System.out.println("Edit"+":"+newClassName);
		}else{
			BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
			String line = reader.readLine();
			if(line != "" && line.equalsIgnoreCase("y")){
				buildClass(actionTempContent, newClassName, entitypackage);
				System.out.println("覆盖新的Edit："+entityClass+"成功了");
			}
		}
		
	}
	public static void createList() throws IOException{
		String newClassName = getHomeDir("WebContent/WEB-INF/views")+model+"/"+lowerentity+"/"+lowerentity+"-list.html";
		String actionTempContent = readFile(getHomeDir("src/template")+"list.txt");
		new File(newClassName).getParentFile().mkdirs();
		if(!isExit(newClassName)){
			buildClass(actionTempContent, newClassName, entitypackage);
			System.out.println("Edit"+":"+newClassName);
		}else{
			BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
			String line = reader.readLine();
			if(line != "" && line.equalsIgnoreCase("y")){
				buildClass(actionTempContent, newClassName, entitypackage);
				System.out.println("覆盖新的Edit："+entityClass+"成功了");
			}
		}
		
	}
	public static void createEditHTML() throws IOException{
		String newClassName = getHomeDir("WebContent/WEB-INF/views")+model+"/"+lowerentity+"/"+lowerentity+"-save.html";
		String actionTempContent = readFile(getHomeDir("src/template")+"addHtml.txt");
		new File(newClassName).getParentFile().mkdirs();
		if(!isExit(newClassName)){
			buildClass(actionTempContent, newClassName, entitypackage);
			System.out.println("Edit"+":"+newClassName);
		}else{
			BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
			String line = reader.readLine();
			if(line != "" && line.equalsIgnoreCase("y")){
				buildClass(actionTempContent, newClassName, entitypackage);
				System.out.println("覆盖新的Edit："+entityClass+"成功了");
			}
		}
		
	}
	
	
	
	//将路径转换为/
	public static String conversionSpecialCharcters(String string){
		return string.replaceAll("\\\\", "/");
	}
	public static String getHomeDir(String path){
		if(!isEmpty(path)){
			return conversionSpecialCharcters(System.getProperty("user.dir"))+"/"+path+"/";
		}else{
			return System.getProperty("user.dir");
		}
	}
	
	public static void buildClass(String actionTempContent,String newFilepath,String pkg){
		actionTempContent= actionTempContent
				.replaceAll("\\[author\\]", author)
				.replaceAll("\\[date\\]", date)
				.replaceAll("\\[actionpackage\\]",pkg )
				.replaceAll("\\[description\\]", description)
				.replaceAll("\\[model\\]",model )
				.replaceAll("\\[lowerentity\\]",lowerentity )
				.replaceAll("\\[capentity\\]", lowerentity)
				.replaceAll("\\[add\\]", add.toString())
				.replaceAll("\\[update\\]", update.toString())
				.replaceAll("\\[list1\\]", list1.toString())
				.replaceAll("\\[tablename\\]", tableName.toString())
				.replaceAll("\\[collName1\\]", collName1)
				.replaceAll("\\[list2\\]", list2.toString())
				.replaceAll("\\[entitybuffer\\]", entitybuffer.toString())
				
				.replaceAll("\\[entityClass\\]", entityClass);
		
		writeFileByLine(actionTempContent,newFilepath);
	}
	private static void writeFileByLine(String actionTempContent,
			String filename) {
		File  file = new File(filename);
		PrintWriter write = null;
		
		try {
			write= new PrintWriter(new FileOutputStream(file));
			write.print(actionTempContent);
			write.flush();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}finally{
			if(write != null){
				try{
				write.close();
				}catch(Exception e){}
			}
		}
		
		
	}
	public static boolean isExit(String filepath){
		File file= new File(filepath);
		return file.exists();
	}
	public static boolean isEmpty(String str){
		return str==null || str.length() == 0 || str.equals("")
				|| str.matches("\\s*");
	}
	
	public static String readFile(String filename){
		StringBuffer buffer =new StringBuffer();
		try{
			FileInputStream inputStream = new FileInputStream(new File(filename));
			InputStreamReader inputStreamReader = new InputStreamReader(inputStream);
			BufferedReader reader = new BufferedReader(inputStreamReader);
			String tempString = null;
			while((tempString = reader.readLine())!= null){
				buffer.append(tempString+"\n");
			}
			reader.close();
		}catch(Exception e){
			
		}
		return buffer.toString();
	}
	 public static  void getEntity( StringBuffer entity,String tableName, Connection connection) throws SQLException {
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
	                if(!"id".equals(name.toLowerCase())){
	                	 if("VARCHAR".equals(dbType.toUpperCase()) ||"VARCHAR2".equals(dbType.toUpperCase())||"CHAR".equals(dbType.toUpperCase())){
			                	javaT="String";
			                }else if("DATETIME".equals(dbType.toUpperCase()) ||"DATE".equals(dbType.toUpperCase())||"timestamp".equals(dbType.toLowerCase())){
			                	javaT="Date";
			                }else if("INT".equals(dbType.toUpperCase()) ||"INTEGER".equals(dbType.toUpperCase())|| "tinyint".equals(dbType.toLowerCase())){
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
			                entity.append(		"private "+javaT+" "+name.toLowerCase()+";\n");
			                entity.append(		"public "+ javaT+" get"+get+"() {return "+ "this.get"+javaT+"(\""+name.toLowerCase()+"\");}\n");
			                entity.append(      "public void set"+get+"("+javaT+" " +name.toLowerCase()+") {this.set(\""+name.toLowerCase()+"\","+name.toLowerCase()+");}\n");

	                }
	              
	              
	            }
	       
	        
	    }
	
	 public static  void getUpdate(String tableName,String database, Connection connection) throws SQLException {
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
	           // StringBuffer sb1=new StringBuffer();
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
	            	String colname=tuofeng(rs.getString("COLUMN_NAME").toLowerCase());
	                String colname1=rs.getString("COLUMN_NAME").toLowerCase();
	                String colComment=rs.getString("column_comment");
	                collName.append(colname1+",");
	                if(!"id".equals(colname.toLowerCase())){

	                	add.append("		<div class=\"center padding-10\">\n");
	                	add.append("			<label>"+colComment+"：</label>\n");
	                	add.append("			<input type=\"text\" class=\"width-50\" name=\""+colname1+"\" datatype=\"*\"  nullmsg=\"请输入"+colComment+"！\"/>\n");
	                	add.append("		</div>\n");
	                	
	                	update.append("		<tr class=\"FormData\">\n");
	                	update.append("			<td class=\"CaptionTD\">"+colComment+"</td>\n");
	                	update.append("			<td class=\"DataTD width-100\"><input type=\"text\" name=\""+colname1+"\" datatype=\"*\"\n");
	                	update.append("			nullmsg=\"请输入"+colComment+"！\" value=\"\\${"+lowerentity+"."+colname+"!\\}\"></td>\n");
	                	update.append("		</tr>\n");
	                	list1.append("			<th class=\"center\">"+colComment+"</th>\n");
	                	
	                	list2.append("			<td class=\"center\">\\${item."+colname+"!\\}</td>\n");
				
	            	 } 
	            }
	            collName1= collName.substring(0, collName.length()-1).toString();
	           // System.out.println(sb1.toString());
	      //  return sb1.toString();
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
	 
	public static void main(String[] args) throws Exception {
		 
		Class.forName(jdbcName);
		Connection con=DriverManager.getConnection(dbUrl,dbUserName,dbPassword);
		getUpdate(tableName,dbName,con);
		getEntity(entitybuffer,tableName,con);
		
		createEntityClass();//非驼峰
		createDaoClass();
		createMapperClass();
		createControllerClass();
		createService();
		createList();
		createEditHTML();
		createListAll();//非驼峰
		
	}
	
	
	
}
