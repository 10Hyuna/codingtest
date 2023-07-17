import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        int x = Integer.parseInt(st.nextToken());
        int y = Integer.parseInt(st.nextToken());
        int w = Integer.parseInt(st.nextToken());
        int h = Integer.parseInt(st.nextToken());

        int target_x = 0;
        int target_y = 0;

        int min = searchMininmumDistance(x, y, target_x, target_y);
        target_x = w;
        target_y = h;

        if (min > searchMininmumDistance(x, y, target_x, target_y)) {
            min = searchMininmumDistance(x, y, target_x, target_y);
        }

        System.out.printf("%d", min);
    }

    private static int searchMininmumDistance(int x, int y, int target_x, int target_y) {
        int distance= positiveNumber(x, target_x);
        int temp =positiveNumber(y, target_y);

        if(distance >  temp){
            return temp;
        }
        return distance;
    }

    private static int positiveNumber(int n1, int n2) {
        if (n1 > n2) {
            return n1 - n2;
        }
        return n2 - n1;
    }
}