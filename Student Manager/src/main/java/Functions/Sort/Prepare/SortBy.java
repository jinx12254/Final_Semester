package Functions.Sort.Prepare;

import Functions.Sort.Prepare.Sort;

import java.util.ArrayList;

public class SortBy {

    public static ArrayList typeOfSort(Sort sortType){
        if (sortType == null){
            return sortType.sort(1);
        }
        return sortType.sort(2);
    }
}
