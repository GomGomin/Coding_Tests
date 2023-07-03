
import java.io.*;
import java.util.*;
import java.util.stream.IntStream;


public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        
    	
    	boolean[][] white = new boolean[100][100];
    	
    	int n = Integer.parseInt(br.readLine());
    	
    	for(int i = 0; i<n; i++) {
    		StringTokenizer st = new StringTokenizer(br.readLine());
    		int x = Integer.parseInt(st.nextToken());
    		int y = Integer.parseInt(st.nextToken());
    		for(int j=x; j<x+10; j++) {
    			for(int k=y; k<y+10; k++) {
    				white[j][k] = true;
    			}
    		}
    	}
    	
    	int count = 0;
    	for(int i = 0 ; i<white.length; i++) {
    		for(int j = 0; j<white[i].length; j++) {
    			if(white[i][j]) {
    				count++;
    			}
    		}
    	}
    	
    	bw.write(String.valueOf(count));
    	
        bw.flush();
        bw.close();
	}
	
}
 