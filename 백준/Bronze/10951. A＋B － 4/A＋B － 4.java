import java.io.*;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        StringBuilder sb = new StringBuilder();

        String line;
        int n1, n2;

        while ((line = br.readLine()) != null){
            st = new StringTokenizer(line, " ");
            n1 = Integer.parseInt(st.nextToken());
            n2 = Integer.parseInt(st.nextToken());

            sb.append(n1 + n2).append("\n");
        }
        
        System.out.println(sb);

        br.close();
    }
}