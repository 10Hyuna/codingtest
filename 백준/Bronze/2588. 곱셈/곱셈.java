import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
        int firstLine = scanner.nextInt();
        int secondLine = scanner.nextInt();
        int lastNumber;
        int totalResult = 0;
        int cnt = 0;

        while(secondLine > 0){
            lastNumber = secondLine % 10;
            secondLine /= 10;
            System.out.println(firstLine * lastNumber);
            for(int i = 0; i < cnt; i++){
                lastNumber *= 10;
            }
            totalResult += firstLine * lastNumber;
            cnt++;
        }

        System.out.println(totalResult);
    }
}