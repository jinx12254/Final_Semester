package Functions.Sort.Prepare;

import Connector.Students.GetListStudents;
import Connector.Teachers.GetListTeachers;
import Connector.Workers.GetListWorkers;
import Object.Management.Students;
import Object.Management.Teachers;
import Object.Management.Workers;

import java.util.ArrayList;

public interface Sort {
    public abstract ArrayList sort(int type);
}
