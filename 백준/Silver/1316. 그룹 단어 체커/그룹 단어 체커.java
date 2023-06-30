
import java.io.*;
import java.util.*;


public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        
        int n = Integer.parseInt(br.readLine());
        int count = 0;
        for(int i = 0; i<n; i++) {
        	String str = br.readLine();
        	String[] strarr = str.split("");
        	boolean bo = true;
        	for(int j = 1; j<strarr.length; j++) {
        		if(str.indexOf(strarr[j]) < str.indexOf(strarr[j-1])) {
        			bo = false;
        			break;
        		}
        	}
    		count += bo ? 1 : 0;
        }
        
        bw.write(String.valueOf(count));
        bw.flush();
        bw.close();
	}
	
}
 