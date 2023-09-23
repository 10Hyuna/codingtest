import java.util.*;
import java.io.*;
public class Main{
    
    public static void main(String [] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int studentNumber = Integer.parseInt(br.readLine());
        int student[] = new int [studentNumber];
        StringTokenizer st = new StringTokenizer(br.readLine());
        
        for(int i = 0; i < studentNumber; i++) {
            student[i] = Integer.parseInt(st.nextToken());
        }
        
        int getOrder = 1;
        Stack<Integer>stack = new Stack<Integer>();
        
        for(int i = 0; i < studentNumber; i++) {
            if(student[i] != getOrder) {
                if(!stack.isEmpty() && 
                   stack.peek() == getOrder) {
                    stack.pop();
                    i--;
                    getOrder++;
                } else {
                    stack.push(student[i]);
                }
                
            } else {
                getOrder++;
            }
        }
        boolean answer = true;
        int tmp;
        
        for(int i = 0; i < stack.size(); i++) {
            tmp = stack.pop();
            
            if(tmp == getOrder) {
                getOrder++;
            } else {
                answer = false;
                break;
            }
        }
        
        if(answer) {
            System.out.println("Nice");
        } else {
            System.out.println("Sad");
        }
    }   
}