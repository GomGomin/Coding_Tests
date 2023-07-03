
import java.io.*;
import java.util.*;
import java.util.stream.IntStream;


public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        
    	
    	String[][] input = new String[5][15];
    	
    	for(int i = 0; i<5; i++) {
    		String[] strarr = br.readLine().split("");
    		for(int j = 0; j<strarr.length; j++){
    			input[i][j] = strarr[j];
    		}
    		for(int j = strarr.length; j<15; j++) {
    			input[i][j] = "*";
    		}
    	}
    	
    	String answer = "";
    	
    	for(int i = 0; i<15; i++) {
    		for(int j = 0; j<5; j++) {
    			if(!input[j][i].equals("*")) {
    				answer +=input[j][i];
    			}
    		}
    	}
    	
    	bw.write(answer);
    	
        bw.flush();
        bw.close();
	}
	
}
 