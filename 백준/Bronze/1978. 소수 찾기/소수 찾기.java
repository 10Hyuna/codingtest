import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int sum = 0;
        int n = Integer.parseInt(br.readLine());
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");

        for (int i = 0; i < n; i++) {
            sum += checkPrimaryNumber(Integer.parseInt(st.nextToken()));
        }

        System.out.printf("%d", sum);
    }

    private static int checkPrimaryNumber(int n) {
        int primary=1;
        if(n<2){
            primary=0;
        }
        else {
            for (int i = 2; i < n; i++) {
                if (n % i == 0) {
                    primary=0;
                }
            }
        }
        return primary;
    }
}