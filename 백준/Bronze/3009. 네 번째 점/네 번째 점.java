import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st;
        int[] cordinate_x = new int[3];
        int[] cordinate_y = new int[3];

        for (int i = 0; i < 3; i++) {
            st = new StringTokenizer(br.readLine(), " ");
            cordinate_x[i] = Integer.parseInt(st.nextToken());
            cordinate_y[i] = Integer.parseInt(st.nextToken());
        }

        br.close();
        int x, y;

        if (cordinate_x[0] == cordinate_x[1]) {
            x = cordinate_x[2];
        } else if (cordinate_x[0] == cordinate_x[2]) {
            x = cordinate_x[1];
        } else {
            x = cordinate_x[0];
        }

        if (cordinate_y[0] == cordinate_y[1]) {
            y = cordinate_y[2];
        } else if (cordinate_y[0] == cordinate_y[2]) {
            y = cordinate_y[1];
        } else {
            y = cordinate_y[0];
        }

        System.out.printf("%d %d", x, y);
    }
}