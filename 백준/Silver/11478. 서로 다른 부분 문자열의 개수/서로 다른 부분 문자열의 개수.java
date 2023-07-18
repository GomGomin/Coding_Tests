
import java.io.*;
import java.util.*;


public class Main {
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
              
        String s = br.readLine();
        
        HashSet<String> set = new HashSet<String>();
        
        for(int i=0; i<s.length(); i++) {
        	for(int j=i+1; j<=s.length(); j++) {
        		set.add(s.substring(i,j));
        	}
        }
        
        bw.write(String.valueOf(set.size()));
        
        bw.flush();
        bw.close();
	}
}




