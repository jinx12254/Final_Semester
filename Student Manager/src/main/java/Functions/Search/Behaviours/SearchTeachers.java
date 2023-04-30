package Functions.Search.Behaviours;

import Connector.Teachers.GetListTeachers;
import Functions.Search.Search;
import Object.Management.Students;
import Object.Management.Teachers;

import java.util.ArrayList;

public class SearchTeachers extends Search {
    @Override
    public ArrayList searchByName(String name) {
        return GetListTeachers.getListByName(name);
    }

    @Override
    public ArrayList searchByID(int id) {
        return GetListTeachers.getListByID(id);
    }
}
