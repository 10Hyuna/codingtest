import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int count = n / 4;

        for(int i = 0; i < count; i++){
            System.out.printf("long ");
        }
        System.out.printf("int");
    }
}