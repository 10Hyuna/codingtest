import java.awt.desktop.AboutEvent;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Objects;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());
        int distance = 1;
        int range = 2;

        if (n != 1) {
            while (range <= n) {
                range += (6 * distance);
                distance++;
            }
        }

        System.out.printf("%d", distance);
    }
}