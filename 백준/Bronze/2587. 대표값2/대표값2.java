
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
        
        ArrayList<Integer> list = new ArrayList<>();
        int sum = 0;
        for(int i = 0; i<5; i++) {
        	int x = Integer.parseInt(br.readLine());
        	sum += x;
        	list.add(x);        	
        }
        
        Collections.sort(list);
        
        bw.write(String.valueOf(sum/5) + "\n");
        bw.write(String.valueOf(list.get(2).intValue()));
        
        bw.flush();
        bw.close();
	}
}
 
