import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int line = Integer.parseInt(br.readLine());

        printStar(line);
        printReverstStar(line - 1);
    }

    private static void printStar(int line){
        for(int i = 1; i <= line; i++){
            for(int j = 0; j < line - i; j++){
                System.out.printf(" ");
            }
            for(int j = 0; j < 2 * i - 1; j++){
                System.out.printf("*");
            }
            System.out.println();
        }
    }

    private static void printReverstStar(int line){
        for(int i = line; i > 0; i--){
            System.out.printf(" ");
            for(int j = 0; j < line - i; j++){
                System.out.printf(" ");
            }
            for(int j = 0; j < 2 * i - 1; j++){
                System.out.printf("*");
            }
            System.out.println();
        }
    }
}