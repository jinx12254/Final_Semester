package Functions.DelelteAndEdit.Edit;

import Connector.Students.GetListStudents;
import Connector.Teachers.GetListTeachers;
import Functions.DelelteAndEdit.History.StudentHistory;
import Functions.DelelteAndEdit.History.TeacherHistory;
import Object.Management.Teachers;

public class EditTeacher {
    public static void editTeacher(Teachers teachers){
        TeacherHistory.setStep(2, GetListTeachers.getTeacherByID(teachers.getId()));
        Connector.Teachers.EditTeacher.editTeacher(teachers);
    }
    public static void editTeacherName(int id, String name) {
        TeacherHistory.setStep(2, GetListTeachers.getTeacherByID(id));
        Connector.Teachers.EditTeacher.editTeacherName(id, name);
    }
    public static void editTeacherAge(int id, int age) {
        TeacherHistory.setStep(2, GetListTeachers.getTeacherByID(id));
        Connector.Teachers.EditTeacher.editTeacherAge(id, age);
    }
    public static void editTeacherHometown(int id, String hometown) {
        TeacherHistory.setStep(2, GetListTeachers.getTeacherByID(id));
        Connector.Teachers.EditTeacher.editTeacherHometown(id, hometown);
    }
    public static void editTeacherSubject(int id, String subject) {
        TeacherHistory.setStep(2, GetListTeachers.getTeacherByID(id));
        Connector.Teachers.EditTeacher.editTeacherSubject(id, subject);
    }
    public static void editTeacherDegree(int id, String degree) {
        TeacherHistory.setStep(2, GetListTeachers.getTeacherByID(id));
        Connector.Teachers.EditTeacher.editTeacherDegree(id, degree);
    }
    public static void editTeacherClass(int id, String teacherClass) {
        TeacherHistory.setStep(2, GetListTeachers.getTeacherByID(id));
        Connector.Teachers.EditTeacher.editTeacherClass(id, teacherClass);
    }
    public static void editTeacherSalary(int id, int salary) {
        TeacherHistory.setStep(2, GetListTeachers.getTeacherByID(id));
        Connector.Teachers.EditTeacher.editTeacherSalary(id, salary);
    }
}
