package Functions.DelelteAndEdit.Delete;

import Connector.Students.AddStudent;
import Connector.Students.GetListStudents;
import Functions.DelelteAndEdit.History.StudentHistory;
import Object.Management.Students;

public class DeleteStudent {
    public static void delete(int id) {
        StudentHistory.setStep(1, GetListStudents.getStudentByID(id));
        Connector.Students.DeleteStudent.delete(id);
    }

    public static void undo() {
        StudentHistory.undo(1);
    }
}
