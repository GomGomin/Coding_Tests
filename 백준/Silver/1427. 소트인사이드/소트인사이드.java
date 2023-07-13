
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
        
        String[] num = br.readLine().split("");
        
        Arrays.sort(num, Collections.reverseOrder());
        
        for(String s : num) {
        	bw.write(s);
        }
        
        bw.flush();
        bw.close();
	}
}
 
