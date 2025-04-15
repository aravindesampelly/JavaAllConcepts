import java.util.LinkedList;
import java.util.Iterator;

public class LinkedListProblem1 {
    public static void main(String[] args) {
        LinkedList<Integer> list = new LinkedList<>();
        list.add(1);
        list.add(2);
        list.add(51);
        list.add(12);
        list.add(24);
        list.add(57);
        list.add(199);
        list.add(23);
        list.add(52);
        list.add(179);
        list.add(234);
        list.add(5346);

        System.out.println("Original List: " + list);

        // Remove even numbers
        Iterator<Integer> itr = list.iterator();
        while (itr.hasNext()) {
            int num = itr.next();
            if (num % 2 == 0) {
                itr.remove(); // remove the even number
            }
        }

        System.out.println("After removing even numbers: " + list);
    }
}
