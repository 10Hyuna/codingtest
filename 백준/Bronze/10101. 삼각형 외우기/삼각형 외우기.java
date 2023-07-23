import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n1 = Integer.parseInt(br.readLine());
        int n2 = Integer.parseInt(br.readLine());
        int n3 = Integer.parseInt(br.readLine());

        if (n1 + n2 + n3 != 180) {
            System.out.printf("Error");
        } else {
            if (n1 == 60 && n2 == 60 && n3 == 60) {
                System.out.printf("Equilateral");
            } else if (n1 != n2 && n2 != n3 && n1 != n3) {
                System.out.printf("Scalene");
            } else {
                System.out.printf("Isosceles");
            }
        }
    }
}