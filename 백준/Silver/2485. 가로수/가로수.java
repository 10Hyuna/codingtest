import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());
        int[] trees = new int[n];

        for (int i = 0; i < n; i++) {
            trees[i] = Integer.parseInt(br.readLine());
        }

        Arrays.sort(trees);

        int gcd = 0;
        int distance;

        for (int i = 0; i < n - 1; i++) {
            distance = trees[i + 1] - trees[i];
            gcd = getGcd(distance, gcd);
        }

        System.out.println((trees[n - 1] - trees[0]) / gcd + 1 - (trees.length));
    }

    private static int getGcd(int num1, int num2) {
        if (num2 == 0) {
            return num1;
        } else {
            return getGcd(num2, num1 % num2);
        }
    }
}