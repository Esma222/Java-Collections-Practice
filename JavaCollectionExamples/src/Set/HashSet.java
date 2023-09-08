package Set;

import java.util.*;

public class HashSet {
    public static void main(String[] args) {// sırasız olarak çıktı verir

        Set<String> hs = new java.util.HashSet<>();
        String s ="one";
        hs.add(s);
        hs.add("two");
        hs.add("bb");
        hs.add("aa");
        hs.add(s+s);
        System.out.println("Hashset size is : "+ hs.size());
        for(String element: hs){
            System.out.println(element);
        }
        hs.remove(s);
        System.out.println(hs.contains(s));
        System.out.println("Hashset size is : "+ hs.size());
        for(String element: hs){
            System.out.println(element);
        }
        System.out.println(hs.isEmpty());
        hs.clear();
        System.out.println(hs.isEmpty());

    }
}
