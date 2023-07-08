import java.awt.desktop.AboutEvent;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Objects;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());

        int dollar;

        for (int i = 0; i < n; i++) {
            dollar = Integer.parseInt(br.readLine());
            calculateChange(dollar);
        }
    }

    private static void calculateChange(int dollar) {
        int[] count = {0, 0, 0, 0};
        int[] change = {25, 10, 5, 1};
        int index = 0;

        while (dollar > 0) {
            dollar -= change[index];
            if (dollar < 0) {
                dollar += change[index];
                index++;
            } else {
                count[index]++;
            }
            if(index > 3){
                break;
            }
        }

        for (int i = 0; i < change.length; i++) {
            System.out.printf("%d ", count[i]);
        }
        System.out.printf("\n");
    }
}