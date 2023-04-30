package Functions.Sort.Behaviours.SortTeacher;

import Connector.Teachers.GetListTeachers;
import Functions.Sort.Prepare.Sort;

import java.util.ArrayList;

public class SortTeacherByName implements Sort {
    @Override
    public ArrayList sort(int type) {
        return GetListTeachers.sortByName(type);
    }
}
