import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int x = scanner.nextInt();
        int y = scanner.nextInt();
        scanner.close();

        int quadrant;

        if(x * y >= 0){
            if(x >= 0){
                quadrant = 1;
            }
            else{
                quadrant = 3;
            }
        }
        else{
            if(x >= 0){
                quadrant = 4;
            }
            else{
                quadrant = 2;
            }
        }
        System.out.println(quadrant);
    }
}