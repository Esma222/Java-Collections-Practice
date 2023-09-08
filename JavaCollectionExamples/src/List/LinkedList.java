package List;

import java.util.List;

public class LinkedList {

    public static void main(String[] args) {

        List<Object> linkedList = new java.util.LinkedList<>();
        String s= "one";
        linkedList.add(s);
        linkedList.add(123);
        linkedList.add(s);
        linkedList.add("two");
        linkedList.add(s+s);
        System.out.println("size of linkedlist is : "+linkedList.size());
        System.out.println("linkedlist contains :"+linkedList);
        linkedList.add(2,223);

        System.out.println("size of linkedlist is : "+linkedList.size());
        System.out.println("linkedlist contains :"+linkedList);


    }

}
