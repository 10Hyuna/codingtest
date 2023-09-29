import java.io.*;
import java.util.ArrayDeque;
import java.util.Deque;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        Deque<Integer> deque = new ArrayDeque<>();
        StringBuilder sb = new StringBuilder();

        int n = Integer.parseInt(br.readLine());
        int command;

        while(n --> 0) {
            st = new StringTokenizer(br.readLine());
            command = Integer.parseInt(st.nextToken());

            switch (command){
                case 1 : 
                    deque.addFirst(Integer.parseInt(st.nextToken()));
                    break;
                case 2 :
                    deque.addLast(Integer.parseInt(st.nextToken()));
                    break;
                case 3 : 
                    sb.append(deque.isEmpty()? -1 : deque.pollFirst()).append("\n");
                    break;
                case 4 :
                    sb.append(deque.isEmpty()? -1 : deque.pollLast()).append("\n");
                    break;
                case 5 :
                    sb.append(deque.size()).append("\n");
                    break;
                case 6 :
                    sb.append(deque.isEmpty()? 1 : 0).append("\n");
                    break;
                case 7 : 
                    sb.append(deque.isEmpty()? -1 :deque.peekFirst()).append("\n");
                    break;
                case 8 : 
                    sb.append(deque.isEmpty()? -1 : deque.peekLast()).append("\n");
                    break;
            }
        }
        System.out.println(sb);
    }
}