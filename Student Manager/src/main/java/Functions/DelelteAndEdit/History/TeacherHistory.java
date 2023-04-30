package Functions.DelelteAndEdit.History;

import Connector.Students.AddStudent;
import Connector.Students.EditStudent;
import Connector.Teachers.AddTeacher;
import Connector.Teachers.EditTeacher;
import Object.Management.Students;
import Object.Management.Teachers;

import java.util.Stack;

public class TeacherHistory {
    private static Stack<Teachers> undoDelete = new Stack<Teachers>();
    private static Stack<Teachers> undoEdit = new Stack<Teachers>();
    public static void setStep(int step,Teachers teachers){
        switch (step){
            case 1:
                undoDelete.push(teachers);
                break;
            case 2:
                undoEdit.push(teachers);
                break;
        }
    }

    public static void undo(int step){
        Teachers teachers = null;
        switch (step){
            case 1:
                teachers = undoDelete.pop();
                AddTeacher.add(teachers);
                teachers = null;
                break;
            case 2:
                teachers = undoEdit.pop();
                EditTeacher.editTeacher(teachers);
                teachers = null;
                break;
        }
    }
}
