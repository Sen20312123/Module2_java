package DSA$DanhSach;

import java.util.ArrayList;
import java.util.Arrays;

public class MyListTest {
    public static void main(String[] args) {
//        MyList<Integer> listInteger = new MyList<Integer>();
////        ArrayList<Integer> name = new ArrayList<>();
//        listInteger.add(1);
//        listInteger.add(2);
//        listInteger.add(3);
//        listInteger.add(3);
//        listInteger.add(4);
//        listInteger.addElement(1);
//        listInteger.addElement(2);
//        listInteger.addElement(3);
//        listInteger.addElement(3);

        MyList<Integer> name = new MyList<Integer>(5);
        name.add(1);
        name.add(2);
        name.add(3);

        System.out.println(name);
        name.addIndex(15 , 1);
        System.out.println(name);




//        MyList<Integer> name = new MyList<Integer>(12);
//        name.add(1);
//        name.add(2);
//        System.out.println(name);
////        System.out.println("element 4: "+listInteger.toString());
////        System.out.println("element 1: "+listInteger.get(2));
////        System.out.println("element 2: "+listInteger.get(2));
//        System.out.println(name.clone());
    }
}
