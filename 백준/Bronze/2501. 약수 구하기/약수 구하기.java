
import java.io.*;
import java.lang.reflect.Array;
import java.math.BigInteger;
import java.util.*;


public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        
        StringTokenizer st = new StringTokenizer(br.readLine());
        
        int A = Integer.parseInt(st.nextToken());
        int B = Integer.parseInt(st.nextToken());
        int count = 0;
        int num = 0;
        for(int i = 1; i<=A; i++) {
        	if(A % i == 0) {
        		count++;
        	}
        	if(count == B) {
        		num = i;
        		break;
        	}
        }
        
        bw.write(String.valueOf(num));
        bw.flush();
        bw.close();
	}
	

}
 
