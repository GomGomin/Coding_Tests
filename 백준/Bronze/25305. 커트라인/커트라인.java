
import java.io.*;
import java.lang.reflect.Array;
import java.math.BigInteger;
import java.util.*;


public class Main {

	public static boolean[][] line;
	public static int min = 64;
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        
        StringTokenizer st = new StringTokenizer(br.readLine());
        
        int N = Integer.parseInt(st.nextToken());
        
        int k = Integer.parseInt(st.nextToken());
        
        int[] price = new int[N];
        
        st = new StringTokenizer(br.readLine());
        
        for(int i = 0; i < N ; i++) {
        	price[i] = Integer.parseInt(st.nextToken());
        }
        
        Arrays.sort(price);
        
        bw.write(String.valueOf(price[price.length-k]));
        
        bw.flush();
        bw.close();
	}
}
 
