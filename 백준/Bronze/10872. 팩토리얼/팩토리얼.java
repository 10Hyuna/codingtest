import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
 
public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int n = Integer.parseInt(br.readLine());
		
		int sum = getFactorial(n);
		System.out.println(sum);
		
	}
	
	private static int getFactorial(int n) {
		if(n <= 1) return 1;	
		return n * getFactorial(n - 1);		
	}
}