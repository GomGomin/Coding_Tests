
import java.io.*;
import java.util.*;


public class Main {
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
            
        StringTokenizer st = new StringTokenizer(br.readLine());
        
        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());
        
        StringBuilder sb = new StringBuilder();
        
        for(int i=n; i<=m; i++) {
        	boolean s = false;
        	s = S(i);
        	if(s) {
        		sb.append(i+"\n");
        	}
        }
        
        bw.write(sb.toString());
        
        bw.flush();
        bw.close();
	}

	private static boolean S(int x) {
		
		if(x == 1) {
			return false;
		}
		
		for(int i=2; i<=Math.sqrt(x); i++) {
			if(x % i == 0) {
				return false;
			}
		}
		
		return true;
	}
}