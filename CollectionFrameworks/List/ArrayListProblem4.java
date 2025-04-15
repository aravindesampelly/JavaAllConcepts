import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.Scanner;

public class ArrayListProblem4 {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        try (Scanner sc = new Scanner(System.in)) {
            System.out.println("How many elements do you want to store?");
            int answer = sc.nextInt();

            System.out.println("Enter data:");
            for (int i = 0; i < answer; i++) {
                String s = sc.next();
                list.add(s);
            }
        }

        ArrayList<String> list2 = new ArrayList<>();
        Iterator<String> itr = list.iterator();

        while (itr.hasNext()) {
            String value = itr.next();
            char firstChar = Character.toUpperCase(value.charAt(0)); // Handle lowercase too
            if (firstChar == 'A' || firstChar == 'E' || firstChar == 'I' || firstChar == 'O' || firstChar == 'U') {
                list2.add(value);
            }
        }

        System.out.println("Words starting with vowels: " + list2);

        Collections.reverse(list);
        System.out.println("Reversed original list: " + list);
    }
}
