import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.*;

public class Main {

    private static Set<String> rainbow = new HashSet<>();

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String firstPerson, secondPerson;
        int n = Integer.parseInt(br.readLine());
        rainbow.add("ChongChong");

        for (int i = 0; i < n; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            firstPerson = st.nextToken();
            secondPerson = st.nextToken();
            meetRainbowDance(firstPerson, secondPerson);
        }

        System.out.println(rainbow.size());
    }

    private static void meetRainbowDance(String first, String second) {
        if (rainbow.contains(first) || rainbow.contains(second)) {
            rainbow.add(first);
            rainbow.add(second);
        }
    }

}