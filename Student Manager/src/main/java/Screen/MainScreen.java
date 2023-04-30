package Screen;

import Connector.Students.GetListStudents;
import Connector.Teachers.GetListTeachers;
import Connector.Workers.GetListWorkers;
import Functions.DelelteAndEdit.Delete.DeleteStudent;
import Functions.DelelteAndEdit.Delete.DeleteTeacher;
import Functions.DelelteAndEdit.Delete.DeleteWorker;
import Functions.DelelteAndEdit.History.StudentHistory;
import Functions.DelelteAndEdit.History.TeacherHistory;
import Functions.DelelteAndEdit.History.WorkerHistory;
import Functions.Search.Behaviours.SearchStudents;
import Functions.Search.Behaviours.SearchTeachers;
import Functions.Search.Behaviours.SearchWorkers;
import Functions.Search.Search;
import Functions.Sort.Behaviours.SortStudent.SortStudentByID;
import Functions.Sort.Behaviours.SortStudent.SortStudentByName;
import Functions.Sort.Behaviours.SortTeacher.SortTeacherByID;
import Functions.Sort.Behaviours.SortTeacher.SortTeacherByName;
import Functions.Sort.Behaviours.Sortworker.SortWorkerById;
import Functions.Sort.Behaviours.Sortworker.SortWorkerByName;
import Functions.Sort.Prepare.Sort;
import Functions.Sort.Prepare.SortBy;
import Object.Management.Students;
import Object.Management.Teachers;
import Object.Management.Workers;
import com.sun.tools.javac.Main;

import java.util.ArrayList;
import java.util.Scanner;

