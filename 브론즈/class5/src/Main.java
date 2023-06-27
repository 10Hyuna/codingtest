import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int count = Integer.parseInt(br.readLine());
        String numbers = br.readLine();
        int sum = 0;

        for(int i = 0; i < count; i++){
            sum += Integer.parseInt(numbers.substring(i, i + 1));
        }

        System.out.printf("%d", sum);
    }
}