
import java.io.*;
import java.lang.reflect.Array;
import java.math.BigInteger;
import java.util.*;


public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        
        int N = Integer.parseInt(br.readLine());
        
        int count = 2;
        
        while(N != 1) {
        	if(N % count == 0) {
        		N /= count;
        		bw.write(String.valueOf(count)+"\n");
        		count = 2;
        		continue;
        	}
        	count++;
        }
        
        bw.flush();
        bw.close();
	}
	

}
 
