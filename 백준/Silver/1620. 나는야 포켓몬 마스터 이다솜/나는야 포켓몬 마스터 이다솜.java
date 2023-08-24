import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.StringTokenizer;

public class Main {
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
		StringTokenizer st = new StringTokenizer(br.readLine());
        
		int n = Integer.parseInt(st.nextToken());
		int m = Integer.parseInt(st.nextToken());
		String tmp;
        
		HashMap<Integer, String> hash1 = new HashMap<Integer, String>();
		HashMap<String, Integer> hash2 = new HashMap<String, Integer>();
		
		
		for(int i = 1; i <= n; i++) {
			tmp = br.readLine();
            
			hash1.put(i, tmp);
			hash2.put(tmp, i);
		}
		
		for(int i = 0; i < m; i++) {
			tmp = br.readLine();
            
			if(49 <= tmp.charAt(0) && tmp.charAt(0) <= 57) {
				sb.append(hash1.get(Integer.parseInt(tmp))).append("\n");
			} else {
				sb.append(hash2.get(tmp)).append("\n");
			}
		}
		System.out.println(sb);
	}
}