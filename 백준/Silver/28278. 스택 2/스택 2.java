import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Stack;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        Stack<Integer> stack = new Stack<Integer>();
        StringTokenizer st;

        int n = Integer.parseInt(br.readLine());
        String command;

        for (int i = 0; i < n; i++) {
            st = new StringTokenizer(br.readLine());
            command = st.nextToken();

            switch (command) {
                case "1":
                    stack.push(Integer.parseInt(st.nextToken()));
                    break;
                case "2":
                    if (stack.isEmpty()) {
                        sb.append(-1).append("\n");
                        break;
                    }
                    sb.append(stack.lastElement()).append("\n");
                    stack.pop();
                    break;
                case "3":
                    sb.append(stack.size()).append("\n");
                    break;
                case "4":
                    if (stack.isEmpty()) {
                        sb.append(1).append("\n");
                        break;
                    }
                    sb.append(0).append("\n");
                    break;
                case "5":
                    if (stack.isEmpty()) {
                        sb.append(-1).append("\n");
                        break;
                    }
                    sb.append(stack.lastElement()).append("\n");
                    break;
            }
        }

        System.out.println(sb);
    }
}