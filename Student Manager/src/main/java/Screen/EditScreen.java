package Screen;

import Functions.DelelteAndEdit.Edit.EditStudent;
import Functions.DelelteAndEdit.Edit.EditTeacher;
import Functions.DelelteAndEdit.Edit.EditWorker;
import Object.Management.Students;
import Object.Management.Teachers;
import Object.Management.Workers;

import java.util.Scanner;

public class EditScreen {
    private int id;
    private String nameDb;
    private Scanner sc = new Scanner(System.in);
    private String basic = "0. All \n1. Name \n2. Age\n3. Home town";
    private String student = "\n4. Major \n5. Class \n6. Grades";
    private String teacher = "\n4. Subject \n5. Class \n6. Salary \n7. Degree";
    private String worker = "\n4. Location \n5. Shift \n6. Salary";
    public EditScreen(int id, String nameDb) {
        this.id = id;
        this.nameDb = nameDb;
        display();
    }
    private void display(){
        switch (nameDb){
            case "students":
                System.out.println(basic + student);
                editValue(Integer.parseInt(sc.nextLine()));
                break;
            case "teachers":
                System.out.println(basic + teacher);
                editValue(Integer.parseInt(sc.nextLine()));
                break;
            case "workers":
                System.out.println(basic + worker);
                editValue(Integer.parseInt(sc.nextLine()));
                break;
        }
    }
    private void editValue(int index){
        switch (nameDb){
            case "students":
                switch (index){
                    case 0:
                        editStudent();
                        break;
                    case 1:
                        editName(1);
                        break;
                    case 2:
                        editAge(1);
                        break;
                    case 3:
                        editHometown(1);
                        break;
                    case 4:
                        System.out.print("Major: ");
                        EditStudent.editStudentMajor(id, sc.nextLine());
                        break;
                    case 5:
                        editClass(1);
                        break;
                    case 6:
                        System.out.print("Grades: ");
                        EditStudent.editStudentGPA(id, Double.parseDouble(sc.nextLine()));
                        break;
                }
                break;
            case "teachers":
                switch (index){
                    case 0:
                        editTeacher();
                        break;
                    case 1:
                        editName(2);
                        break;
                    case 2:
                        editAge(2);
                        break;
                    case 3:
                        editHometown(2);
                        break;
                    case 4:
                        System.out.print("Subject: ");
                        EditTeacher.editTeacherSubject(id, sc.nextLine());
                        break;
                    case 5:
                        editClass(2);
                        break;
                    case 6:
                        editSalary(1);
                        break;
                    case 7:
                        System.out.print("Degree: ");
                        EditTeacher.editTeacherDegree(id, sc.nextLine());
                        break;
                }
                break;
            case "workers":
                switch (index){
                    case 0:
                        editWorker();
                        break;
                    case 1:
                        editName(3);
                        break;
                    case 2:
                        editAge(3);
                        break;
                    case 3:
                        editHometown(3);
                        break;
                    case 4:
                        System.out.print("Location: ");
                        EditWorker.editWorkerLocation(id, sc.nextLine());
                        break;
                    case 5:
                        System.out.print("Shift: ");
                        EditWorker.editWorkerShift(id, sc.nextLine());
                        break;
                    case 6:
                        editSalary(2);
                        break;
                }
                break;
        }
    }
    private void editStudent(){
        Students students = new Students();
        students.setId(id);

        System.out.print("Name: ");
        students.setName(sc.nextLine());

        System.out.print("Age: ");
        students.setAge(Integer.parseInt(sc.nextLine()));

        System.out.print("Home town:");
        students.setHometown(sc.nextLine());

        System.out.print("Major: ");
        students.setMajor(sc.nextLine());

        System.out.print("Class: " );
        students.setStudentClass(sc.nextLine());

        System.out.print("Grades: ");
        students.setGrades(Double.parseDouble(sc.nextLine()));

        EditStudent.editStudent(students);
    }
    private void editTeacher(){
        Teachers teachers = new Teachers();

        teachers.setId(id);

        System.out.print("Name: ");
        teachers.setName(sc.nextLine());

        System.out.print("Age: ");
        teachers.setAge(Integer.parseInt(sc.nextLine()));

        System.out.print("Home town: ");
        teachers.setHometown(sc.nextLine());

        System.out.print("Subject: ");
        teachers.setSubject(sc.nextLine());

        System.out.print("Class: ");
        teachers.setTeacherClass(sc.nextLine());

        System.out.print("Degree: ");
        teachers.setDegree(sc.nextLine());

        System.out.print("Salary: ");
        teachers.setSalary(Integer.parseInt(sc.nextLine()));

        EditTeacher.editTeacher(teachers);
    }
    private void editWorker(){
        Workers workers = new Workers();

        workers.setId(id);

        System.out.println("Name: ");
        workers.setName(sc.nextLine());

        System.out.println("Age: ");
        workers.setAge(Integer.parseInt(sc.nextLine()));

        System.out.println("Hometown: ");
        workers.setHometown(sc.nextLine());

        System.out.println("Location: ");
        workers.setLocation(sc.nextLine());

        System.out.println("Shift: ");
        workers.setShift(sc.nextLine());

        System.out.println("Salary: ");
        workers.setSalary(Integer.parseInt(sc.nextLine()));

        EditWorker.editWorkers(workers);
    }
    private void editName(int type){
        System.out.print("Name: ");
        switch (type){
            case 1:
                EditStudent.editStudentName(id, sc.nextLine());
                break;
            case 2:
                EditTeacher.editTeacherName(id, sc.nextLine());
                break;
            case 3:
                EditWorker.editWorkerName(id, sc.nextLine());
                break;
        }
    }
    private void editAge(int type){
        System.out.print("Age: ");
        switch (type){
            case 1:
                EditStudent.editStudentAge(id, Integer.parseInt(sc.nextLine()));
                break;
            case 2:
                EditTeacher.editTeacherAge(id, Integer.parseInt(sc.nextLine()));
                break;
            case 3:
                EditWorker.editWorkerAge(id, Integer.parseInt(sc.nextLine()));
                break;
        }
    }
    private void editHometown(int type){
        System.out.print("Hometown: ");
        switch (type){
            case 1:
                EditStudent.editStudentHometown(id, sc.nextLine());
                break;
            case 2:
                EditTeacher.editTeacherHometown(id, sc.nextLine());
                break;
            case 3:
                EditWorker.editWorkerHometown(id, sc.nextLine());
                break;
        }
    }
    private void editSalary(int type){
        System.out.print("Salary: ");
        switch (type){
            case 1:
                EditTeacher.editTeacherSalary(id, Integer.parseInt(sc.nextLine()));
                break;
            case 3:
                EditWorker.editWorkerSalary(id, Integer.parseInt(sc.nextLine()));
                break;
        }
    }
    private void editClass(int type){
        System.out.print("Class: ");
        switch (type){
            case 1:
                EditStudent.editStudentClass(id, sc.nextLine());
                break;
            case 3:
                EditTeacher.editTeacherClass(id, sc.nextLine());
                break;
        }
    }
}
