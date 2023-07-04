import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Objects;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String line;
        String[][] arr = new String[15][5];

        for (int i = 0; i < 5; i++) {
            line = br.readLine();
            for (int j = 0; j < line.length(); j++) {
                arr[j][i] = line.substring(j, j + 1);
            }
        }

        for (int i = 0; i < 15; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                if(arr[i][j] == null){
                    continue;
                }
                System.out.printf("%s", arr[i][j]);
            }
        }
    }
}