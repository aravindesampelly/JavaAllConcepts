import java.util.ArrayList;
import java.util.Iterator;

public class ArrayListProblem2 {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        list.add("ABC");
        list.add("java");
        list.add("E");

        Iterator<String> itr = list.iterator();
        while (itr.hasNext()) {
            String k = itr.next();
            String s = "java";
            if (s.equals(k)) {
                System.out.println("Value is present  --->" + s);
            }
        }
    }
}
