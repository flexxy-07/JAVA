package Collections;
import java.util.*;

public class A1 {
    public static void main(String[] args) {
        ArrayList list = new ArrayList<>();
        list.add("Ranger");
        list.add(10);
        list.add(15);
        list.add(10);
        list.add(10);
        list.add(10);
        list.add(10);
        System.out.println(list);
      //  list.removeAll(Collections.singleton(10));

        list.removeIf(e -> e.equals("Ranger"));
        System.out.println(list);

        List<Integer> numbers = List.of(1,2,3,4,5,6);
        numbers.add(9);; // Unsupported Operation Exception
        System.out.println(numbers);

    }
}
