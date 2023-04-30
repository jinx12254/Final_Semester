package Functions.Sort.Behaviours.SortStudent;

import Connector.Students.GetListStudents;
import Functions.Sort.Prepare.Sort;

import java.util.ArrayList;

public class SortStudentByID implements Sort {
    @Override
    public ArrayList sort(int type) {
        return GetListStudents.sortByID(type);
    }
}
