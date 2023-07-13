
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
        int answer = 0;
        int i = 666;
        while(true) {
        	String str = i+"";
        	if(str.contains("666")) {
        		count++;
        	}
        	if(count == n) {
        		answer = i;
        		break;
        	}
        	i++;
        }
        
        bw.write(String.valueOf(answer));
        
        bw.flush();
        bw.close();
	}
}
 
