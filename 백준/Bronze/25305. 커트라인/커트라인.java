import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Collections;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n, k;
        StringTokenizer st = new StringTokenizer(br.readLine());
        n = Integer.parseInt(st.nextToken());
        k = Integer.parseInt(st.nextToken());

        Integer[] participant = new Integer[n];
        st = new StringTokenizer(br.readLine());

        for (int i = 0; i < n; i++) {
            participant[i] = Integer.parseInt(st.nextToken());
        }
        Arrays.sort(participant, Collections.reverseOrder());

        System.out.printf("%d", participant[k - 1]);
    }
}