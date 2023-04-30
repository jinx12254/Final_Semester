package Connector.Students;

import Connector.PrepareAfterConnect;
import Connector.dbConnect;
import Object.Management.Students;

import java.sql.SQLException;

public class AddStudent extends PrepareAfterConnect {
    public static void add(Students students){
        mycon = dbConnect.getConnection();

        try{
            pre = mycon.prepareStatement(
                    "INSERT INTO `students`(`ID`, `name`, `age`, `hometown`, " +
                            "`GPA`, `class`, `major`) " +
                            "VALUES (?, ?, ?, ?, ?, ?, ?)");

            pre.setInt(1, students.getId());
            pre.setString(2, students.getName());
            pre.setInt(3, students.getAge());
            pre.setString(4, students.getHometown());
            pre.setDouble(5, students.getGrades());
            pre.setString(6, students.getStudentClass());
            pre.setString(7, students.getMajor());

            int row = pre.executeUpdate();
            if(row != 0){
                System.out.println("Add success!!");
            }
        }catch (SQLException e){
            e.printStackTrace();
        }
    }
}
