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

        while (n != -1) {
            checkPerfect(n);
            n = Integer.parseInt(br.readLine());
        }
    }

    private static void checkPerfect(int n) {
        List<Integer> factor = new ArrayList<>();
        for (int i = 1; i < n; i++) {
            if (n % i == 0) {
                factor.add(i);
            }
        }
        int sum = 0;
        for (int i = 0; i < factor.size(); i++) {
            sum += factor.get(i);
        }

        if (sum == n) {
            System.out.printf("%d = ", n);
            for (int i = 0; i < factor.size(); i++) {
                System.out.printf("%d ", factor.get(i));
                if (i != factor.size() - 1) {
                    System.out.printf("+ ");
                }
            }
        } else {
            System.out.printf("%d is NOT perfect.", n);
        }
        System.out.printf("\n");
    }
}