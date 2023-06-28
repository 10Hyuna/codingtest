import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String[] line;
        int n1, n2;

        while (true){
            line = br.readLine().split(" ");
            n1 = Integer.parseInt(line[0]);
            n2 = Integer.parseInt(line[1]);

            if(n1 == 0 && n2 == 0){
                break;
            }
            bw.write(n1 + n2 + "\n");
        }

        br.close();
        bw.close();
    }
}