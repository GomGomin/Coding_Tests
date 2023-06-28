
import java.io.*;
import java.util.*;


public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        
        StringBuilder sb = new StringBuilder();
        
        while(true) {
        	String str = br.readLine();
        	if(str == null || str.isEmpty()) {
        		break;
        	}
        	sb.append(str).append("\n");
        }

        br.close();
        bw.write(String.valueOf(sb));

        bw.flush();
        bw.close();
	}
	
}
 