package Connector.Workers;

import Connector.PrepareAfterConnect;
import Object.Management.Students;
import Object.Management.Teachers;
import Object.Management.Workers;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

public class GetListWorkers extends PrepareAfterConnect {
    public static ArrayList getListDefault(){
        try {
            stmt = mycon.createStatement();
            ResultSet rs = stmt.executeQuery("select * from workers");
            while(rs.next()){
                listWorkers.add(new Workers(
                        rs.getInt(1), rs.getString(2),
                        rs.getInt(3), rs.getString(4),
                        rs.getString(5), rs.getInt(6),
                        rs.getString(7)
                ));
            }
        }catch (SQLException e){
            e.printStackTrace();
        }

        return listWorkers;
    }
    public static ArrayList sortByName(int type) {
        String typeSort;

        try {
            stmt = mycon.createStatement();
            if (type ==1){
                typeSort = "asc";
            }else {
                typeSort = "desc";
            }
            ResultSet rs = stmt.executeQuery(String.format("select * from workers order by name %s", typeSort));
            while(rs.next()){
                listWorkers.add(new Workers(
                        rs.getInt(1), rs.getString(2),
                        rs.getInt(3), rs.getString(4),
                        rs.getString(5), rs.getInt(6),
                        rs.getString(7)
                ));
            }
        }catch (SQLException e){
            e.printStackTrace();
        }

        return listWorkers;
    }
    public static ArrayList sortByID(int type) {
        String typeSort;

        try {
            stmt = mycon.createStatement();
            if (type ==1){
                typeSort = "asc";
            }else {
                typeSort = "desc";
            }
            ResultSet rs = stmt.executeQuery(String.format("select * from workers order by id %s", typeSort));
            while(rs.next()){
                listWorkers.add(new Workers(
                        rs.getInt(1), rs.getString(2),
                        rs.getInt(3), rs.getString(4),
                        rs.getString(5), rs.getInt(6),
                        rs.getString(7)
                ));
            }
        }catch (SQLException e){
            e.printStackTrace();
        }

        return listWorkers;
    }
    public static ArrayList getListByName(String name) {
        try {
            stmt = mycon.createStatement();
            ResultSet rs = stmt.executeQuery(String.format("select * from workers where name = '%s'", name));
            while(rs.next()){
                listWorkers.add(new Workers(
                        rs.getInt(1), rs.getString(2),
                        rs.getInt(3), rs.getString(4),
                        rs.getString(5), rs.getInt(6),
                        rs.getString(7)
                ));
            }
        }catch (SQLException e){
            e.printStackTrace();
        }

        return listWorkers;
    }
    public static ArrayList getListByID(int id) {
        try {
            stmt = mycon.createStatement();
            ResultSet rs = stmt.executeQuery(String.format("select * from workers where id = %d", id));
            while(rs.next()){
                listWorkers.add(new Workers(
                        rs.getInt(1), rs.getString(2),
                        rs.getInt(3), rs.getString(4),
                        rs.getString(5), rs.getInt(6),
                        rs.getString(7)
                ));
            }
        }catch (SQLException e){
            e.printStackTrace();
        }

        return listWorkers;
    }
    public static Workers getWorkerByID(int id) {
        try {
            stmt = mycon.createStatement();
            ResultSet rs = stmt.executeQuery(String.format("select * from workers where id = %d", id));
            while(rs.next()){
                return new Workers(
                        rs.getInt(1), rs.getString(2),
                        rs.getInt(3), rs.getString(4),
                        rs.getString(5), rs.getInt(6),
                        rs.getString(7)
                );
            }
        }catch (SQLException e){
            e.printStackTrace();
        }

        return null;
    }
}
