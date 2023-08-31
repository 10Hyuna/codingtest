import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int[] fraction1 = new int[2];
        int[] fraction2 = new int[2];
        int[] fraction3 = new int[2];

        for (int i = 0; i < 2; i++) {
            fraction1[i] = Integer.parseInt(st.nextToken());
        }

        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < 2; i++) {
            fraction2[i] = Integer.parseInt(st.nextToken());
        }

        fraction3[0] = fraction1[0] * fraction2[1] + fraction2[0] * fraction1[1];
        fraction3[1] = fraction1[1] * fraction2[1];

        int gcd = getGcd(fraction3[0], fraction3[1]);

        System.out.printf("%d %d", fraction3[0] / gcd, fraction3[1] / gcd);
    }

    private static int getGcd(int num1, int num2) {
        if (num2 == 0) {
            return num1;
        } else {
            return getGcd(num2, num1 % num2);
        }
    }
}