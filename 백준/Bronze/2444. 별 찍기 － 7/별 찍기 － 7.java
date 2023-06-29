
import java.io.*;
import java.util.*;


public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        
        int n = Integer.parseInt(br.readLine());
        
        for(int i = 1; i<=2*n -1; i++) {
        	if(i <= n) {
        		for(int j = 0; j <n-i ; j++) {
        			bw.write(" ");
        		}
        		for(int j = 0; j < i*2-1; j++) {
        			bw.write("*");
        		}
        	}else {
        		for(int j = 0; j <i-n ; j++) {
        			bw.write(" ");
        		}
        		for(int j = 0; j < 4*n - i*2-1; j++) {
        			bw.write("*");
        		}
        	}
        	bw.write("\n");
        }
        
        bw.flush();
        bw.close();
	}
	
}
 