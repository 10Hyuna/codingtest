import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st = new StringTokenizer(br.readLine());
        List<Integer> a = new ArrayList<>();

        for (int i = 0; i < 2; i++) {
            a.add(Integer.parseInt(st.nextToken()));
        }

        int c = Integer.parseInt(br.readLine());
        int n = Integer.parseInt(br.readLine());

        int f = a.get(0) * n + a.get(1);
        int g = c * n;
        
        if (f <= g && c >= a.get(0)) {
            System.out.println(1);
        } else {
            System.out.println(0);
        }
    }
}