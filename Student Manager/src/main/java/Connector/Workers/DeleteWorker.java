package Connector.Workers;

import Connector.PrepareAfterConnect;

import java.sql.ResultSet;
import java.sql.SQLException;

public class DeleteWorker extends PrepareAfterConnect {
    public static void delete(int id){
        try {
            stmt = mycon.createStatement();
            stmt.executeUpdate(String.format("delete from workers where id = %d", id));
        }catch (SQLException e){
            //insert messages
            e.printStackTrace();
        }
    }
}
