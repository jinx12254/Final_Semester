package Connector.Workers;

import Connector.PrepareAfterConnect;
import Connector.dbConnect;
import Object.Management.Workers;

import java.sql.SQLException;

public class AddWorker extends PrepareAfterConnect {
    public static void add(Workers workers){
        mycon = dbConnect.getConnection();

        try{
            pre = mycon.prepareStatement(
                    "INSERT INTO `workers`(`ID`, `name`, `age`, `hometown`, " +
                            "`location`, `salary`, `shift`) " +
                            "VALUES (?, ?, ?, ?, ?, ?, ?)");

            pre.setInt(1, workers.getId());
            pre.setString(2, workers.getName());
            pre.setInt(3, workers.getAge());
            pre.setString(4, workers.getHometown());
            pre.setString(5, workers.getLocation());
            pre.setLong(6, workers.getSalary());
            pre.setString(7, workers.getShift());

            int row = pre.executeUpdate();
            if(row != 0){
                System.out.println("Add success!!");
            }
        }catch (SQLException e){
            e.printStackTrace();
        }
    }
}
