
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;

public class ArrayListProblem3 {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        list.add("A");
        list.add("B");
        list.add("C");
        list.add("D");

        Iterator<String> itr = list.iterator();
        String arr[] = new String[5];
        int i = 0;
        while (itr.hasNext()) {
            arr[i] = itr.next();
            i++;
        }
        System.out.println(Arrays.toString(arr));

    }
}
