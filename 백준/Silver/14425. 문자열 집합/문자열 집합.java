
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
        
        ArrayList<String> list = new ArrayList<>();
                
    	for(int i=0; i<n; i++) {
    		list.add(br.readLine());
    	}
        
    	for(int i=0; i<m; i++) {
    		if(list.contains(br.readLine())) {
    			answer++;
    		}
    	}
    	

        
    	bw.write(String.valueOf(answer));
    	
        bw.flush();
        bw.close();
	}
}




