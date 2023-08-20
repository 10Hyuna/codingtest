import java.io.*;
import java.util.*;

public class Main {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
        StringTokenizer st;
		
		int n = Integer.parseInt(br.readLine());
		int[] card = new int[n];		
		
        st = new StringTokenizer(br.readLine());
		for (int i = 0; i < n; i++) {
			card[i] = Integer.parseInt(st.nextToken());
		}
        
		Arrays.sort(card);
		
		int m = Integer.parseInt(br.readLine());
        int num;
        
		st = new StringTokenizer(br.readLine());
        
		for(int i = 0; i < m; i++) {
			num = Integer.parseInt(st.nextToken());
            
			if(Arrays.binarySearch(card, num) < 0) sb.append("0 ");
			else sb.append("1 ");
		}
		System.out.println(sb);
	}
}