import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        int year = Integer.parseInt(input) - 543;
        System.out.println(year);
    }
}