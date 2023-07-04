
import java.io.*;
import java.util.*;


public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        
        int N = Integer.parseInt(br.readLine());
        
        int x = 0;
        int count = 0;
        while(x < N) {
        	count++;
        	x = count*(count+1) /2;
        }
        int ja = 0;
        int mo = 0;
        if(count % 2 == 0) {
        	ja = N-(count-1)*count/2;
        	mo = (count-1)*count/2+count+1 - N;
        }else {
        	ja = (count-1)*count/2+count+1 - N;
        	mo = N-(count-1)*count/2;
        }
        
        String answer = ja + "/" + mo;
        bw.write(String.valueOf(answer));
        bw.flush();
        bw.close();
	}
	

}
 
