import java.io.*;
import java.util.*;

public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		String str = br.readLine();
		Map<String, Integer> substring_map = new HashMap<String, Integer>();

		for (int i = 0; i < str.length(); i++) {
			for (int j = 0; j < str.length() - i; j++) {
				substring_map.put(str.substring(j, j + i + 1), 1);
			}
		}
		System.out.println(substring_map.size());
	}
}