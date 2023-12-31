
import java.io.*;
import java.util.*;


public class Main {

	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        
        int n = Integer.parseInt(br.readLine());
        
        Stack<Integer> stack = new Stack<>();
        for(int i=0; i<n; i++) {
        	int a = Integer.parseInt(br.readLine());
        	if(a != 0) {
        		stack.push(a);
        	}else {
        		stack.pop();
        	}
        }
        
        int sum = 0;
        Iterator<Integer> iter = stack.iterator();
        
        while(iter.hasNext()) {
        	sum += iter.next();
        }
        
        bw.write(String.valueOf(sum));
        
        bw.flush();
        bw.close();
	}
}
 

 
