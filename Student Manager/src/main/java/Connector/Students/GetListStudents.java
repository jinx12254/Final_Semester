package Connector.Students;

import Connector.PrepareAfterConnect;
import Connector.dbConnect;
import Object.Management.Students;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

public class GetListStudents extends PrepareAfterConnect {
    public static ArrayList getListDefault(){
        try {
            stmt = mycon.createStatement();
            ResultSet rs = stmt.executeQuery("select * from students");
            while(rs.next()){
                listStudents.add(new Students(
                        rs.getInt(1), rs.getString(2),
                        rs.getString(4), rs.getInt(3),
                        rs.getString(7), rs.getString(6),
                        rs.getDouble(5)
                ));
            }
        }catch (SQLException e){
            e.printStackTrace();
        }

        return listStudents;
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
            ResultSet rs = stmt.executeQuery(String.format("select * from students order by name %s", typeSort));
            while(rs.next()){
                listStudents.add(new Students(
                        rs.getInt(1), rs.getString(2),
                        rs.getString(4), rs.getInt(3),
                        rs.getString(7), rs.getString(6),
                        rs.getDouble(5)
                ));
            }
        }catch (SQLException e){
            e.printStackTrace();
        }

        return listStudents;
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
            ResultSet rs = stmt.executeQuery(String.format("select * from students order by id %s", typeSort));
            while(rs.next()){
                listStudents.add(new Students(
                        rs.getInt(1), rs.getString(2),
                        rs.getString(4), rs.getInt(3),
                        rs.getString(7), rs.getString(6),
                        rs.getDouble(5)
                ));
            }
        }catch (SQLException e){
            e.printStackTrace();
        }

        return listStudents;
    }

    public static ArrayList getListByGPA(double gpa) {
        try {
            stmt = mycon.createStatement();
            ResultSet rs = stmt.executeQuery(String.format("select * from students where GPA = '%d'", gpa));
            while(rs.next()){
                listStudents.add(new Students(
                        rs.getInt(1), rs.getString(2),
                        rs.getString(4), rs.getInt(3),
                        rs.getString(7), rs.getString(6),
                        rs.getDouble(5)
                ));
            }
        }catch (SQLException e){
            e.printStackTrace();
        }

        return listStudents;
    }
    public static ArrayList getListByName(String name) {
        try {
            stmt = mycon.createStatement();
            ResultSet rs = stmt.executeQuery(String.format("select * from students where name = '%s'", name));
            while(rs.next()){
                listStudents.add(new Students(
                        rs.getInt(1), rs.getString(2),
                        rs.getString(4), rs.getInt(3),
                        rs.getString(7), rs.getString(6),
                        rs.getDouble(5)
                ));
            }
        }catch (SQLException e){
            e.printStackTrace();
        }

        return listStudents;
    }
    public static ArrayList getListByID(int id) {
        try {
            stmt = mycon.createStatement();
            ResultSet rs = stmt.executeQuery(String.format("select * from students where id = %d", id));
            while(rs.next()){
                listStudents.add(new Students(
                        rs.getInt(1), rs.getString(2),
                        rs.getString(4), rs.getInt(3),
                        rs.getString(7), rs.getString(6),
                        rs.getDouble(5)
                ));
            }
        }catch (SQLException e){
            e.printStackTrace();
        }

        return listStudents;
    }
    public static Students getStudentByID(int id) {
        Students st = null;
        try {
            stmt = mycon.createStatement();
            ResultSet rs = stmt.executeQuery(String.format("select * from students where id = %d", id));
            while (rs.next()){
                st = new Students(
                        rs.getInt(1), rs.getString(2),
                        rs.getString(4), rs.getInt(3),
                        rs.getString(7), rs.getString(6),
                        rs.getDouble(5)
                );
            }

        }catch (SQLException e){
            e.printStackTrace();
        }

        return st;
    }
}
