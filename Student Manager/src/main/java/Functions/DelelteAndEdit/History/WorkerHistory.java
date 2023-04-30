package Functions.DelelteAndEdit.History;

import Connector.Students.AddStudent;
import Connector.Students.EditStudent;
import Connector.Workers.AddWorker;
import Connector.Workers.EditWorker;
import Object.Management.Students;
import Object.Management.Workers;

import java.util.Stack;

public class WorkerHistory {
    private static Stack<Workers> undoDelete = new Stack<Workers>();
    private static Stack<Workers> undoEdit = new Stack<Workers>();
    public static void setStep(int step,Workers workers){
        switch (step){
            case 1:
                undoDelete.push(workers);
                break;
            case 2:
                undoEdit.push(workers);
                break;
        }
    }

    public static void undo(int step){
        Workers workers = null;
        switch (step){
            case 1:
                workers = undoDelete.pop();
                AddWorker.add(workers);
                workers = null;
                break;
            case 2:
                workers = undoEdit.pop();
                EditWorker.editWorker(workers);
                workers = null;
                break;
        }
    }
}
