package Functions.Sort.Behaviours.Sortworker;

import Connector.Workers.GetListWorkers;
import Functions.Sort.Prepare.Sort;

import java.util.ArrayList;

public class SortWorkerByName implements Sort {
    @Override
    public ArrayList sort(int type){
        return GetListWorkers.sortByName(type);
    }
}
