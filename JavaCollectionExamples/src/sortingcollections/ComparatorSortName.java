package sortingcollections;

import java.util.*;

public class ComparatorSortName implements Comparator<Contractor> {

    public int compare(Contractor a, Contractor b) {
        return a.getName().compareTo(b.getName());
    }
}
 class ComparatorSortLocation implements Comparator<Contractor> {

    public int compare(Contractor a, Contractor b){
        return a.getLocation().compareTo(b.getLocation());
    }
}
 class ComparatorSortOwner implements Comparator<Contractor> {

    public int compare(Contractor a, Contractor b){
        return a.getOwner().compareTo(b.getOwner());
    }
}