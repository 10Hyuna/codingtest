import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;

        String line = br.readLine();
        st = new StringTokenizer(line, " ");

        int n = Integer.parseInt(st.nextToken());
        int x = Integer.parseInt(st.nextToken());
        int num;

        line = br.readLine();

        br.close();

        int[] arr = new int[n];
        st = new StringTokenizer(line, " ");

        int j = 0;

        for(int i = 0; i < n; i++){
            num = Integer.parseInt(st.nextToken());
            if(num < x){
                arr[j++] = num;
            }
        }

        for(int i = 0; i < j; i++){
            System.out.printf("%d ", arr[i]);
        }
    }
}