package Functions.Sort.Behaviours.SortTeacher;

import Connector.Teachers.GetListTeachers;
import Functions.Sort.Prepare.Sort;

import java.util.ArrayList;

public class SortTeacherByID implements Sort {
    @Override
    public ArrayList sort(int type) {
        return GetListTeachers.sortByID(type);
    }

}
