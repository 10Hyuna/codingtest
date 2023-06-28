import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String line = br.readLine();

        String first = line.substring(0, 3);
        String second = line.substring(4);
        first = reverseNumber(first);
        second = reverseNumber(second);

        int firstNumber = Integer.parseInt(first);
        int secondNumber = Integer.parseInt(second);

        if(firstNumber >= secondNumber){
            System.out.printf("%d", firstNumber);
        }
        else{
            System.out.printf("%d", secondNumber);
        }
    }

    private static String reverseNumber(String number){
        String reverse = "";
        for(int i = 2; i >= 0; i--){
            reverse += number.substring(i, i + 1);
        }

        return reverse;
    }
}