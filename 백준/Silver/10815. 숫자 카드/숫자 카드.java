
import java.io.*;
import java.util.*;


public class Main {
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        
        int n = Integer.parseInt(br.readLine());
                
        StringTokenizer st = new StringTokenizer(br.readLine());
        
        HashMap<String, Integer> map = new HashMap<String, Integer>();
        
    	for(int i=0; i<n; i++) {
    		map.put(st.nextToken(), 1);
    	}
        
    	int m = Integer.parseInt(br.readLine());
    	
    	st = new StringTokenizer(br.readLine());
    	
    	for(int i=0; i<m; i++) {
    		int answer = map.getOrDefault(st.nextToken(), 0);
    		bw.write(String.valueOf(answer)+" ");
    	}
    	
    	
        
        bw.flush();
        bw.close();
	}
}




