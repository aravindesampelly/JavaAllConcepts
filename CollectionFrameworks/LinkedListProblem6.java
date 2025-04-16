import java.util.LinkedList;

public class LinkedListProblem6 {
    public static void main(String[] args) {
        LinkedList<String> list = new LinkedList<>();
        list.add("A");
        list.add("B");
        list.add("C");
        list.add("o");
        list.add("A");
        String name = "";
        for (String string : list) {
            name = name + string;

        }
        System.out.println(name);
        int k = 0;
        for (int i = 0; i < name.length(); i++) {
            if (name.charAt(i) == name.charAt(name.length() - i-1)) {
                k++;
            }
        }
        if (k == name.length()) {
            System.out.println("palindrome");
        } else {
            System.out.println("Not Palindrome");
        }
    }
}
