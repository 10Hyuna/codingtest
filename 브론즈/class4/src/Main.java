import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;

        int n = Integer.parseInt(br.readLine());
        String line = br.readLine();
        int v = Integer.parseInt(br.readLine());

        int count = 0;

        br.close();

        int[] arr = new int[n];
        st = new StringTokenizer(line, " ");

        for(int i = 0; i < n; i++){
            arr[i] = Integer.parseInt(st.nextToken());
            if(arr[i] == v){
                count++;
            }
        }

        System.out.printf("%d", count);
    }
}