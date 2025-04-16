import java.util.LinkedList;

public class LinkedListProblem5 {
    public static void main(String[] args) {
        LinkedList<String> list = new LinkedList<>();
        list.add("www.google.com");
        list.add("www.youtube.com");
        list.poll();
        list.offer("haha");
        list.poll();
        list.offer("hehe");
        list.poll();
        for (String string : list) {
            System.out.println(string);
        }
    }
}
