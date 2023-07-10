
import java.io.*;
import java.lang.reflect.Array;
import java.math.BigInteger;
import java.util.*;


public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        
        while(true) {
        	StringTokenizer st = new StringTokenizer(br.readLine());
        	int a = Integer.parseInt(st.nextToken());
        	int b = Integer.parseInt(st.nextToken());
        	int c = Integer.parseInt(st.nextToken());
        	
        	if(a == 0 && b==0 && c==0) {
        		break;
        	}
        	
        	int max = Math.max(a, Math.max(b, c));
        	
        	if(a+b+c - max <= max) {
        		bw.write("Invalid");
        	}else{
        		if(a==b && b==c) {
            		bw.write("Equilateral");
        		}else if(a == b || a == c || b == c) {
        		bw.write("Isosceles");
        		}else {
        		bw.write("Scalene");
        		}
        	}
        	bw.write("\n");
        }
        
        bw.flush();
        bw.close();
	}
}
 
