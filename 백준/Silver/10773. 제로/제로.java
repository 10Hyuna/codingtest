import java.util.Stack;
 
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
 
public class Main {
 
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		Stack<Integer> stack = new Stack<Integer>();
		int k = Integer.parseInt(br.readLine());
        int number;
		
		for(int i = 0; i < k; i++) {
			number = Integer.parseInt(br.readLine());
			
			if(number == 0) {
				stack.pop();
			} else {
				stack.push(number);
			}
		}
        
		int sum = 0;
		for(int num : stack) {
			sum += num;
		}
 
		System.out.println(sum);		
	}
 
}