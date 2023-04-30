package Connector.Teachers;

import Connector.PrepareAfterConnect;
import Connector.dbConnect;
import Object.Management.Students;
import Object.Management.Teachers;

import java.sql.ResultSet;
import java.sql.SQLException;

public class EditTeacher extends PrepareAfterConnect {
    public static void editTeacherName(int id, String name){
        try {
            stmt = mycon.createStatement();
            stmt.executeUpdate(String.format(
                    "update teachers set name = '%s'" +
                            "where id = %d", name, id
            ));
        }catch (SQLException e){
            e.printStackTrace();
        }
    }
    public static void editTeacherAge(int id, int age){
        try {
            stmt = mycon.createStatement();
            stmt.executeUpdate(String.format(
                    "update teachers set age = '%d'" +
                            "where id = %d", age, id
            ));
        }catch (SQLException e){
            e.printStackTrace();
        }
    }
    public static void editTeacherHometown(int id, String hometown){
        try {
            stmt = mycon.createStatement();
            stmt.executeUpdate(String.format(
                    "update students teachers hometown = '%s'" +
                            "where id = %d", hometown, id
            ));
        }catch (SQLException e){
            e.printStackTrace();
        }
    }
    public static void editTeacherSubject(int id, String subject){
        try {
            stmt = mycon.createStatement();
            stmt.executeUpdate(String.format(
                    "update teachers set subject = '%s'" +
                            "where id = %d", subject, id
            ));
        }catch (SQLException e){
            e.printStackTrace();
        }
    }
    public static void editTeacherDegree(int id, String degree){
        try {
            stmt = mycon.createStatement();
            stmt.executeUpdate(String.format(
                    "update teachers set major = '%s'" +
                            "where id = %d", degree, id
            ));
        }catch (SQLException e){
            e.printStackTrace();
        }
    }
    public static void editTeacherClass(int id, String teacherClass){
        try {
            stmt = mycon.createStatement();
            stmt.executeUpdate(String.format(
                    "update teachers set class = '%s'" +
                            "where id = %d", teacherClass, id
            ));
        }catch (SQLException e){
            e.printStackTrace();
        }
    }
    public static void editTeacherSalary(int id, int salary){
        try {
            stmt = mycon.createStatement();
            stmt.executeUpdate(String.format(
                    "update teachers set salary = '%d'" +
                            "where id = %d", salary, id
            ));
        }catch (SQLException e){
            e.printStackTrace();
        }
    }
    public static void editTeacher(Teachers teachers){
        mycon = dbConnect.getConnection();

        try{
            pre = mycon.prepareStatement(
                    "UPDATE `teachers` SET `name`= ?,`age`= ?," +
                            "`hometown = ?,`subject`= ?,`degree`= ?," +
                            "`class`= ?,`salary`= ? WHERE id = ?");

            pre.setString(1, teachers.getName());
            pre.setInt(2, teachers.getAge());
            pre.setString(3, teachers.getHometown());
            pre.setString(4, teachers.getSubject());
            pre.setString(5, teachers.getDegree());
            pre.setString(6, teachers.getTeacherClass());
            pre.setInt(7, teachers.getSalary());
            pre.setInt(8, teachers.getId());

            int row = pre.executeUpdate();
            if(row != 0){
                //do not thing
            }
        }catch (SQLException e){
            e.printStackTrace();
        }
    }
}
