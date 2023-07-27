
import java.io.*;
import java.util.*;


public class Main {

	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        
        int n = Integer.parseInt(br.readLine());
        
        Queue<Integer> queue = new LinkedList<>();
        
        for(int i=1; i<=n; i++) {
        	queue.add(i);
        }
        
        while(queue.size() > 1) {
        	queue.remove();
        	int a = queue.poll();
        	queue.add(a);
        }
        
        bw.write(String.valueOf(queue.peek()));
        bw.flush();
        bw.close();
	}
}
 

 
