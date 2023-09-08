package Map;

import java.util.Map;

public class LinkedHashMap {//eklenme sırasıyla çıktı verir.
    public static void main(String[] args) {
        Map<String, String> linkedHashMap = new java.util.LinkedHashMap<>();

        linkedHashMap.put("hello","hello");
        linkedHashMap.put("hi","good");
        linkedHashMap.put("yes","map");
        linkedHashMap.put("no","hii");
        System.out.println("hashmap size is :"+linkedHashMap.size());
        System.out.println("hashmap contains :"+linkedHashMap);
        linkedHashMap.remove("yes");
        System.out.println(linkedHashMap.containsKey("yes"));
        System.out.println("hashmap size is :"+linkedHashMap.size());
        System.out.println("hashmap contains :"+linkedHashMap);

        System.out.println("Entry Set : "+linkedHashMap.entrySet());
        System.out.println("Key Set : "+linkedHashMap.keySet());
        System.out.println("Vales : "+linkedHashMap.values());
        for (Map.Entry<String, String> map : linkedHashMap.entrySet()) {
            map.setValue("aaa");
        }

        System.out.println(linkedHashMap.entrySet());
    }
}
