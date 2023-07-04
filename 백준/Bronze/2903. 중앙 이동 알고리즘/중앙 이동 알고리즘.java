
import java.io.*;
import java.util.*;


public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        
        int N = Integer.parseInt(br.readLine());
       
        int x = (int)Math.pow(2,N-1);
        
        bw.write(String.valueOf((int)Math.pow(x+x+1,2)));
    	
        bw.flush();
        bw.close();
	}
	
}
 
