import java.util.Iterator;
import java.util.Vector;

public class VectorProblem1 {
    public static void main(String[] args) {
        Vector<String> list = new Vector<>();
        list.add("ABC");
        list.add("CS");
        list.add("Java");
        list.add("C++");

        Iterator<String> itr = list.iterator();
        while (itr.hasNext()) {
            System.out.println(itr.next());
        }
    }
}
