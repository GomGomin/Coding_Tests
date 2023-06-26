
import java.io.*;
import java.util.*;


public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        
        
        int[] arr = new int[26];
        for(int i = 0; i<arr.length; i++) {
        	arr[i] = -1;
        }
        String[] strarr = br.readLine().split("");
        for(int i = 0; i<strarr.length; i++) {
        	if(arr[(int)strarr[i].charAt(0)-97] == -1){
        	arr[(int)strarr[i].charAt(0)-97] = i;
        	}
        }
        for(int i : arr) {
        	bw.write(String.valueOf(i)+" ");
        }
        bw.flush();
        bw.close();
	}
	
}
