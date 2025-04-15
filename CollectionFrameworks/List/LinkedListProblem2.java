import java.util.LinkedList;

public class LinkedListProblem2 {
    public static void main(String[] args) {
        LinkedList<Integer> list = new LinkedList<>();

        list.add(19);
        list.add(14);
        list.add(31);
        list.add(1);
        list.add(12);
        list.add(121);
        list.add(31);
        list.add(431);
        list.add(41);
        list.add(61);
        System.out.println("Printing all numbers");
        for (Integer integer : list) {
            if (integer <= 26) {

            }
            System.out.println(list.indexOf(integer) + 1 + "." + integer);
        }

    }

}
