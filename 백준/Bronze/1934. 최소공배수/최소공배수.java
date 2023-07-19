
import java.io.*;
import java.util.*;


public class Main {
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
              
        int n = Integer.parseInt(br.readLine());
        
        for(int i=0; i<n; i++) {
        	StringTokenizer st = new StringTokenizer(br.readLine());
        	int A = Integer.parseInt(st.nextToken());
        	int B = Integer.parseInt(st.nextToken());
        	int gcd = gcd(Math.max(A, B), Math.min(A, B));
        	int lcm = A*B/gcd;
        	bw.write(String.valueOf(lcm)+"\n");
        }
        
        
        bw.flush();
        bw.close();
	}

	private static int gcd(int a, int b) {
		
		if(a%b ==0) {
			return b;
		}
		
		return gcd(b,a%b);
	}
}




