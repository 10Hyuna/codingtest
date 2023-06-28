import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String[] alphabet = {"ABC", "DEF", "GHI", "JKL", "MNO", "PQRS", "TUV", "WXYZ"};

        String line = br.readLine();
        String dialText;
        String alphabetText;
        int sum = 0;

        for(int i = 0; i < line.length(); i++){
            dialText = line.substring(i, i + 1);
            for(int j = 0; j < alphabet.length; j++){
                for(int k = 0; k < alphabet[j].length(); k++){
                    alphabetText = alphabet[j].substring(k, k + 1);
                    if(dialText.equals(alphabetText)){
                        sum += (j + 3);
                    }
                }
            }
        }

        System.out.printf("%d", sum);
    }
}