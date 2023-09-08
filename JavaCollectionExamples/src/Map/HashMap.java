package Map;

import java.util.Map;

public class HashMap {
    public static void main(String[] args) {//karışık-sırasız çıktı verir.
        Map<String, String> hashMap = new java.util.HashMap<>();

        hashMap.put("hello","hello");
        hashMap.put("hi","good");
        hashMap.put("yes","map");
        hashMap.put("no","hii");
        System.out.println("hashmap size is :"+hashMap.size());
        System.out.println("hashmap contains :"+hashMap);
        hashMap.remove("yes");
        System.out.println(hashMap.containsKey("yes"));
        System.out.println("hashmap size is :"+hashMap.size());
        System.out.println("hashmap contains :"+hashMap);

        System.out.println("Entry Set : "+hashMap.entrySet());
        System.out.println("Key Set : "+hashMap.keySet());
        System.out.println("Vales : "+hashMap.values());
        for (Map.Entry<String, String> map : hashMap.entrySet()) {
            map.setValue("aaa");
        }

        System.out.println(hashMap.entrySet());
    }
}
