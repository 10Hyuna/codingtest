import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        String line;
        String foundText;

        for(int i = 0; i < n; i++){
            line = br.readLine();
            foundText = String.format("%c%c", line.charAt(0), line.charAt(line.length() - 1));
            System.out.println(foundText);
        }
    }
}