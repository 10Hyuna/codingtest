import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        List<Integer> arr = new ArrayList<>();

        String n = br.readLine();

        for (int i = 0; i < n.length(); i++) {
            arr.add(Integer.parseInt(n.substring(i, i + 1)));
        }

        Collections.sort(arr, Collections.reverseOrder());

        for (int value : arr) {
            sb.append(value);
        }

        System.out.println(sb);
    }
}