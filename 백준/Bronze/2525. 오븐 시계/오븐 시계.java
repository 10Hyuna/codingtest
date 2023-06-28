import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int hour = scanner.nextInt();
        int minute = scanner.nextInt();
        int endTime = scanner.nextInt();

        int time = hour * 60 + minute;
        time += endTime;

        if(time <= 0){
            time = 24 * 60 + time;
        }
        else if(time >= 24 * 60){
            time -= 24 * 60;
        }

        hour = time / 60;
        minute = time % 60;

        System.out.printf("%d %d", hour, minute);
    }
}