import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

public class Main {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();

		int n = Integer.parseInt(br.readLine());
		Set<String> set = new HashSet<String>();
        
		for(int i = 0; i < n; i++) {
			String[] log = br.readLine().split(" ");
            
			if(log[1].equals("enter")) {
				set.add(log[0]);
			}
			else {
				set.remove(log[0]);
			}
		}
		
		ArrayList<String> list = new ArrayList<>(set);
		Collections.sort(list, Collections.reverseOrder());
        
		for(String s : list) {
			sb.append(s + "\n");
		}
        
		System.out.println(sb);
	}
}