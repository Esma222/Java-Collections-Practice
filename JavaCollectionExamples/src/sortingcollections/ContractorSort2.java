package sortingcollections;

import java.util.*;

public class ContractorSort2 {

    public static void main(String[] args) {
        Contractor a= new Contractor();
        Contractor b =new Contractor();
        Contractor c= new Contractor("Esma","Erzincan","123");
        Contractor d = new Contractor("Nisa","Istanbul","235");
        Contractor e= new Contractor("Esma", "Erzincan","445");
        List<Contractor> arrayList = new ArrayList<>();
        arrayList.add(a);
        arrayList.add(b);
        arrayList.add(c);
        arrayList.add(d);
        arrayList.add(e);
        //Collections.sort(arrayList);
        for (Contractor contractor : arrayList) {
            System.out.println(contractor.getName()+" "+contractor.getLocation()+" "+contractor.getOwner());
        }
    }

}
