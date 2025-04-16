import java.util.ArrayList;

public class LinkedListProblem7 {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        list.add("Java");
        list.add("Python");

        ArrayList<String> list2 = new ArrayList<>();
        list2.add("C");
        list2.add("C++");

        list.addAll(list2);
        System.out.println(list);
        System.out.println(list2);
    }
}
