package Functions.Search;

import Connector.Students.GetListStudents;
import Connector.Teachers.GetListTeachers;
import Connector.Workers.GetListWorkers;
import Object.Management.Students;
import Object.Management.Teachers;
import Object.Management.Workers;

import java.util.ArrayList;

public abstract class Search {
    protected static ArrayList<Students> listStudents = null;
    protected static ArrayList<Teachers> listTeachers = null;
    protected static ArrayList<Workers> listWorkers = null;
    public abstract ArrayList searchByName(String name);
    public abstract ArrayList searchByID(int id);
}
