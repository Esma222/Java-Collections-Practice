package Set;

import java.util.Objects;
import java.util.Set;

public class TreeSet {

    public static void main(String[] args) {//sıralayıp öyle çıktı verir
        Set<Object> treeset = new java.util.TreeSet<>();
        String s="one";
        treeset.add(s);
        treeset.add("two");
        treeset.add("bb");
        treeset.add("aa");
        //treeset.add(123);//error
        treeset.add(s+s);
        System.out.println("Set.TreeSet size is: "+treeset.size());
        for (Object element : treeset){
            System.out.println(element);
        }
        treeset.remove(s);
        for (Object element : treeset){
            System.out.println(element);
        }
        System.out.println(treeset.isEmpty());
        treeset.clear();
        System.out.println(treeset.isEmpty());


    }

}
