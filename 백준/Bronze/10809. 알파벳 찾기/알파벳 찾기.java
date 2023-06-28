import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String alphabet = "abcdefghijklmnopqrstuvwxyz";
        int foundIndex;
        String foundAlphabet;

        String line = br.readLine();

        for(int i = 0; i < alphabet.length(); i++){
            foundIndex = -1;
            foundAlphabet = alphabet.substring(i, i + 1);
            for(int j = 0; j < line.length(); j++){
                if(foundAlphabet.equals(line.substring(j, j + 1))){
                    foundIndex = j;
                    break;
                }
            }
            System.out.printf("%d ", foundIndex);
        }
    }
}