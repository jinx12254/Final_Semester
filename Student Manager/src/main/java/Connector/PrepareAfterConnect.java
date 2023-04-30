package Connector;

import Object.Management.Students;
import Object.Management.Teachers;
import Object.Management.Workers;

import java.sql.*;
import java.util.ArrayList;

public abstract class PrepareAfterConnect extends dbConnect{
    protected static Connection mycon = dbConnect.getConnection();
    protected static PreparedStatement pre = null;
    protected static Statement stmt = null;
    protected static ArrayList<Students> listStudents = new ArrayList<Students>();
    protected static ArrayList<Teachers> listTeachers = new ArrayList<Teachers>();
    protected static ArrayList<Workers> listWorkers = new ArrayList<Workers>();
    public static int getMaxID(String nameDb){
        try {
            stmt = mycon.createStatement();
            ResultSet rs = stmt.executeQuery(String.format("select max(id) from %s", nameDb));
            while(rs.next()){
                return rs.getInt(1);
            }
        }catch (SQLException e){
            e.printStackTrace();
        }

        return 0;
    }
}
