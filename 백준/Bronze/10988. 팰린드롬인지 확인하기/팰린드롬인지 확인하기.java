import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String line = br.readLine();

        String reverse = returnReverseText(line);

        boolean isPalindromeText = isPalindrome(line, reverse);

        if(isPalindromeText){
            System.out.println("1");
        }
        else{
            System.out.println("0");
        }
    }

    private static String returnReverseText(String text){
        String reverseText = "";

        for(int i = text.length() - 1; i >= 0; i--){
            reverseText += text.substring(i, i + 1);
        }

        return reverseText;
    }

    private static boolean isPalindrome(String origin, String reverse){
        if(origin.equals(reverse)){
            return true;
        }
        return false;
    }
}