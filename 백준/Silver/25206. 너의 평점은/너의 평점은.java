
import java.awt.Point;
import java.io.*;
import java.util.*;


public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        
    	String[] grade = {"F","D0","D+","C0","C+","B0","B+","A0","A+"};
    	
    	ArrayList<String> list = new ArrayList<>(Arrays.asList(grade));
    	
        double point = 0;
        double count = 0;
        while(true) {
        	String str = br.readLine();
        	if(str == null || str.isEmpty()) {
        		break;
        	}
        	String[] strarr = str.split(" ");
        	if(strarr[2].equals("F")) {
        		point += 0 * (double)Integer.parseInt(strarr[1].substring(0,1));
        		count += (double)Integer.parseInt(strarr[1].substring(0,1));
        	}else if(!strarr[2].equals("P")) {
	        	point += ((double)list.indexOf(strarr[2])+1) / 2 * (double)Integer.parseInt(strarr[1].substring(0,1));
	        	count += (double)Integer.parseInt(strarr[1].substring(0,1));
        	}
		}
        
        bw.write(String.valueOf(point / count));
        bw.flush();
        bw.close();
	}
	
}
 