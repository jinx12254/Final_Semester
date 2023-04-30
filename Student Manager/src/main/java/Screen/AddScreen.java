package Screen;

import Connector.PrepareAfterConnect;
import Functions.Add.Behaviours.AddPerson;
import Functions.Add.Behaviours.AddStudent;
import Functions.Add.Behaviours.AddTeacher;
import Functions.Add.Behaviours.AddWorker;
import Object.Management.Students;
import Object.Management.Teachers;
import Object.Management.Workers;

import java.util.Scanner;

public class AddScreen {
    private String nameDb;
    private Scanner sc;
    public AddScreen(String nameDb, Scanner sc){
        this.nameDb = nameDb;
        this.sc = sc;
        switch (nameDb){
            case "students":
                AddStudent addStudent = new AddStudent();
                //addStudent.add(sc);
                addStudent.setInformation();
                break;
            case "teachers":
                AddTeacher addTeacher = new AddTeacher();
                //addTeacher.add(sc);
                addTeacher.setInformation();
                break;
            case "workers":
                AddWorker addWorker = new AddWorker();
                //addWorker.add(sc);
                addWorker.setInformation();
                break;
        }
    }

}
