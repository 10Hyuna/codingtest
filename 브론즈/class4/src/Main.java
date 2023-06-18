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
        int m = Integer.parseInt(st.nextToken());
        int startIndex, endIndex, tmp;

        int[] bucket = new int[n];
        for(int a = 0; a < n ; a++){
            bucket[a] = a + 1;
        }

        for(int i = 0; i < m; i++){
            line = br.readLine();
            st = new StringTokenizer(line, " ");

            startIndex = Integer.parseInt(st.nextToken()) - 1;
            endIndex = Integer.parseInt(st.nextToken()) - 1;

            tmp = bucket[startIndex];
            bucket[startIndex] = bucket[endIndex];
            bucket[endIndex] = tmp;
        }

        for(int i = 0; i < n; i++){
            System.out.printf("%d ", bucket[i]);
        }
    }
}