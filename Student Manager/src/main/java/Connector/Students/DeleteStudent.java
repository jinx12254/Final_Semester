package Connector.Students;

import Connector.PrepareAfterConnect;

import java.sql.ResultSet;
import java.sql.SQLException;

public class DeleteStudent extends PrepareAfterConnect {
    public static void delete(int id){
        try {
            stmt = mycon.createStatement();
            stmt.executeUpdate(String.format("delete from students where id = %d", id));
        }catch (SQLException e){
            //insert message
            e.printStackTrace();
        }
    }
}
