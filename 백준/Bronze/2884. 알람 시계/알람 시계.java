import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int hour = scanner.nextInt();
        int minute = scanner.nextInt();
        scanner.close();

        int time = hour * 60 + minute;
        time -= 45;
        if(time < 0){
            time = 24 * 60 + time;
        }

        hour = time / 60;
        minute = time % 60;

        System.out.printf("%d %d", hour, minute);

    }
}