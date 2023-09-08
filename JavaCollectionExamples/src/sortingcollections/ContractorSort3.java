package sortingcollections;

import java.util.*;

public class ContractorSort3 {

    public static void main(String[] args) {
        Contractor a= new Contractor("c","Erzincan","123");
        Contractor b =new Contractor("f","Erzincan","123");
        Contractor c= new Contractor("a","Erzincan","123");
        Contractor d = new Contractor("b","Istanbul","235");
        Contractor e= new Contractor("a", "Ankara","445");
        List<Contractor> arrayList = new ArrayList<>();
        arrayList.add(a);
        arrayList.add(b);
        arrayList.add(c);
        arrayList.add(d);
        arrayList.add(e);
        ComparatorSortName csn = new ComparatorSortName();
        Collections.sort(arrayList,csn);
        int count =0;
        for (Contractor contractor : arrayList) {
            System.out.println(count++ +" "+contractor.getName()+" "+contractor.getLocation()+" "+contractor.getOwner());
        }
        ComparatorSortLocation csl = new ComparatorSortLocation();
        Collections.sort(arrayList,csl);
        count =0;
        for (Contractor contractor : arrayList) {
            System.out.println(count++ +" "+contractor.getName()+" "+contractor.getLocation()+" "+contractor.getOwner());
        }
        ComparatorSortOwner cso= new ComparatorSortOwner();
        Collections.sort(arrayList,cso);
        count =0;
        for (Contractor contractor : arrayList) {
            System.out.println(count++ +" "+contractor.getName()+" "+contractor.getLocation()+" "+contractor.getOwner());
        }
    }

}
