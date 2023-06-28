import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //윤년은 연도가 4의 배수이면서, 100의 배수가 아닐 때 또는 400의 배수일 때이다.
        Scanner scanner = new Scanner(System.in);
        int year = scanner.nextInt();
        int bool = 0;

        if(year % 4 == 0){
            if(year % 100 != 0 || year % 400 == 0){
                bool = 1;
            }
        }

        System.out.println(bool);
    }
}