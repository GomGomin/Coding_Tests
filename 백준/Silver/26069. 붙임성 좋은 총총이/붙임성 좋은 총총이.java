
import java.io.*;
import java.util.*;


public class Main {

	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        
        int n = Integer.parseInt(br.readLine());
        HashSet<String> set = new HashSet<>();
        set.add("ChongChong");
        for(int i=0; i<n; i++) {
        	String[] user = br.readLine().split(" ");
        	if(set.contains(user[0]) || set.contains(user[1])) {
        		set.add(user[0]);
        		set.add(user[1]);
        	}
        }
        bw.write(String.valueOf(set.size()));
    	
        bw.flush();
        bw.close();
	}
}
 

 
