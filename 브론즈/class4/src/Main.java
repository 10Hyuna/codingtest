import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int num;
        int max = 0;
        int index = 0;

        for(int i = 0; i < 9; i++){
            num = Integer.parseInt(br.readLine());

            if(num > max){
                max = num;
                index = i + 1;
            }
        }

        System.out.printf("%d\n%d", max, index);
    }
}