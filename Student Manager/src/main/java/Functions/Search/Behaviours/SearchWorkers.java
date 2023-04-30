package Functions.Search.Behaviours;

import Connector.Workers.GetListWorkers;
import Functions.Search.Search;
import Object.Management.Teachers;
import Object.Management.Workers;

import java.util.ArrayList;

public class SearchWorkers extends Search {
    @Override
    public ArrayList searchByName(String name) {
        return GetListWorkers.getListByName(name);
    }
    @Override
    public ArrayList searchByID(int id) {
        return GetListWorkers.getListByID(id);
    }
}
