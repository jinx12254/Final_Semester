package Functions.Add.Behaviours;

import Connector.PrepareAfterConnect;
import Object.Management.Students;

import java.sql.SQLException;
import java.util.Scanner;

public class AddStudent implements AddPerson{
    //Vision class open
    //Add_Student_View  addStudentView = new Add_Student_View()
    /*@Override
    public void selectingInformation() {
        Students students = new Students(addStudentView.getValueOf("id"),
                addStudentView.getValueOf("name"), addStudentView.getValueOf("age"),
                addStudentView.getValueOf("hometown"), addStudentView.getValueOf("GPA"),
                addStudentView.getValueOf("class"), addStudentView.getValueOf("major"));
        Connector.Students.AddStudent.add(students);
    }*/
    @Override
    public void setInformation(){
        int id = 1 + PrepareAfterConnect.getMaxID("students");
        Students students = new Students(id, "ABC", "Long An",
                24, "IT", "19H50301", 0.0);
        Connector.Students.AddStudent.add(students);
    }

    @Override
    public void add(Scanner sc) {
        System.out.print("Name: ");
        String name = sc.nextLine();
        System.out.print("Home town: ");
        String hometown = sc.nextLine();
        System.out.print("Age: ");
        int age = Integer.parseInt(sc.nextLine());
        System.out.print("Major: ");
        String major = sc.nextLine();
        System.out.print("Class: ");
        String studentClass = sc.nextLine();
        System.out.print("Grades: ");
        double grades = Double.parseDouble(sc.nextLine());
        addStudent(name, hometown, age, major, studentClass, grades);
    }

    private void addStudent(String name, String hometown, int age,
                            String major, String studentClass,
                            double grades){
        int id = 1 + PrepareAfterConnect.getMaxID("students");
        Students student = new Students(id, name, hometown,
                age, major, studentClass, grades);
        Connector.Students.AddStudent.add(student);
    }
}
