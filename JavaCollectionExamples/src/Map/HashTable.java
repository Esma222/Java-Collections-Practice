package Map;

import java.util.Hashtable;
import java.util.Map;

public class HashTable {
    public static void main(String[] args) {//karışık-sırasız çıktı verir.
        Map<String, String> hashTable = new Hashtable<>();

        hashTable.put("hello","hello");
        hashTable.put("hi","good");
        hashTable.put("yes","map");
        hashTable.put("no","hii");
        System.out.println("hashmap size is :"+hashTable.size());
        System.out.println("hashmap contains :"+hashTable);
        hashTable.remove("yes");
        System.out.println(hashTable.containsKey("yes"));
        System.out.println("hashmap size is :"+hashTable.size());
        System.out.println("hashmap contains :"+hashTable);

        System.out.println("Entry Set : "+hashTable.entrySet());
        System.out.println("Key Set : "+hashTable.keySet());
        System.out.println("Vales : "+hashTable.values());
        for (Map.Entry<String, String> map : hashTable.entrySet()) {
            map.setValue("aaa");
        }

        System.out.println( hashTable.hashCode());
        System.out.println(hashTable.entrySet());
    }
}
