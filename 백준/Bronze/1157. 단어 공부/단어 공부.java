
import java.io.*;
import java.util.*;


public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        
        String[] strarr = br.readLine().toUpperCase().split("");
        
        int[] alphabet = new int[26];
        
        for(String str : strarr) {
        	alphabet[(int)str.charAt(0)-65]++;
        }
        int max = 0;
        String answer = "";
        for(int i = 0; i<alphabet.length; i++) {
        	if(alphabet[i] > max) {
        		max = alphabet[i];
        		answer = String.valueOf((char)(i+65));
        	}else if(alphabet[i] == max) {
        		answer = "?";
        	}
        }

        bw.write(answer);
        bw.flush();
        bw.close();
	}
	
}
 