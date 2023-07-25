
import java.io.*;
import java.util.*;


public class Main {

	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        
        int n = Integer.parseInt(br.readLine());
        int count = 0;
        HashSet<String> set = new HashSet<>();
        for(int i=0; i<n; i++) {
        	String user = br.readLine();
        	if(user.equals("ENTER")) {
        		count += set.size();
                set = new HashSet<>();
        	}else {
        		set.add(user);
        	}
        }
        count+=set.size();
        bw.write(String.valueOf(count));
    	
        bw.flush();
        bw.close();
	}
}
 

 
