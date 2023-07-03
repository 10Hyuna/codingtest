import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String line = br.readLine();
        line = line.toUpperCase();

        int[] frequency = new int[26];
        char oneWord;

        for (int i = 0; i < line.length(); i++) {
            oneWord = line.charAt(i);
            frequency[oneWord - 'A']++;
        }

        int maxCount = 0;
        String maxFrequency = "A";
        boolean isMaxWords = false;

        for (int i = 0; i < 26; i++) {
            if (frequency[i] > maxCount) {
                oneWord = (char) ('A' + i);
                maxFrequency = String.valueOf(oneWord);
                maxCount = frequency[i];
            } else if (frequency[i] == maxCount) {
                maxFrequency = "?";
            }
        }

        System.out.printf("%s", maxFrequency);
    }
}