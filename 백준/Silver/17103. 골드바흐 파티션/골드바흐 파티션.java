import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int t = Integer.parseInt(br.readLine());

		boolean[] isPrime = new boolean[1000001];

		isPrime[0] = isPrime[1] = true;

		for (int i = 2; i < isPrime.length; i++) {

			if (!isPrime[i]) {
				for (int j = 2; i * j < isPrime.length; j++) {
					isPrime[i * j] = true;
				}
			}
		}

        int n, count;
        
		for (int i = 0; i < t; i++) {

			n = Integer.parseInt(br.readLine());
			count = 0;

			for (int j = 2; j <= n / 2; j++) {
				if (!isPrime[j] && !isPrime[n - j]) {
                    count++;
				}
			}
            System.out.println(count);
		}
	}
}