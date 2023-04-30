package Connector.Workers;

import Connector.PrepareAfterConnect;
import Connector.dbConnect;
import Object.Management.Workers;

import java.sql.ResultSet;
import java.sql.SQLException;

public class EditWorker extends PrepareAfterConnect {
    public static void editWorkerName(int id, String name){
        try {
            stmt = mycon.createStatement();
            stmt.executeUpdate(String.format(
                    "update workers set name = '%s'" +
                            "where id = %d", name, id
            ));
        }catch (SQLException e){
            e.printStackTrace();
        }
    }
    public static void editWorkerAge(int id, int age){
        try {
            stmt = mycon.createStatement();
            stmt.executeUpdate(String.format(
                    "update workers set name = '%d'" +
                            "where id = %d", age, id
            ));
        }catch (SQLException e){
            e.printStackTrace();
        }
    }
    public static void editWorkerHometown(int id, String hometown){
        try {
            stmt = mycon.createStatement();
            stmt.executeUpdate(String.format(
                    "update workers set hometown = '%s'" +
                            "where id = %d", hometown, id
            ));
        }catch (SQLException e){
            e.printStackTrace();
        }
    }
    public static void editWorkerLocation(int id, String location){
        try {
            stmt = mycon.createStatement();
            stmt.executeUpdate(String.format(
                    "update workers set location = '%s'" +
                            "where id = %d", location, id
            ));
        }catch (SQLException e){
            e.printStackTrace();
        }
    }
    public static void editWorkerSalary(int id, int salary ){
        try {
            stmt = mycon.createStatement();
            stmt.executeUpdate(String.format(
                    "update workers set salary = '%d'" +
                            "where id = %d", salary, id
            ));
        }catch (SQLException e){
            e.printStackTrace();
        }
    }
    public static void editWorkerShift(int id, String shift){
        try {
            stmt = mycon.createStatement();
            stmt.executeUpdate(String.format(
                    "update workers set shift = '%s'" +
                            "where id = %d", shift, id
            ));
        }catch (SQLException e){
            e.printStackTrace();
        }
    }
    public static void editWorker(Workers workers){
        mycon = dbConnect.getConnection();

        try{
            pre = mycon.prepareStatement(
                    "UPDATE `workers` SET `name`= ?," +
                            "`age`= ?,`hometown`= ?,`location`= ?," +
                            "`salary`= ?,`shift`= ? WHERE id = ?");

            pre.setString(1, workers.getName());
            pre.setInt(2, workers.getAge());
            pre.setString(3, workers.getHometown());
            pre.setString(4, workers.getLocation());
            pre.setLong(5, workers.getSalary());
            pre.setString(6, workers.getShift());
            pre.setInt(7, workers.getId());

            int row = pre.executeUpdate();
            if(row != 0){
               //do nothing
            }
        }catch (SQLException e){
            e.printStackTrace();
        }
    }
}
