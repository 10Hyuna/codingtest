import java.awt.desktop.AboutEvent;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Objects;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());
        int col = 1;
        int row = 1;
        int index = 1;

        while (true) {
            n -= index;
            if (n <= 0) {
                n += index;
                break;
            }
//            else if (n == 0) {
//                break;
//            }
            col++;
            index++;
        }

        for (int i = 1; i < n; i++) {
            col--;
            if (col == 0) {
                col++;
                break;
            }
            row++;
        }

        if (index % 2 == 0) {
            System.out.printf("%d/%d", row, col);
        } else {
            System.out.printf("%d/%d", col, row);
        }
    }
}