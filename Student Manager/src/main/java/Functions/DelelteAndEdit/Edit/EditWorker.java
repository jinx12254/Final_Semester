package Functions.DelelteAndEdit.Edit;

import Connector.Students.GetListStudents;
import Connector.Workers.GetListWorkers;
import Functions.DelelteAndEdit.History.StudentHistory;
import Functions.DelelteAndEdit.History.WorkerHistory;
import Object.Management.Workers;

public class EditWorker {
    public static void editWorkers(Workers workers){
        WorkerHistory.setStep(2, GetListWorkers.getWorkerByID(workers.getId()));
        Connector.Workers.EditWorker.editWorker(workers);
    }
    public static void editWorkerName(int id, String name) {
        WorkerHistory.setStep(2, GetListWorkers.getWorkerByID(id));
        Connector.Workers.EditWorker.editWorkerName(id, name);
    }
    public static void editWorkerAge(int id, int age) {
        WorkerHistory.setStep(2, GetListWorkers.getWorkerByID(id));
        Connector.Workers.EditWorker.editWorkerAge(id, age);
    }
    public static void editWorkerHometown(int id, String hometown) {
        WorkerHistory.setStep(2, GetListWorkers.getWorkerByID(id));
        Connector.Workers.EditWorker.editWorkerHometown(id, hometown);
    }
    public static void editWorkerLocation(int id, String location) {
        WorkerHistory.setStep(2, GetListWorkers.getWorkerByID(id));
        Connector.Workers.EditWorker.editWorkerLocation(id, location);
    }
    public static void editWorkerSalary(int id, int salary) {
        WorkerHistory.setStep(2, GetListWorkers.getWorkerByID(id));
        Connector.Workers.EditWorker.editWorkerSalary(id, salary);
    }
    public static void editWorkerShift(int id, String shift) {
        WorkerHistory.setStep(2, GetListWorkers.getWorkerByID(id));
        Connector.Workers.EditWorker.editWorkerShift(id, shift);
    }
}
