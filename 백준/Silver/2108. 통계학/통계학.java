
import java.io.*;
import java.util.*;


public class Main {

	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        
        int n = Integer.parseInt(br.readLine());
        int[] arr = new int[8001];
        int sum = 0;
        int middle = 0;
        int mode = 0;
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
        
        for(int i=0; i<n; i++) {
        	int a = Integer.parseInt(br.readLine());
        	sum += a;
        	arr[a+4000]++;
        	if(a > max) {
        		max = a;
        	}
        	if(a < min) {
        		min = a;
        	}
        }
        
        int count = 0;
        int mod_max = 0;
        
        boolean flag = false;
        
        for(int i= min+4000; i<=max+4000; i++) {
        	if(arr[i] > 0) {
        		if(count < (n+1) / 2) {
        			count += arr[i];
        			middle = i-4000;
        		}
        		
        		if(mod_max < arr[i]) {
        			mod_max = arr[i];
        			mode = i - 4000;
        			flag = true;
        		}else if(mod_max == arr[i] && flag == true) {
        			mode = i - 4000;
        			flag = false;
        		}
        	}
        }
        
        StringBuilder sb = new StringBuilder();

        int san = (int)Math.round((double)sum / n);
        int range = max - min;
        sb.append(san+"\n"+middle+"\n"+mode+"\n"+range);
        bw.write(sb.toString());
        bw.flush();
        bw.close();
	}
}
 

 
