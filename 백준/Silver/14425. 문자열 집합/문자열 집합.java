
import java.io.*;
import java.util.*;


public class Main {
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        
        int answer =0;
        
        StringTokenizer st = new StringTokenizer(br.readLine());
        
        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());
        
        HashMap<String, Integer> list = new HashMap<String, Integer>();
                
    	for(int i=0; i<n; i++) {
    		list.put(br.readLine(), 1);
    	}
        
    	for(int i=0; i<m; i++) {
    		if(list.containsKey(br.readLine())) {
    			answer++;
    		}
    	}
    	

        
    	bw.write(String.valueOf(answer));
    	
        bw.flush();
        bw.close();
	}
}




