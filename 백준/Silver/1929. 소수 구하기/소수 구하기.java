import java.io.*;
import java.util.*;

public class Main {
    private static boolean[] arr;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int m = Integer.parseInt(st.nextToken());
        int n = Integer.parseInt(st.nextToken());

        arr = new boolean[n + 1];
        seperatePrimeNumer(m, n);

        for (int i = m; i <= n; i++) {
            if (!arr[i]) {
                System.out.printf("%d\n", i);
            }
        }
    }

    private static void seperatePrimeNumer(int m, int n) {
        arr[0] = arr[1] = true;

        for (int i = 2; i <= n; i++) {

            if (!arr[i]) {
                for (int j = i + i; j <= n; j += i) {
                    arr[j] = true;
                }
            }
        }
    }
}