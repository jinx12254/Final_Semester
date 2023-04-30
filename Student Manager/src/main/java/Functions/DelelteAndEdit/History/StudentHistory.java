package Functions.DelelteAndEdit.History;

import Connector.Students.AddStudent;
import Connector.Students.EditStudent;
import Object.Management.Students;

import java.util.Stack;

public class StudentHistory {
    private static Stack<Students> undoDelete = new Stack<Students>();
    private static Stack<Students> undoEdit = new Stack<Students>();
    public static void setStep(int step,Students students){
        switch (step){
            case 1:
                undoDelete.push(students);
                break;
            case 2:
                undoEdit.push(students);
                break;
        }
    }

    public static void undo(int step){
        Students students = null;
        switch (step){
            case 1:
                students = undoDelete.pop();
                AddStudent.add(students);
                students = null;
                break;
            case 2:
                students = undoEdit.pop();
                EditStudent.editStudents(students);
                students = null;
                break;
        }
    }
}
