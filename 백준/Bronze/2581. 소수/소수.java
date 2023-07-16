import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int sum = 0;
        int m = Integer.parseInt(br.readLine());
        int n = Integer.parseInt(br.readLine());
        boolean isPrimary;
        boolean isEmpty = true;
        int min = -1;

        for (int i = m; i <= n; i++) {
            isPrimary = isPrimaryNumber(i);
            if (isPrimary) {
                if (isEmpty) {
                    isEmpty = false;
                    min = i;
                }
                sum += i;
            }
        }

        if (isEmpty) {
            System.out.printf("%d", min);
        } else {
            System.out.printf("%d\n%d", sum, min);
        }
    }

    private static boolean isPrimaryNumber(int n) {
        boolean primary = true;
        if (n < 2) {
            primary = false;
        } else {
            for (int i = 2; i < n; i++) {
                if (n % i == 0) {
                    primary = false;
                }
            }
        }

        return primary;
    }
}