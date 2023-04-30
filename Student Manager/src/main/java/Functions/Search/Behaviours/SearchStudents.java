package Functions.Search.Behaviours;

import Connector.Students.GetListStudents;
import Functions.Search.Search;
import Object.Management.Students;

import java.util.ArrayList;

public class SearchStudents extends Search {
    private ArrayList<Students> students = new ArrayList<Students>();
    @Override
    public ArrayList searchByName(String name) {
        return GetListStudents.getListByName(name);
    }
    @Override
    public ArrayList searchByID(int id) {
        return GetListStudents.getListByID(id);
    }
    public ArrayList searchByGPA(double gpa) {
        return GetListStudents.getListByGPA(gpa);
    }
}
