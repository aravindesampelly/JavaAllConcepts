import java.util.Iterator;
import java.util.Vector;

public class VectorExample {
    public static void main(String[] args) {
        Vector<String> list = new Vector<>();
        list.add("A");
        list.add("1");
        list.add("7");
        Iterator<String> itr = list.iterator();
        while (itr.hasNext()) {
            System.out.println(itr.next());
        }
    }
}
