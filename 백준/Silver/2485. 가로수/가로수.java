
import java.io.*;
import java.util.*;


public class Main {
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
            
        int n = Integer.parseInt(br.readLine());
        
        int[] garosu = new int[n];
        
        for(int i=0; i<n; i++) {
        	garosu[i] = Integer.parseInt(br.readLine());
        }
        
        int answer = garosu[1]-garosu[0];
        for(int i=1; i<n-1; i++) {
        	answer = gcd(garosu[i+1]-garosu[i],answer);
        }
        
        int count = 0;
        for(int i=garosu[0]; i<=garosu[garosu.length-1]; i+=answer) {
        	count++;
        }
        
        
        
        bw.write(String.valueOf(count-garosu.length));
        
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