public class MainScreen {
    private static int type;
    private static String nameDb;
    private static boolean isUserExit = false;
    private static Scanner sc = new Scanner(System.in);
    private static ArrayList<Students> students = null;
    private static ArrayList<Teachers> teachers = null;
    private static ArrayList<Workers> workers = null;
    public static void main(String[] args) {
        LoginScreen.Login(sc);
        selectingDataBase();
    }
    private static void setDt(){
        students = GetListStudents.getListDefault();
        teachers = GetListTeachers.getListDefault();
        workers = GetListWorkers.getListDefault();
    }
    private static void selectingDataBase(){
        System.out.println("\n1. Student \n2. Teacher \n3. Worker");
        type = Integer.parseInt(sc.nextLine());
        switch (type){
            default:
                if(isExist()){
                        System.out.print("Good bye!!");
                        break;
                }
                selectingDataBase();
                break;
            case 1:
                nameDb = "students";
                displayDefault();
                break;
            case 2:
                nameDb = "teachers";
                displayDefault();
                break;
            case 3:
                nameDb = "workers";
                displayDefault();
                break;
        }

    }
    private static void preScrip(){
        System.out.println("\n1. Add\n2. Sort By Name \n3. Sort By ID" +
                "\n4. Search By Name \n5. Search By Id \n6. Delete \n7. Edit \n8. Undo Delete" +
                "\n9. Undo Edit \n10. Refresh");
        int button = Integer.parseInt(sc.nextLine());
        Scrip(button);
    }
    private static void Scrip(int button){
        switch (button)
        {
            default:
                if(!isExist()){
                    preScrip();
                    break;
                }
                System.out.print("Good bye!!");
                break;
            case 1:
                AddScreen add = new AddScreen(nameDb, sc);
                displayDefault();
                break;
            case 2:
                displaySort(1);
                break;
            case 3:
                displaySort(2);
                break;
            case 4:
                System.out.print("Name person need to search: ");
                searchPersonByName(sc.nextLine());
                preScrip();
                break;
            case 5:
                System.out.print("ID person need to search: ");
                searchPersonByID(Integer.parseInt(sc.nextLine()));
                preScrip();
                break;
            case 6:
                System.out.print("ID person need to delete: ");
                int id = Integer.parseInt(sc.nextLine());
                deletePerson(id);

                break;
            case 7:
                System.out.print("ID person need to edit: ");
                EditScreen edit = new EditScreen(Integer.parseInt(sc.nextLine()), nameDb);
                displayDefault();
                break;
            case 8:
                undo(1);
                displayDefault();
                break;
            case 9:
                undo(2);
                displayDefault();
                break;
            case 10:
                setDt();
                displayDefault();
                break;
        }
    }
    private static void displayStudent(ArrayList<Students> students){
        for(Students st : students){
            System.out.println("ID: " + st.getId()+
                    "\nName: " + st.getName() +
                    "\nAge: " + st.getAge()+
                    "\nHome town: " + st.getHometown() +
                    "\nGPA: " + st.getGrades() +
                    "\nClass: " + st.getStudentClass() +
                    "\nMajor: " + st.getMajor() +"\n");
        }
        students.clear();
        preScrip();
    }
    private static void displayTeacher(ArrayList<Teachers> teachers){
        for(Teachers tch : teachers){
            System.out.println("ID: " + tch.getId()+
                    "\nName: " + tch.getName() +
                    "\nAge: " + tch.getAge()+
                    "\nHome town: " + tch.getHometown() +
                    "\nSubject: " + tch.getSubject() +
                    "\nDegree:: " + tch.getDegree() +
                    "\nSalary: " + tch.getSalary() +
                    "\nClass: " + tch.getTeacherClass() +"\n");
        }
        teachers.clear();
        preScrip();
    }
    private static void displayWorker(ArrayList<Workers> workers){
        for(Workers wk : workers){
            System.out.println("ID: " + wk.getId()+
                    "\nName: " + wk.getName() +
                    "\nAge: " + wk.getAge()+
                    "\nHome town: " + wk.getHometown() +
                    "\nWork at: " + wk.getLocation() +
                    "\nShift: " + wk.getShift() +
                    "\nSalary: " + wk.getSalary() + "\n");
        }
        workers.clear();
        preScrip();
    }
    private static void displayDefault(){
        setDt();
        switch (type){
            case 1:
                displayStudent(students);
                break;
            case 2:
                displayTeacher(teachers);
                break;
            case 3:
                displayWorker(workers);
                break;
        }
        preScrip();
    }
    private static void displaySort(int typeOfSort){
        if(typeOfSort == 1){
            switch (nameDb){
                case "students" :
                    displayStudent(SortBy.typeOfSort(new SortStudentByName()));
                    break;
                case "teachers":
                    displayTeacher(SortBy.typeOfSort(new SortTeacherByName()));
                    break;
                case "workers":
                    displayWorker(SortBy.typeOfSort(new SortWorkerByName()));
                    break;
            }
        }else {
            switch (nameDb){
                case "students" :
                    displayStudent(SortBy.typeOfSort(new SortStudentByID()));
                    break;
                case "teachers":
                    displayTeacher(SortBy.typeOfSort(new SortTeacherByID()));
                    break;
                case "workers":
                    displayWorker(SortBy.typeOfSort(new SortWorkerById()));
                    break;
            }
        }
    }
    private static void searchPersonByName(String name){
        Search search = null;
        switch (nameDb){
            case "students":
                search = new SearchStudents();
                displayStudent(search.searchByName(name));
            case "teachers":
                search = new SearchTeachers();
                displayTeacher(search.searchByName(name));
            case "workers":
                search = new SearchWorkers();
                displayWorker(search.searchByName(name));
        }
    }
    private static void searchPersonByID(int id){
        Search search = null;
        switch (nameDb){
            case "students":
                search = new SearchStudents();
                displayStudent(search.searchByID(id));
            case "teachers":
                search = new SearchTeachers();
                displayTeacher(search.searchByID(id));
            case "workers":
                search = new SearchWorkers();
                displayWorker(search.searchByID(id));
        }
    }
    private static void deletePerson(int id){
        switch (nameDb){
            case "students":
                DeleteStudent.delete(id);
                displayDefault();
                break;
            case "teachers":
                DeleteTeacher.delete(id);
                displayDefault();
                break;
            case "workers":
                DeleteWorker.delete(id);
                displayDefault();
                break;
        }
    }
    private static boolean isExist(){
        System.out.println("Do you really want to exit?\n (Y)Yes & (N)No");
        if (sc.nextLine().trim().equals("y")){
                return true;
        }
        return false;
    }
    private static void undo(int typeUndo){
        switch (nameDb){
            case "students":
                StudentHistory.undo(typeUndo);
                break;
            case "teachers":
                TeacherHistory.undo(typeUndo);
                break;
            case "workers":
                WorkerHistory.undo(typeUndo);
                break;
        }
    }
}
