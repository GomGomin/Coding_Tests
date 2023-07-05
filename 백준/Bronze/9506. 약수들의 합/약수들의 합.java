
import java.io.*;
import java.lang.reflect.Array;
import java.math.BigInteger;
import java.util.*;


public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        
        
        while(true) {
        	int n = Integer.parseInt(br.readLine());
        	ArrayList<Integer> list = new ArrayList<Integer>();
        	if(n == -1) {
        	break;
        	}
        	int count = 0;
        	bw.write(String.valueOf(n));
        	for(int i = 1; i<= n/2; i++) {
        		if(n % i == 0) {
        			count += i;
        			list.add(i);
        		}
        	}
        	
        	if(count != n) {
        		bw.write(" is NOT perfect.");
        	}else{
            	for(int i = 0; i<list.size(); i++) {
            		if(i == 0) {
            			bw.write(" = " + String.valueOf(list.get(i)));
            		}else {
            			bw.write(" + " + String.valueOf(list.get(i)));
            		}
            	}
        	}
        	bw.write("\n");
        }
        
        
        bw.flush();
        bw.close();
	}
	

}
 
