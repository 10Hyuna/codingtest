import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int[] chess = {1, 1, 2, 2, 2, 8};

        String[] line = br.readLine().split(" ");
        String chesses = "";

        int restPiece;
        int index = 0;

        for(int i = 0; i < chess.length; i++){

            restPiece = Integer.parseInt(line[i]);
            index += 2;

            restPiece = chess[i] - restPiece;
            chesses += String.format("%s ", String.valueOf(restPiece));
        }

        System.out.println(chesses);

//        for(int i = 0; i < chess.length; i++){
//            System.out.printf("%d ", chess[i]);
//        }
    }
}