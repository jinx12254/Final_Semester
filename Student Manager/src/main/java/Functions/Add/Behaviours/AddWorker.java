package Functions.Add.Behaviours;

import Connector.PrepareAfterConnect;
import Object.Management.Workers;

import java.util.Scanner;

public class AddWorker implements AddPerson{
    //Vision class open
    //Add_Workers_View  addStudent = new Add_Workers_View()

    /*@Override
    public void selectingInformation() {
        //Add teacher with information on view
    }*/
    @Override
    public void setInformation() {
        int id = 1 + PrepareAfterConnect.getMaxID("workers");
        Workers workers = new Workers(id, "Nguyen Ngoc Trung Hieu", 34, "TPHCM", "Main Hall",
                1200,"Morning");
        Connector.Workers.AddWorker.add(workers);
    }
    @Override
    public void add(Scanner sc) {
        System.out.print("Name: ");
        String name = sc.nextLine();
        System.out.print("Home town: ");
        String hometown = sc.nextLine();
        System.out.print("Age: ");
        int age = Integer.parseInt(sc.nextLine());
        System.out.print("Location: ");
        String location = sc.nextLine();
        System.out.print("Salary: ");
        int workerSalary = Integer.parseInt(sc.nextLine());
        System.out.print("Grades: ");
        String shift = sc.nextLine();
        addWorker(name, hometown, age, location,
                workerSalary, shift);
    }
    private void addWorker(String name, String hometown, int age,
                           String location, int salary, String shift){
        int id = 1 + PrepareAfterConnect.getMaxID("workers");
        Workers workers = new Workers(id, name, age, hometown, location,
                salary, shift);
        Connector.Workers.AddWorker.add(workers);
    }
}
