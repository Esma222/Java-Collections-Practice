package List;

import java.util.List;

public class Vector {// elemanlar eklendiği sırayla output verir

    public static void main(String[] args) {

        List<Object> vector = new java.util.Vector<>();
        String s= "one";
        vector.add(s);
        vector.add(123);
        vector.add(s);
        vector.add("two");
        vector.add(s+s);
        System.out.println("size of arraylist is : "+vector.size());
        for (Object element : vector){
            System.out.println(element);
        }
        vector.add(2,223);
        vector.remove(4);
        System.out.println("size of vector is : "+vector.size());
        System.out.println("first occurrence of s : "+vector.indexOf(s));
        System.out.println("last occurrence of s : "+vector.lastIndexOf(s));
        for (Object element : vector){
            System.out.println(element);
        }

    }

}
