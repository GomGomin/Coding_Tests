
import java.io.*;
import java.lang.reflect.Array;
import java.math.BigInteger;
import java.util.*;


public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        
        StringTokenizer st = new StringTokenizer(br.readLine());
        
        int a = Integer.parseInt(st.nextToken());
        int b = Integer.parseInt(st.nextToken());
        int c = Integer.parseInt(st.nextToken());

        int max = Math.max(a,Math.max(b, c));
        int min = Math.min(a,Math.min(b, c));
        int middle = a+b+c - max -min;
        
        if( middle + min <= max) {
        	bw.write(String.valueOf(middle + min - 1 + middle + min));
        }else {
        	bw.write(String.valueOf(max + middle + min));
        }
        
        bw.flush();
        bw.close();
	}
}
 
