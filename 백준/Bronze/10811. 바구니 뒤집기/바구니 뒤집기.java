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

        int i, j, tmp;

        int[] bucket = new int[n];
        for(int a = 0; a < n; a++){
            bucket[a] = a + 1;
        }

        for (int a = 0; a < m; a++){
            line = br.readLine();
            st = new StringTokenizer(line, " ");
            i = Integer.parseInt(st.nextToken()) - 1;
            j = Integer.parseInt(st.nextToken()) - 1;

            while(i < j){
                tmp = bucket[i];
                bucket[i] = bucket[j];
                bucket[j] = tmp;
                i++;
                j--;
            }
        }

        for(int a = 0; a < n; a++){
            System.out.printf("%d ", bucket[a]);
        }
    }
}