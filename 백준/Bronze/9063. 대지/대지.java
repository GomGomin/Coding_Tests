
import java.io.*;
import java.lang.reflect.Array;
import java.math.BigInteger;
import java.util.*;


public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        
        int n = Integer.parseInt(br.readLine());
        ArrayList<Integer> x = new ArrayList<Integer>();
        ArrayList<Integer> y = new ArrayList<Integer>();
        
        if(n == 1) {
        	bw.write("0");
        }else {
        	for(int i = 0; i<n; i++) {
        		StringTokenizer st = new StringTokenizer(br.readLine());
        		x.add(Integer.parseInt(st.nextToken()));
        		y.add(Integer.parseInt(st.nextToken()));
        	}
	        int a = Collections.max(x) - Collections.min(x);
	        int b = Collections.max(y) - Collections.min(y);
	        
	        bw.write(String.valueOf(a * b));
        }
        
        bw.flush();
        bw.close();
	}
}
 
