
import java.io.*;
import java.util.*;


public class Main {
	static int[][] dp = new int[30][30];
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
            
        int n = Integer.parseInt(br.readLine());
        
        for(int i=0; i<n; i++) {
        	StringTokenizer st = new StringTokenizer(br.readLine());
        	int k = Integer.parseInt(st.nextToken());
        	int r = Integer.parseInt(st.nextToken());
        	
        	bw.write(String.valueOf(pa(r,k))+"\n");
        }
          
        bw.flush();
        bw.close();
	}
	
	static int pa(int k, int r) {
		if(dp[k][r] > 0) {
			return dp[k][r];
		}
		
		if(k == r || r == 0) {
			return dp[k][r] = 1;
		}
		
		return dp[k][r] = pa(k-1, r-1) + pa(k-1,r);
	}
	
}