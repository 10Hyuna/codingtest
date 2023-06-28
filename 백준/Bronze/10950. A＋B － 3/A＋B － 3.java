import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int number1, number2;

        for (int i = 0; i < n; i++){
            number1 = scanner.nextInt();
            number2 = scanner.nextInt();

            System.out.printf("%d\n", number1 + number2);
        }
        scanner.close();
    }
}