
import java.io.*;
import java.util.*;
import java.util.stream.IntStream;


public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        
    	
    	int[][] intarr = new int[9][9];
    	int max = 0;
    	for(int i = 0; i<9; i++) {
			StringTokenizer st = new StringTokenizer(br.readLine());
    		for(int j = 0; j<9; j++) {
    			intarr[i][j] = Integer.parseInt(st.nextToken());
    			if(intarr[i][j] > max) {
    				max = intarr[i][j];
    			}
    		}
    	}
    	int x = 0;
    	int y = 0;
    	for(int i = 0; i<9; i++) {
    		for(int j = 0; j<9; j++) {
    			if(intarr[i][j] == max) {
    				x = i+1;
    				y = j+1;
    				break;
    			}
    		}
    	}
    	
    	bw.write(String.valueOf(max) + "\n" + String.valueOf(x) + " " + String.valueOf(y));
    	
        bw.flush();
        bw.close();
	}
	
}
 