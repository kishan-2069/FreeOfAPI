import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.List;


public class DBUtil {
	
	public static void createDB(int userId, String dbName) throws SQLException, ClassNotFoundException{
		
		Connection myConnection =  getConnection("freeapi");
		String insertqry = "insert into user_database(`uid`,`dbname`) values('"+userId+"','"+dbName+"')";
		executeupdate(myConnection,insertqry);
		myConnection.close();
		
		Connection connection = getConnection(null);
		String createDbQuery = "create database" + dbName + ";";
		executeupdate(connection, createDbQuery);
		connection.close();
	}
	public void createTable(String  databaseName, String tableName, List<Column> columns) throws SQLException{ 
		
		Connection connection = getConnection(databaseName);
		
		String qry = "";
		
		for(int i =0 ; i < columns.size(); i++){
			Column column = columns.get(i);
			System.out.println(column);
			
			String pk = "";
			
			if(column.isPK()==true){
				pk = "primary key";
			}
			qry += column.getColumnName() +" "+ column.getDataType() +"("+ column.getLength() +")"+ pk +",";
		}
		
		String str1 = "create table Employee(" + qry.substring(0,qry.length()-1) + ")";
		
		executeupdate(connection,str1);
	}
	public static void executeupdate(Connection connection, String query) throws SQLException{
		Statement statement = connection.createStatement();
		statement.executeUpdate(query);
		statement.close();
	}
	public static Connection getConnection(String databaseName){
		
		Connection connection=null;
		
		try{
			
			Class.forName("com.mysql.jdbc.Driver");
			if(databaseName!=null){
				connection  = DriverManager.getConnection("jdbc:mysql://localhost/" + databaseName, "root", "root");
			}else{
				connection = DriverManager.getConnection("jdbc:mysql://localhost/", "root", "root");
			}
			
		}catch(Exception e){
			e.printStackTrace();
		}
		return connection;
	}	
	public static void main(String[] args) throws SQLException, ClassNotFoundException {
		createDB(1,"TestDB");
	}
}