package Functions.DelelteAndEdit.Delete;

import Connector.Teachers.GetListTeachers;
import Functions.DelelteAndEdit.History.TeacherHistory;
import Object.Management.Teachers;

public class DeleteTeacher {
    public static void delete(int id) {
        TeacherHistory.setStep(1, GetListTeachers.getTeacherByID(id));
        Connector.Teachers.DeleteTeacher.delete(id);
    }
    public static void undo(){
        TeacherHistory.undo(1);
    }
}
