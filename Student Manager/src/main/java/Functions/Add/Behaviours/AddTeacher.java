package Functions.Add.Behaviours;

import Connector.PrepareAfterConnect;
import Object.Management.Teachers;

import java.util.Scanner;

public class AddTeacher implements AddPerson{
    //Vision class open
    //Add_Teachers_View  addStudent = new Add_Teachers_View()

    /*@Override
    public void selectingInformation() {
        //Add teacher with information on view
    }*/

    @Override
    public void setInformation(){
        int id = 1 + PrepareAfterConnect.getMaxID("teachers");
        Teachers teachers = new Teachers(id, "Nguyen Thanh Phuoc", "TPHCM", 34, "Mau thiet ke",
                "Ph.D", "504077", 90000000);
        Connector.Teachers.AddTeacher.add(teachers);
    }
    @Override
    public void add(Scanner sc) {
        System.out.print("Name: ");
        String name = sc.nextLine();
        System.out.print("Home town: ");
        String hometown = sc.nextLine();
        System.out.print("Age: ");
        int age = Integer.parseInt(sc.nextLine());
        System.out.print("Subject: ");
        String subject = sc.nextLine();
        System.out.print("Class: ");
        String teacherClass = sc.nextLine();
        System.out.print("Degree: ");
        String degree = sc.nextLine();
        System.out.print("Salary: ");
        int teacherSalary = Integer.parseInt(sc.nextLine());
        addTeacher(name, hometown, age, subject, degree, teacherClass,
                teacherSalary);
    }
    private void addTeacher(String name, String hometown, int age,
                            String subject, String degree, String teacherClass,
                            int salary){
        int id = 1 + PrepareAfterConnect.getMaxID("teachers");
        Teachers teachers = new Teachers(id, name, hometown, age, subject,
                degree, teacherClass, salary);
        Connector.Teachers.AddTeacher.add(teachers);
    }
}
