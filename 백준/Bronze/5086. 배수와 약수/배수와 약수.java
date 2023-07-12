import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st;
        int first;
        int second;
        String relation;
        while (true) {
            relation = "neither";

            st = new StringTokenizer(br.readLine(), " ");
            first = Integer.parseInt(st.nextToken());
            second = Integer.parseInt(st.nextToken());

            if (first == 0 && second == 0) {
                break;
            }

            if (first < second && isCheckRelation(first, second)) {
                relation = "factor";
            }
            if (first > second && isCheckRelation(second, first)) {
                relation = "multiple";
            }

            System.out.printf("%s\n", relation);
        }
    }

    private static boolean isCheckRelation(int first, int second) {
        int num = first * (second / first);
        boolean isFactorRelation = false;

        if (num == second) {
            isFactorRelation = true;
        }

        return isFactorRelation;
    }
}