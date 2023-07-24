import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Collections;
import java.util.List;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n1, n2, n3;
        StringTokenizer st;

        while (true) {
            st = new StringTokenizer(br.readLine());
            n1 = Integer.parseInt(st.nextToken());
            n2 = Integer.parseInt(st.nextToken());
            n3 = Integer.parseInt(st.nextToken());

            if (n1 == 0 && n2 == 0 && n3 == 0) {
                break;
            } else {
                discriminateTriangle(n1, n2, n3);
            }
        }
    }

    private static void discriminateTriangle(int n1, int n2, int n3) {
        if (isTriangle(n1, n2, n3)) {
            if (n1 == n2 && n1 == n3 && n2 == n3) {
                System.out.printf("Equilateral\n");
            } else if (n1 != n2 && n1 != n3 & n2 != n3) {
                System.out.printf("Scalene\n");
            } else {
                System.out.printf("Isosceles\n");
            }
        } else {
            System.out.printf("Invalid\n");
        }
    }

    private static boolean isTriangle(int n1, int n2, int n3) {
        List<Integer> numbers = List.of(n1, n2, n3);
        int max = Collections.max(numbers);

        if (max == n1) {
            if (max < n2 + n3) {
                return true;
            }
        } else if (max == n2) {
            if (max < n1 + n3) {
                return true;
            }
        } else {
            if (max < n1 + n2) {
                return true;
            }
        }
        return false;
    }
}