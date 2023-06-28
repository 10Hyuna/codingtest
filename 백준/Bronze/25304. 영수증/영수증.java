import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int totalPrice = scanner.nextInt();
        int n = scanner.nextInt();

        int item;
        int count;
        int sum = 0;

        for(int i = 0; i < n; i++){
            item = scanner.nextInt();
            count = scanner.nextInt();

            sum += (item * count);
        }

        if(sum == totalPrice){
            System.out.println("Yes");
        }
        else{
            System.out.println("No");
        }
    }
}