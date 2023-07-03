import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Objects;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String line = br.readLine();

        String[] croatia = {"c=", "c-", "dz=", "d-", "lj", "nj", "s=", "z="};
        String comparison;
        boolean isDelete = false;
        int count = 0;

        while (!line.equals("")) {
            isDelete = false;
            for (int i = 0; i < croatia.length; i++) {
                if (line.length() < croatia[i].length()) {
                    continue;
                }

                comparison = line.substring(0, croatia[i].length());

                if (comparison.equals(croatia[i])) {
                    count++;
                    line = line.substring(croatia[i].length());
                    isDelete = true;
                    break;
                }
            }

            if (!isDelete) {
                count++;
                line = line.substring(1);
            }
        }

        System.out.printf("%d", count);
    }
}