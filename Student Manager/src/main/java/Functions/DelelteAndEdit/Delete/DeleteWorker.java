package Functions.DelelteAndEdit.Delete;

import Connector.Workers.GetListWorkers;
import Functions.DelelteAndEdit.History.WorkerHistory;

public class DeleteWorker {
    public static void delete(int id) {
        WorkerHistory.setStep(1, GetListWorkers.getWorkerByID(id));
        Connector.Workers.DeleteWorker.delete(id);
    }
    public static void undo(){
        WorkerHistory.undo(1);
    }
}
