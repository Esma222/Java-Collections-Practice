package Map;

import java.util.Map;

public class TreeMap {//sıralı çıktı verir.
    public static void main(String[] args) {
        Map<String, String> treeMap = new java.util.TreeMap<>();

        treeMap.put("hello","hello");
        treeMap.put("hi","good");
        treeMap.put("yes","map");
        treeMap.put("no","hii");
         // treeMap.put(2,"last");//ERROR
        System.out.println("hashmap size is :"+treeMap.size());
        System.out.println("hashmap contains :"+treeMap);
        treeMap.remove("yes");
        System.out.println(treeMap.containsKey("yes"));
        System.out.println("hashmap size is :"+treeMap.size());
        System.out.println("hashmap contains :"+treeMap);

        System.out.println("Entry Set : "+treeMap.entrySet());
        System.out.println("Key Set : "+treeMap.keySet());
        System.out.println("Vales : "+treeMap.values());
        for (Map.Entry<String, String> map : treeMap.entrySet()) {
            map.setValue("aaa");
        }

        System.out.println(treeMap.entrySet());
    }
}
