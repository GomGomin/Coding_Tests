
import java.io.*;
import java.util.*;


public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        
        int T = Integer.parseInt(br.readLine());
        
        for(int i = 0; i<T; i++) {
        	int N = Integer.parseInt(br.readLine());
        	int[] C = new int[4];
        	if(N >= 25) {
        		C[0] = N / 25;
        		N %= 25;
        	};
        	if(N >= 10) { 
        		C[1] = N / 10;
        		N %= 10;
        	};
        	if(N >= 5) {
        		C[2] = N / 5;
        		N %= 5;
        	};
        	if(N >= 1) {
        		C[3] = N / 1;
        		N %= 1;
        	}
        	for(int c : C) {
        		bw.write(String.valueOf(c)+" ");
        	};
        	bw.write("\n");
        };
    	
    	
        bw.flush();
        bw.close();
	}
	
}
 
