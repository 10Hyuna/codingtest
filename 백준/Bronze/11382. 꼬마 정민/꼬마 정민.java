import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        String[] value = input.split(" ");
        Long a = Long.valueOf(value[0]);
        Long b = Long.valueOf(value[1]);
        Long c = Long.valueOf(value[2]);
        System.out.println(a + b + c);
    }
}