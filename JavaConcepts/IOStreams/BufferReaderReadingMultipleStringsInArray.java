import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BufferReaderReadingMultipleStringsInArray {
    public static void main(String[] args) throws IOException {
        String str[] = new String[10];
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter any sentance");
        System.out.println("write stop when you want to stop");
        for (int i = 0; i < 10; i++) {
            str[i] = br.readLine();
            if (str[i].equals("stop")) {
                break;
            }
        }
        System.out.println("Displaying the lines:");
        for (int i = 0; i < 10; i++) {
            if (str[i].equals("stop"))
                break;
            System.out.println(str[i]);
        }
    }
}
