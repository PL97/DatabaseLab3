package entity;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class DB {
  private String driver = "com.mysql.jdbc.Driver";
  private String url = "jdbc:mysql://127.0.0.1:3306/databaselab3?useSSL=false";
  private Connection conn = null;
  private PreparedStatement ps = null;
  private String userName = "root";
  private String password = "Pengle1997.";
  private ResultSet rs = null;
  private String statement;

  
  public String getStatment() {
	  return statement;
  }
  
  //build connection and return it
  public Connection getConnection() throws ClassNotFoundException, SQLException {
    Class.forName(driver);
    conn = DriverManager.getConnection(url, userName, password);
    return conn;
  }
  
  //close database
  public void closeAll() throws SQLException {
    if(rs != null) {
      rs.close();
    }
    if(ps!=null) {
      ps.close();
    }
    if(conn!=null) {
      conn.close();
    }
  }
  
  //execute the select query and return the result
  public ResultSet executeSelect(String cmd, String[] param) throws SQLException {
    ps = conn.prepareStatement(cmd);
    if(param!=null) {
      for(int i = 0;i<param.length;i++) {
        ps.setString(i+1, param[i]);
      }
    }
    rs = ps.executeQuery();
    //execute.setStatement(ps.toString());
    return rs;
  }
  
  public int executeUpdate(String cmd, String[] param) throws SQLException {
    int affectRowNum = 0;
    ps = conn.prepareStatement(cmd);
    if(param!=null) {
       for(int i =0;i<param.length;i++) {
         ps.setString(i+1, param[i]);
       }
    }
    affectRowNum = ps.executeUpdate();
    return affectRowNum;
  }
  
}