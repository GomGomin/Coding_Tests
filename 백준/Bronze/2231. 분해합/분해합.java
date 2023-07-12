
import java.io.*;
import java.lang.reflect.Array;
import java.math.BigInteger;
import java.util.*;


public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        
        int n = Integer.parseInt(br.readLine());
        
        int answer = 0;
        
        for(int i = 0; i<n; i++) {
        	int m = 0;
        	int count = i;
        	while(count > 0) {
        		m += count % 10;
        		count /= 10;
        	}
    		if(m+i == n) {
    			answer = i;
    			break;
    		}
        }
        
        bw.write(String.valueOf(answer));
        
        bw.flush();
        bw.close();
	}
}
 
