import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int[] arr = new int[11];
        int num;

        int j = 0;
        boolean isOverlap;

        for(int i = 0; i < 10; i++){
            num = Integer.parseInt(br.readLine());
            num %= 42;
            isOverlap = false;
            for (int k = 0; k < j; k++){
                if(arr[k] == num){
                    isOverlap = true;
                }
            }

            if(!isOverlap){
                arr[j++] = num;
            }
        }

        System.out.printf("%d", j);
    }
}