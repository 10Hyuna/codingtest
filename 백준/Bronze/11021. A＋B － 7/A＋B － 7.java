import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int n = Integer.parseInt(br.readLine());
        String[] line;
        String caseText;
        int n1, n2;

        for(int i = 0; i < n; i++){
            line = br.readLine().split(" ");
            n1 = Integer.parseInt(line[0]);
            n2 = Integer.parseInt(line[1]);

            caseText = String.format("Case #%d: ", i + 1);
            bw.write(caseText);
            bw.write(String.valueOf(n1 + n2) +"\n");
            bw.flush();
        }

        br.close();
        bw.close();
    }
}