
import java.io.*;
import java.util.*;


public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        
        String[] str = br.readLine().split("");
        int n = 1;
        for(int i = 0; i<str.length / 2; i++) {
        	if(!str[i].equals(str[str.length-1-i])) {
        		n = 0;
        		break;
        	}
        }
        bw.write(String.valueOf(n));
        bw.flush();
        bw.close();
	}
	
}
 