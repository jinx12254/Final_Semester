package Connector.Teachers;

import Connector.PrepareAfterConnect;
import Connector.dbConnect;
import Object.Management.Teachers;

import java.sql.SQLException;

public class AddTeacher extends PrepareAfterConnect {
    public static void add(Teachers teachers){
        mycon = dbConnect.getConnection();

        try{
            pre = mycon.prepareStatement(
                    "INSERT INTO `teachers`(`ID`, `name`, `age`, `hometown`, " +
                            "`subject`, `degree`, `class`, `salary`) " +
                            "VALUES (?, ?, ?, ?, ?, ?, ?, ?)");

            pre.setInt(1, teachers.getId());
            pre.setString(2, teachers.getName());
            pre.setInt(3, teachers.getAge());
            pre.setString(4, teachers.getHometown());
            pre.setString(5, teachers.getSubject());
            pre.setString(6, teachers.getDegree());
            pre.setString(7, teachers.getTeacherClass());
            pre.setInt(8, teachers.getSalary());

            int row = pre.executeUpdate();
            if(row != 0){
                System.out.println("Add success!!");
            }
        }catch (SQLException e){
            e.printStackTrace();
        }
    }
}
