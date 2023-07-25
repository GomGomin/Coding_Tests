
import java.io.*;
import java.util.*;


public class Main {

	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        
        int n = Integer.parseInt(br.readLine());
        int[] arr= new int[n];
    	StringTokenizer st = new StringTokenizer(br.readLine());

    	for(int i=0; i<n; i++) {
    		arr[i] = Integer.parseInt(st.nextToken());
        }
        
    	Arrays.sort(arr);
    	
    	int answer = arr[arr.length-1] * arr[0];
    	
    	bw.write(String.valueOf(answer));
    	
        bw.flush();
        bw.close();
	}
}
 

 
