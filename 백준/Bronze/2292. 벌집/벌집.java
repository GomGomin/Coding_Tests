
import java.io.*;
import java.util.*;


public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        
        int N = Integer.parseInt(br.readLine());
        int x = 1;
        int six = 1;
        while(x < N) {
        	x +=(six*6);
        	six++;
        }
    	bw.write(String.valueOf(six));
        bw.flush();
        bw.close();
	}
	
}
 
