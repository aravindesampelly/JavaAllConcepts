
import java.util.ArrayList;
import java.util.Collections;

public class ArrayListProblem3 {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        list.add("A");
        list.add("B");
        list.add("C");
        list.add("D");

        Collections.reverse(list);
        System.out.println(list);

    }
}
