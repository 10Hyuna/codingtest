import java.io.*;
import java.util.*;
public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        StringBuffer sb = new StringBuffer();
		
		int n = Integer.parseInt(br.readLine());
		int back = 0, x;
		Queue<Integer> q = new LinkedList<>();

        String s;

		for (int i = 0; i < n; i++) {
			st = new StringTokenizer(br.readLine());
			s = st.nextToken();
			
			switch (s) {
			case "push": {
				x = Integer.parseInt(st.nextToken());
				q.add(x);
				back = x;
				break;
			}
			case "pop": {
				if (q.isEmpty()) {
					sb.append(-1).append("\n");
				} else {
					sb.append(q.poll()).append("\n");
				}
				break;
			}
			case "size": {
				sb.append(q.size()).append("\n");
				break;
			}
			case "empty": {
				if (q.isEmpty()) {
					sb.append(1).append("\n");
				} else {
					sb.append(0).append("\n");
				}
				break;
			}
			case "front": {
				if (q.isEmpty()) {
					sb.append(-1).append("\n");
				} else {
					sb.append(q.peek()).append("\n");
				}
				break;
			}
			case "back": {
				if (q.isEmpty()) {
					sb.append(-1).append("\n");
				} else {
					sb.append(back).append("\n");
				}
				break;
			}
			default:
				break;
			}
		}
		System.out.println(sb);
	}
}