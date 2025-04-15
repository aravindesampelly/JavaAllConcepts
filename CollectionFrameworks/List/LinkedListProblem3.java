import java.util.LinkedList;
import java.util.Iterator;

public class LinkedListProblem3 {
    public static void main(String[] args) {
        LinkedList<Integer> list = new LinkedList<>();
        list.add(123);
        list.add(234);
        list.add(32);
        list.add(734);
        list.add(3);
        list.add(4);

        Iterator<Integer> itr = list.iterator();
        while (itr.hasNext()) {
            int num = itr.next();
            if (num > 100) {
                itr.remove(); // Safely remove
            }
        }

        System.out.println("List after removing numbers > 100: ");
        System.out.println(list);
    }
}
