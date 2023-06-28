
import java.io.*;
import java.util.*;


public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        
        
        String[] str = br.readLine().split(" ");
        for(int i = 0; i < str.length; i++) {
        	String temp = "";
        	for(int j = 0 ; j<str[i].length(); j++) {
        	temp += str[i].substring(str[i].length()-1-j,str[i].length()-j);
        	}
        	str[i] = temp;
        }
        String answer = Integer.parseInt(str[0]) > Integer.parseInt(str[1]) ? str[0] : str[1];
        
        bw.write(answer);
 
        bw.flush();
        bw.close();
	}
	
}
