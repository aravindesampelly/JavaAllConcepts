import java.util.ArrayList;
import java.util.Iterator;

public class ArrayListProblem1 {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        list.add("Aravind");
        list.add("Bruce Wayne");
        list.add("Peter Parker");
        list.add("Luffy");
        list.add("Naruto");

        Iterator<String> itr = list.iterator();
        int i = 1;
        while (itr.hasNext()) {
            System.out.println(i + "." + itr.next());
            i++;
        }
    }
}
