package List;

import java.util.List;

public class ArrayList {

    public static void main(String[] args) {

        List<Object> arrayList = new java.util.ArrayList<>();
        String s= "one";
        arrayList.add(s);
        arrayList.add(123);
        arrayList.add(s);
        arrayList.add("two");
        arrayList.add(s+s);
        System.out.println("size of arraylist is : "+arrayList.size());
        for (Object element : arrayList){
            System.out.println(element);
        }
        arrayList.add(2,223);
        arrayList.remove(4);
        System.out.println("size of arraylist is : "+arrayList.size());
        System.out.println("first occurrence of s : "+arrayList.indexOf(s));
        System.out.println("last occurrence of s : "+arrayList.lastIndexOf(s));
        for (Object element : arrayList){
            System.out.println(element);
        }

    }

}
