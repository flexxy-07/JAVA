package Collections;
import java.util.*;

public class A {
    public static void main(String[] args) {
        ArrayList list = new ArrayList<>();
        list.add("Camel");
        list.add(false);
        list.add(1);

        //System.out.println(list);
        for (Object val : list){
            System.out.println(val);
        }
        for (int i = 0; i < list.size(); i++) {
            System.out.print(list.get(i) +  " ");
        }
    }

    // list1.add(list2) add the list2 as sublist;
    // list1.addAll(list2) add all the elements of the list2 in the list 1;
}
