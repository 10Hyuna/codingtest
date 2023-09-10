import java.io.*;
import java.util.*;

public class Main {
    private static boolean[] arr = new boolean[246913];

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int count, n;
        seperatePrimeNumer();

        while(true) {
			n = Integer.parseInt(br.readLine());
			if(n == 0) {
                break;
            }
            
			count = 0;
            
			for(int i = n + 1; i <= 2 * n; i++) {
				if(!arr[i]) {
                    count++;
                }
			}
            System.out.printf("%d\n", count);
		}
    }

    private static void seperatePrimeNumer() {
        arr[0] = arr[1] = true;

        for (int i = 2; i <= Math.sqrt(arr.length); i++) {

            if (!arr[i]) {
                for (int j = i * i; j <= arr.length; j += i) {
                    arr[j] = true;
                }
            }
        }
    }
}