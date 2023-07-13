
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
        
        int[] num = new int[n];
        
        for(int i = 0; i < n; i++) {
        	num[i] = Integer.parseInt(br.readLine());
        }
        
        Arrays.sort(num);
        
        for(int i : num) {
        	bw.write(String.valueOf(i)+"\n");
        }
        
        bw.flush();
        bw.close();
	}
}
 
