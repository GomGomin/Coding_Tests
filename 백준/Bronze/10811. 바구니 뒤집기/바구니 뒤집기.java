
import java.io.*;
import java.util.*;


public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        
        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());
        int[] arr = new int[n];
        int[] temp = new int[n];
        for(int i =0; i<n; i++) {
        	arr[i] = i+1;
        }
        
        for(int i =0; i<m; i++) {
        	st = new StringTokenizer(br.readLine());
        	int start = Integer.parseInt(st.nextToken());
        	int end = Integer.parseInt(st.nextToken());
        	temp = arr.clone();
        	for(int j = 0; j<=end-start; j++) {
        		temp[start-1+j] = arr[end-1-j];       		
        	}
        	
        	arr = temp.clone();          
        }
        
        for(int x : arr) {
        	bw.write(String.valueOf(x)+" ");
        }
        
        bw.flush();
        bw.close();
	}
	
}
