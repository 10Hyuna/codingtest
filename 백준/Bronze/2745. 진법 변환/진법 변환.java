import java.awt.desktop.AboutEvent;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Objects;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String[] line = br.readLine().split(" ");

        String n = line[0];
        char temp;
        int b = Integer.parseInt(line[1]);

        int total = 0;
        int num = 1;

        for (int i = n.length() - 1; i >= 0; i--) {
            temp = n.charAt(i);

            if (temp >= 'A' && temp <= 'Z') {
                total += (temp - 'A' + 10) * num;
            } else {
                total += (temp - '0') * num;
            }
            num *= b;
        }

        System.out.printf("%d", total);
    }
}