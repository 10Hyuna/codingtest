import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Objects;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String[] information;
        double totalScore = 0;
        double score = 0;
        double credit = 0;

        for (int i = 0; i < 20; i++) {
            information = br.readLine().split(" ");

            score = selectGrade(information[2]);
            if (score < 0) {
                continue;
            }

            score *= Double.valueOf(information[1]);
            totalScore += score;
            credit += Double.valueOf(information[1]);
        }

        System.out.printf("%.6f", totalScore / credit);
    }

    private static double selectGrade(String grade) {
        double score = 0;

        switch (grade) {
            case "A+":
                score = 4.5;
                break;
            case "A0":
                score = 4.0;
                break;
            case "B+":
                score = 3.5;
                break;
            case "B0":
                score = 3.0;
                break;
            case "C+":
                score = 2.5;
                break;
            case "C0":
                score = 2.0;
                break;
            case "D+":
                score = 1.5;
                break;
            case "D0":
                score = 1.0;
                break;
            case "F":
                score = 0;
                break;
            default:
                score = -1;
                break;
        }

        return score;
    }
}