import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.Stack;
 
public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String s;
		
		while(true) {
			s = br.readLine();
			
			if(s.equals(".")) break;
            
			System.out.println(solve(s));
		}
	}
	
	public static String solve(String s) {
		Stack<Character> stack = new Stack<>();
        char c;
		
		for(int i = 0; i < s.length(); i++) {
			
			c = s.charAt(i);	
            
			if(c == '(' || c == '[') {
                
				stack.push(c);
                
			} else if(c == ')') {
                
				if(stack.empty() || stack.peek() != '(') {
					return "no";
				} else {
					stack.pop();
				}
                
			} else if(c == ']') {
				
				if(stack.empty() || stack.peek() != '[') {
					return "no";
				} else {
					stack.pop();
				}
                
			}
		}
		
		if(stack.empty()) {
			return "yes";
		}
		else {
			return "no";
		}
	}
 
}