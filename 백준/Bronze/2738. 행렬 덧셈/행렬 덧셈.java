
import java.io.*;
import java.util.*;


public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        
    	StringTokenizer st = new StringTokenizer(br.readLine());
        
    	int a = Integer.parseInt(st.nextToken());
    	int b = Integer.parseInt(st.nextToken());
    	
    	int[][] answer = new int[a][b];
    	
    	for(int i = 0; i < a ; i++ ) {
    		st = new StringTokenizer(br.readLine());
    		for(int j = 0; j < b; j++) {
    			answer[i][j] = Integer.parseInt(st.nextToken());
    		}
    	}
    	
    	for(int i = 0; i < a ; i++ ) {
    		st = new StringTokenizer(br.readLine());
    		for(int j = 0; j < b; j++) {
    			answer[i][j] += Integer.parseInt(st.nextToken());
    			bw.write(answer[i][j] + " ");
    		}
    		bw.write("\n");
    	}
    	
        bw.flush();
        bw.close();
	}
	
}
 