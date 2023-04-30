package Connector.Students;

import Connector.PrepareAfterConnect;
import Connector.dbConnect;
import Object.Management.Students;
import Screen.MainScreen;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class EditStudent extends PrepareAfterConnect {
    public static void editStudentName(int id, String name){
        try {
            stmt = mycon.createStatement();
            stmt.executeUpdate(String.format(
                    "update students set name = '%s'" +
                            "where id = %d", name, id
            ));
        }catch (SQLException e){
            e.printStackTrace();
        }
    }
    public static void editStudentAge(int id, int age){
        try {
            stmt = mycon.createStatement();
            stmt.executeUpdate(String.format(
                    "update students set age = '%d'" +
                            "where id = %d", age, id
            ));
        }catch (SQLException e){
            e.printStackTrace();
        }
    }
    public static void editStudentGPA(int id, double gpa){
        try {
            pre = mycon.prepareStatement(
                    "update students set GPA = ?" +
                            "where id = ?"
            );
            pre.setDouble(1, gpa);
            pre.setInt(2, id);
            if(pre.executeUpdate() != 0){
                //do not thing
            }
        }catch (SQLException e){
            e.printStackTrace();
        }
    }
    public static void editStudentHometown(int id, String hometown){
        try {
            stmt = mycon.createStatement();
            stmt.executeUpdate(String.format(
                    "update students set hometown = '%s'" +
                            "where id = %d", hometown, id
            ));
        }catch (SQLException e){
            e.printStackTrace();
        }
    }
    public static void editStudentClass(int id, String studentClass){
        try {
            stmt = mycon.createStatement();
            stmt.executeUpdate(String.format(
                    "update students set class = '%s'" +
                            "where id = %d", studentClass, id
            ));
        }catch (SQLException e){
            e.printStackTrace();
        }
    }
    public static void editStudentMajor(int id, String major){
        try {
            stmt = mycon.createStatement();
            stmt.executeUpdate(String.format(
                    "update students set major = '%s'" +
                            "where id = %d", major, id
            ));
        }catch (SQLException e){
            e.printStackTrace();
        }
    }
    public static void editStudents(Students students){
        mycon = dbConnect.getConnection();

        try{
            pre = mycon.prepareStatement(
                    "UPDATE students SET `name`= ?,`age`= ?," +
                            "`hometown`= ?,`GPA`= ?,`class`= ?,`major`= ? WHERE id = ?");

            pre.setString(1, students.getName());
            pre.setInt(2, students.getAge());
            pre.setString(3, students.getHometown());
            pre.setDouble(4, students.getGrades());
            pre.setString(5, students.getStudentClass());
            pre.setString(6, students.getMajor());
            pre.setInt(7, students.getId());

            int row = pre.executeUpdate();
            if(row != 0){
                //do not thing
            }
        }catch (SQLException e){
            e.printStackTrace();
        }
    }
}
