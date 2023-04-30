package Connector.Teachers;

import Connector.PrepareAfterConnect;
import Object.Management.Students;
import Object.Management.Teachers;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

public class GetListTeachers extends PrepareAfterConnect {
    public static ArrayList getListDefault(){
        try {
            stmt = mycon.createStatement();
            ResultSet rs = stmt.executeQuery("select * from teachers");
            while(rs.next()){
                listTeachers.add(new Teachers(
                        rs.getInt(1), rs.getString(2),
                        rs.getString(4), rs.getInt(3),
                        rs.getString(5), rs.getString(6),
                        rs.getString(7), rs.getInt(8)
                ));
            }
        }catch (SQLException e){
            e.printStackTrace();
        }

        return listTeachers;
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
            ResultSet rs = stmt.executeQuery(String.format("select * from teachers order by name %s", typeSort));
            while(rs.next()){
                listTeachers.add(new Teachers(
                        rs.getInt(1), rs.getString(2),
                        rs.getString(4), rs.getInt(3),
                        rs.getString(5), rs.getString(6),
                        rs.getString(7), rs.getInt(8)
                ));
            }
        }catch (SQLException e){
            e.printStackTrace();
        }

        return listTeachers;
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
            ResultSet rs = stmt.executeQuery(String.format("select * from teachers order by id %s", typeSort));
            while(rs.next()){
                listTeachers.add(new Teachers(
                        rs.getInt(1), rs.getString(2),
                        rs.getString(4), rs.getInt(3),
                        rs.getString(5), rs.getString(6),
                        rs.getString(7), rs.getInt(8)
                ));
            }
        }catch (SQLException e){
            e.printStackTrace();
        }

        return listTeachers;
    }
    public static ArrayList getListByName(String name) {
        try {
            stmt = mycon.createStatement();
            ResultSet rs = stmt.executeQuery(String.format("select * from teachers where name = '%s'", name));
            while(rs.next()){
                listTeachers.add(new Teachers(
                        rs.getInt(1), rs.getString(2),
                        rs.getString(4), rs.getInt(3),
                        rs.getString(5), rs.getString(6),
                        rs.getString(7), rs.getInt(8)
                ));
            }
        }catch (SQLException e){
            e.printStackTrace();
        }

        return listTeachers;
    }
    public static ArrayList getListByID(int id) {
        try {
            stmt = mycon.createStatement();
            ResultSet rs = stmt.executeQuery(String.format("select * from teachers where id = %d", id));
            while(rs.next()){
                listTeachers.add(new Teachers(
                        rs.getInt(1), rs.getString(2),
                        rs.getString(4), rs.getInt(3),
                        rs.getString(5), rs.getString(6),
                        rs.getString(7), rs.getInt(8)
                ));
            }
        }catch (SQLException e){
            e.printStackTrace();
        }

        return listTeachers;
    }
    public static Teachers getTeacherByID(int id) {
        try {
            stmt = mycon.createStatement();
            ResultSet rs = stmt.executeQuery(String.format("select * from teachers where id = %d", id));
            while(rs.next()){
                return new Teachers(
                        rs.getInt(1), rs.getString(2),
                        rs.getString(4), rs.getInt(3),
                        rs.getString(5), rs.getString(6),
                        rs.getString(7), rs.getInt(8)
                );
            }
        }catch (SQLException e){
            e.printStackTrace();
        }

        return null;
    }
}
