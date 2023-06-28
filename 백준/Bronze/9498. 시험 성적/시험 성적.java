import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //90 ~ 100점은 A, 80 ~ 89점은 B, 70 ~ 79점은 C, 60 ~ 69점은 D, 나머지 점수는 F
        Scanner scanner = new Scanner(System.in);
        
        int score = scanner.nextInt();
        String grade;
        scanner.close();
        
        if(score >= 90){
            grade = "A";
        }
        else if(score >= 80){
            grade = "B";
        }
        else if(score >= 70){
            grade = "C";
        }
        else if(score >= 60){
            grade = "D";
        }
        else{
            grade = "F";
        }
        System.out.println(grade);
    }
}