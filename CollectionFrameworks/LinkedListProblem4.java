import java.util.LinkedList;

public class LinkedListProblem4 {
    public static void main(String[] args) {
        LinkedList<String> list = new LinkedList<>();
        list.addFirst("Aravind");
        list.addLast("Batman");
        list.addFirst("Esampelly");
        list.addLast("Bruce");

        list.removeFirst();
        list.removeLast();

        for (String string : list) {
            System.out.println(string);
        }
    }
}
