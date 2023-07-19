
import java.io.*;
import java.util.*;


public class Main {
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
            
        StringTokenizer st = new StringTokenizer(br.readLine());
        
        long A = Long.parseLong(st.nextToken());
        long B = Long.parseLong(st.nextToken());
        long lcm = A*B/gcd(A,B);
        bw.write(String.valueOf(lcm));
        bw.flush();
        bw.close();
	}

	private static long gcd(long a, long b) {
		
		if(a%b ==0) {
			return b;
		}
		
		return gcd(b,a%b);
	}
}




