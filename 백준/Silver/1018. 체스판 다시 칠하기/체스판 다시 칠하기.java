
import java.io.*;
import java.lang.reflect.Array;
import java.math.BigInteger;
import java.util.*;


public class Main {

	public static boolean[][] line;
	public static int min = 64;
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        
        int answer = 64;
        
        StringTokenizer st = new StringTokenizer(br.readLine());
        
        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());
        
        line = new boolean[n][m];
        
        for(int i = 0; i<n; i++) {
        	String str = br.readLine();
        	for(int j = 0; j<m; j++) {
        		if(str.charAt(j) == 'B') {
        			line[i][j] = true;
        		}else {
        			line[i][j] = false;
        		}
        	}
        }
        
        
        for(int i = 0; i<n-7; i++) {
        	for(int j =0; j<m-7; j++) {
        		min = BW(i,j);
        		answer = Math.min(answer, min);
        	}
        }
        
        bw.write(String.valueOf(answer));

        bw.flush();
        bw.close();
	}

	private static int BW(int i, int j) {
		int count = 0;

		boolean color = line[i][j];
		
		for(int x = i; x<i+8; x++) {
			for(int y = j; y<j+8; y++ ) {
				if(line[x][y] != color) {
					count++;
				}
				color = !color;
			}
			color = !color;
		}
		
		count = Math.min(count, 64-count);
				
		return Math.min(min, count);
	}
}
 
