import java.awt.desktop.AboutEvent;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Objects;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String[] line = br.readLine().split(" ");

        int n = Integer.parseInt(line[0]);
        int b = Integer.parseInt(line[1]);

        int temp;
        char ascii;

        String convertValue = "";
        String substring;

        while (n > 0) {
            temp = n % b;
            n /= b;

            if (temp < 10) {
                convertValue += String.valueOf(temp);
            } else {
                ascii = (char) ('A' + temp - 10);
                convertValue += String.valueOf(ascii);
            }
        }

        for (int i = convertValue.length() - 1; i >= 0; i--) {
            substring = convertValue.substring(i, i + 1);
            System.out.printf("%s", substring);
        }
    }
}