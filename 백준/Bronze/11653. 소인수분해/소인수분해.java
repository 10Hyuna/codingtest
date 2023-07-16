import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());
        int divide = 2;

        while (n > 1) {
            if (n % divide == 0) {
                System.out.printf("%d\n", divide);
                n /= divide;
            } else {
                divide++;
            }
        }
    }
}