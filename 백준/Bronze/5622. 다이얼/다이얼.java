
import java.io.*;
import java.util.*;


public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        
        String[] strarr = br.readLine().split("");
        String a = "ABC DEF GHI JKL MNO PQRS TUV WXYZ";
        String[] str = a.split(" ");
        int answer = 0;
        for(int i = 0; i < strarr.length; i++){
        	for(int j = 0; j<str.length; j++) {
        		if(str[j].contains(strarr[i])) {
        			answer += j+3;
        		}
        	}
        }
        	
        bw.write(String.valueOf(answer));
 
        bw.flush();
        bw.close();
	}
	
}
 