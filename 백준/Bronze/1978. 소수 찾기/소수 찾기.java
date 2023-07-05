
import java.io.*;
import java.lang.reflect.Array;
import java.math.BigInteger;
import java.util.*;


public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        
        int n = Integer.parseInt(br.readLine());
    	StringTokenizer st = new StringTokenizer(br.readLine());
    	int count = 0;
        for(int i = 0; i<n; i++) {
        	int x = Integer.parseInt(st.nextToken());
        	int yaksu = 0;
        	for(int j = 1; j<=x/2; j++) {
        		if(x % j == 0) {
        			yaksu++;
        		}
        	}
        	if(yaksu == 1) {
        		count++;
        	}
        }
        
        bw.write(String.valueOf(count));
        bw.flush();
        bw.close();
	}
	

}
 
