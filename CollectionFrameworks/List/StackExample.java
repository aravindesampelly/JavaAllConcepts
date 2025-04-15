import java.util.Iterator;
import java.util.Stack;

public class StackExample {
    public static void main(String[] args) {
        Stack<String> list = new Stack<>();
        list.add("12");
        list.add("34");
        list.peek();
        System.out.println(list.firstElement());

        Iterator<String> itr = list.iterator();
        while (itr.hasNext()) {
            System.out.println(itr.next());
        }
    }
}
