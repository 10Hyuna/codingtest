import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;

        int n = Integer.parseInt(br.readLine());

        int[] score = new int[n];
        String line = br.readLine();
        st = new StringTokenizer(line, " ");

        for(int i = 0; i < n; i++){
            score[i] = Integer.parseInt(st.nextToken());
        }

        int max = score[0];

        for(int i = 0; i < n; i++){
            if(score[i] > max){
                max = score[i];
            }
        }

        double total = 0;

        for(int i = 0; i < n; i++){
            total += (score[i] / (double)max * 100);
        }

        System.out.print(total / n);
    }
}