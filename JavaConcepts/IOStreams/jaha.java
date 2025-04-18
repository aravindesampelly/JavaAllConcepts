import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BufferReaderExample {
    public static void main(String[] args) throws IOException {
        char c;
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter data, 'q' to exit");
        do {
            c = (char) br.read();
            System.out.println(c);
        } while (c != 'q');
    }
}
