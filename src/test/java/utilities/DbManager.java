package utilities;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public class DbManager extends DataBaseConfig
{
	private static  Connection con = null; //sql
	private static Connection conn = null; //mysql
	
	//SQL Server
	
	public static void setMysqlDbConnection()
    {
    try
    {
        
        Class.forName (DataBaseConfig.mysqldriver);
        conn = DriverManager.getConnection (DataBaseConfig.mysqlurl, DataBaseConfig.mysqluserName, DataBaseConfig.mysqlpassword);
        if(!conn.isClosed())
			System.out.println("Successfully connected to MySQL server");
        
	
    }
    catch (Exception e)
    {
        System.err.println ("Cannot connect to database server");
        e.printStackTrace();
       
       // monitoringMail.sendMail(TestConfig.server, TestConfig.from, TestConfig.to, TestConfig.subject+" - (Script failed with Error, Datamart database used for reports, connection not established)", TestConfig.messageBody, TestConfig.attachmentPath, TestConfig.attachmentName);
    }
   

}
	
	
	
	
		
	
	
	public static List<String> getMysqlQuery(String query) throws SQLException{
		
		
		Statement St = conn.createStatement();
		ResultSet rs = St.executeQuery(query);
		List<String> values1 = new ArrayList<String>();
		while(rs.next()){
			
			values1.add(rs.getString(1));
			
			
		}
		return values1;
	}
	
	
	
	
	
	
	
	
	public static Connection getConnection()
	{
		return con;
			}
}
