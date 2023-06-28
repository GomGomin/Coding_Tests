
import java.io.*;
import java.util.*;


public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        
        
        int n = Integer.parseInt(br.readLine());
        
        for(int i = 0; i<n; i++) {
        	StringTokenizer st = new StringTokenizer(br.readLine());
        	
        	int x = Integer.parseInt(st.nextToken());
        	String[] strarr = st.nextToken().split("");
        	for(String str : strarr) {
	        	for(int j=0; j<x; j++) {
	        		bw.write(str);
	        	}
        	}
        	bw.write("\n");
        }
        
        bw.flush();
        bw.close();
	}
	
}
