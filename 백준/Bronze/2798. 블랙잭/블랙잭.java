
import java.io.*;
import java.lang.reflect.Array;
import java.math.BigInteger;
import java.util.*;


public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        
        StringTokenizer st = new StringTokenizer(br.readLine());
        
        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());
        
        st = new StringTokenizer(br.readLine());
        
        int[] card = new int[n];
        
        for(int i = 0; i<n; i++) {
        	card[i] = Integer.parseInt(st.nextToken());
        }
        
        int min = Integer.MAX_VALUE;
        
        int answer = 0;
        
        for(int i = 0; i<card.length-2; i++) {
        	for(int j = i+1; j<card.length-1; j++) {
        		for(int k = j+1; k<card.length; k++) {
        			if(min > m - (card[i] + card[j] + card[k]) && card[i] + card[j] + card[k] <= m) {
        				min = m - (card[i] + card[j] + card[k]);
        				answer = card[i] + card[j] + card[k];
        			}
        		}
        	}
        }
        
        bw.write(String.valueOf(answer));
        
        
        bw.flush();
        bw.close();
	}
}
 