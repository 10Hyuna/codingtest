import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        HashSet userName = new HashSet(); 

        int n = Integer.parseInt(br.readLine());
        int count = 0;
        String chat;
        
        for(int i = 0; i < n; i++){
            chat = br.readLine();

            if(chat.equals("ENTER")){
                count += userName.size(); 

                userName = new HashSet();
            } else{ 
                userName.add(chat);
            }
        }

        count += userName.size();
        
        System.out.println(count);
    }
}