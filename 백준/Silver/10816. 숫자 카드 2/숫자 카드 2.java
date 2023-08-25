import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();
        
		int n = Integer.parseInt(br.readLine());
        int value;
		
		StringTokenizer st = new StringTokenizer(br.readLine());
        
		for(int i = 0; i < n; i++) {
			value = Integer.parseInt(st.nextToken());
            
			if(map.get(value) == null) {
                map.put(value, 1);
            } else {
                map.put(value, map.get(value) + 1);
            }
		}
		
		int m = Integer.parseInt(br.readLine());
		
		st = new StringTokenizer(br.readLine());
		for(int i = 0; i < m; i++) {
			value = Integer.parseInt(st.nextToken());
            
			if(map.get(value) == null) {
                sb.append(0).append(" ");
            } else {
                sb.append(map.get(value)).append(" ");
            }
		}
		System.out.println(sb);
	}
}