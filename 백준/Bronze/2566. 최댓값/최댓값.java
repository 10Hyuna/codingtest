import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Objects;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String[] line;
        int max = 0;
        int row = 1;
        int col = 1;

        int[][] arr = new int[9][9];

        for (int i = 0; i < 9; i++) {
            line = br.readLine().split(" ");
            for (int j = 0; j < 9; j++) {
                arr[i][j] = Integer.parseInt(line[j]);
                if (arr[i][j] > max) {
                    max = Integer.parseInt(line[j]);
                    row = i + 1;
                    col = j + 1;
                }
            }
        }

        System.out.println(max);
        System.out.println(row + " " + col);
    }
}