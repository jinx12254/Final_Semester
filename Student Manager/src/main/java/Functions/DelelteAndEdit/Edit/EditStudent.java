package Functions.DelelteAndEdit.Edit;

import Connector.Students.GetListStudents;
import Functions.DelelteAndEdit.History.StudentHistory;
import Object.Management.Students;

public class EditStudent{
    public static void editStudent(Students students){
        StudentHistory.setStep(2, GetListStudents.getStudentByID(students.getId()));
        Connector.Students.EditStudent.editStudents(students);
    }
    public static void editStudentName(int id, String name) {
        StudentHistory.setStep(2, GetListStudents.getStudentByID(id));
        Connector.Students.EditStudent.editStudentName(id, name);
    }
    public static void editStudentAge(int id, int age) {
        StudentHistory.setStep(2, GetListStudents.getStudentByID(id));
        Connector.Students.EditStudent.editStudentAge(id, age);
    }
    public static void editStudentHometown(int id, String hometown) {
        StudentHistory.setStep(2, GetListStudents.getStudentByID(id));
        Connector.Students.EditStudent.editStudentHometown(id, hometown);
    }
    public static void editStudentGPA(int id, double gpa) {
        StudentHistory.setStep(2, GetListStudents.getStudentByID(id));
        Connector.Students.EditStudent.editStudentGPA(id, gpa);
    }
    public static void editStudentClass(int id, String studentClass) {
        StudentHistory.setStep(2, GetListStudents.getStudentByID(id));
        Connector.Students.EditStudent.editStudentClass(id, studentClass);
    }
    public static void editStudentMajor(int id, String major) {
        StudentHistory.setStep(2, GetListStudents.getStudentByID(id));
        Connector.Students.EditStudent.editStudentMajor(id, major);
    }
}
