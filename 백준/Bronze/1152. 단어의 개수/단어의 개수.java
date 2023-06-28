import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        Boolean isText = false;
        int sum = 0;

        String line = br.readLine();

        for(int i = 0; i < line.length(); i++){
            if(line.substring(i, i + 1).equals(" ")){
                if(isText){
                    sum++;
                }
                isText = false;
            }
            else{
                isText = true;
            }
        }
        if(isText){
            sum++;
        }

        System.out.printf("%d", sum);
    }
}