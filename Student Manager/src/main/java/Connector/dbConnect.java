package Connector;

import java.sql.*;

public class dbConnect {
    protected static Connection getConnection(){
        try{
            String db="mysql"; // replace with your database name
            String user = "root", pass = "";
            String url = "jdbc:mysql://localhost:3306/"+db;
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection conn = DriverManager.getConnection(url,user,pass);
            return conn;
        }catch (Exception e){
            System.out.println(e.getMessage());
        }
        return null;
    }

}
