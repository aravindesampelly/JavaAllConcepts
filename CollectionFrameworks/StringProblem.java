import java.util.Arrays;

public class StringProblem {
    public static void main(String[] args) {
        String name = "aravind";
        int arr[] = new int[name.length()];
        int l = 0;
        for (int i = 0; i < name.length(); i++) {
            int count = 0;
            for (int j = 0; j < name.length(); j++) {
                if (name.charAt(i) == name.charAt(j)) {
                    count++;
                }
            }
            arr[l] = count;
            l++;
        }
        System.out.println(Arrays.toString(arr));
    }
}
