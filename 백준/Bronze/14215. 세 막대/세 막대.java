import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st = new StringTokenizer(br.readLine());

        List<Integer> triangle = new ArrayList<>();

        for(int i=0;i<3;i++){
            triangle.add(Integer.parseInt(st.nextToken()));
        }
        triangle.sort(Comparator.naturalOrder());

        if (triangle.get(0) + triangle.get(1) > triangle.get(2)) {
            System.out.println(triangle.get(0) + triangle.get(1) + triangle.get(2));
        } else {
            System.out.println((triangle.get(0) + triangle.get(1)) * 2 - 1);
        }
    }
}