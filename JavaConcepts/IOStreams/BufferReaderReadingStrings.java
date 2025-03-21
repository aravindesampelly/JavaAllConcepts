import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BufferReaderReadingStrings {
    public static void main(String[] args) {
        String str;
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter lines of code");
        System.out.println("Enter 'stop' when you want to stop");

        try {
            while (true) {
                str = br.readLine();
                if (str.equals("stop")) {
                    break;
                }
                System.out.println(str);
            }
        } catch (IOException e) {
            System.out.println("Error reading input: " + e.getMessage());
        }
    }
}
