
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
        
        int n = Integer.parseInt(br.readLine());
        int count = 0;
        while(n >= 3) {
        	if(((n-5) % 5 == 0 || (n-3) % 5 == 0) && n >= 5) {
        		n-=5;
        		count++;	
        	}else {
        		n-=3;
        		count++;
        	}
        }

        if(n != 0) {
        	bw.write("-1");
        }else {
        	bw.write(String.valueOf(count));
        }
        
        bw.flush();
        bw.close();
	}
}
 
