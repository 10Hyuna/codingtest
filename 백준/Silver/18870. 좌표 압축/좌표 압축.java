import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.StringTokenizer;
import java.util.HashMap;
import java.util.Arrays;
 
 
public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int n = Integer.parseInt(br.readLine());
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        StringBuilder sb = new StringBuilder();
        
        int rank = 0;
        int[] origin = new int[n];
		int[] sorted = new int[n];
		HashMap<Integer, Integer> rankingMap = new HashMap<Integer, Integer>();
        
		for(int i = 0; i < n; i++) {
			sorted[i] = origin[i] = Integer.parseInt(st.nextToken());
		}
		
		Arrays.sort(sorted);

		for(int v : sorted) {
			if(!rankingMap.containsKey(v)) {
				rankingMap.put(v, rank);
				rank++;
			}
		}
        
		for(int key : origin) {
			int ranking = rankingMap.get(key);
			sb.append(ranking).append(' ');
		}
		
		System.out.println(sb);
	}
}