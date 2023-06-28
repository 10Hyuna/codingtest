import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int count = Integer.parseInt(br.readLine());

        String line;
        int refeatCount;
        String refeatText;

        for(int i = 0; i < count; i++){
            line = br.readLine();
            refeatCount = Integer.parseInt(line.substring(0, 1));
            refeatText = line.substring(2);
            for(int j = 0; j < refeatText.length(); j++){
                for(int k = 0; k < refeatCount; k++){
                    System.out.printf("%s", refeatText.substring(j, j + 1));
                }
            }
            System.out.printf("\n");
        }
    }
}