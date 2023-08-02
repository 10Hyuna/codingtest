import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());
        int end = 666, count = 1;

        while (count != n) {
            end++;
            if (String.valueOf(end).contains("666")) {
                count++;
            }
        }
        System.out.printf("%d", end);
    }
}