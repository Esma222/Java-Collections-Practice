package Set;

import java.util.*;

public class LinkedHashSet {///çıktı sıralaması ekleme sıralamasıyla aynı olur
    public static void main(String[] args) {

        Set<String> hs = new java.util.LinkedHashSet<>();
        String s ="one";
        hs.add(s);
        hs.add("two");
        hs.add(s+s);
        System.out.println("LinkedHashset size is : "+ hs.size());
        for(String element: hs){
            System.out.println(element);
        }
        hs.remove(s);
        System.out.println(hs.contains(s));
        System.out.println("LinkedHashset size is : "+ hs.size());
        for(String element: hs){
            System.out.println(element);
        }
        System.out.println(hs.isEmpty());
        hs.clear();
        System.out.println(hs.isEmpty());

    }
}
