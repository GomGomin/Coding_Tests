
import java.io.*;
import java.lang.reflect.Array;
import java.math.BigInteger;
import java.util.*;


public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        

        int M = Integer.parseInt(br.readLine());
        int N = Integer.parseInt(br.readLine());
        
        int sum = 0;
        ArrayList<Integer> list = new ArrayList<>();
        for(int i = M; i<=N; i++) {
        	if(i == 1) {
        		continue;
        	}
        	boolean sosu = true;
        	for(int j = 2 ; j<=(int)Math.sqrt(i); j++) {
        		if(i % j == 0) {
        			sosu = false;
        			break;
        		}
        	}
        	if(sosu) {
        		sum+= i;
        		list.add(i);
        	}
        }
        
        if(list.size() == 0) {
        	bw.write("-1");
        }else {
            bw.write(String.valueOf(sum) + "\n" + String.valueOf(list.get(0)));
        }
        
        bw.flush();
        bw.close();
	}
	

}
 
