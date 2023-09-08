package sortingcollections;

import java.util.Set;
import java.util.TreeSet;

public class ContractorSort {

    public static void main(String[] args) {
        Contractor a= new Contractor();
        Contractor b =new Contractor();
        Contractor c= new Contractor("Esma","Erzincan","123");
        Contractor d = new Contractor("Nisa","Istanbul","235");
        Contractor e= new Contractor("Esma", "Erzincan","445");
        Set<Contractor> treeSet = new TreeSet<>();
        treeSet.add(a);
        treeSet.add(b);
        treeSet.add(c);
        treeSet.add(d);
        treeSet.add(e);
        for (Contractor contractor : treeSet) {
            System.out.println(contractor.getName()+" "+contractor.getLocation()+" "+contractor.getOwner());
        }
    }

}
