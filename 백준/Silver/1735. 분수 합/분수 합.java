
import java.io.*;
import java.util.*;


public class Main {
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
            
        StringTokenizer st = new StringTokenizer(br.readLine());
        
        int Aja = Integer.parseInt(st.nextToken());
        int Amo = Integer.parseInt(st.nextToken());
        
        st = new StringTokenizer(br.readLine());
        
        int Bja = Integer.parseInt(st.nextToken());
        int Bmo = Integer.parseInt(st.nextToken());
        
        int A = Aja*Bmo + Bja*Amo;
        int B = Amo*Bmo;
        
        int answer = gcd(A,B);
        
        A /= answer;
        B /= answer;
        
        bw.write(String.valueOf(A)+" "+String.valueOf(B));
        
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




