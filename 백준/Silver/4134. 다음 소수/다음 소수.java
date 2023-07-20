
import java.io.*;
import java.math.BigInteger;
import java.util.*;


public class Main {
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
            
        int n = Integer.parseInt(br.readLine());
        
        for(int i=0; i<n; i++) {
        	BigInteger bi = new BigInteger(br.readLine());
        	if(bi.isProbablePrime(10)) {
        		bw.write(String.valueOf(bi)+"\n");
        	}else {
        		bw.write(String.valueOf(bi.nextProbablePrime())+"\n");
        	}
        }
                
        bw.flush();
        bw.close();
	}
}




