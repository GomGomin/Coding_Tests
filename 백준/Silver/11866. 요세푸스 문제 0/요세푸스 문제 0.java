
import java.io.*;
import java.util.*;


public class Main {

	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        
        StringTokenizer st = new StringTokenizer(br.readLine());
        
        int n = Integer.parseInt(st.nextToken());
        int k = Integer.parseInt(st.nextToken());
        
        Queue<Integer> queue = new LinkedList<>();
        
        int[] answer = new int[n];
        
        for(int i=1; i<=n; i++) {
        	queue.add(i);
        }
        
        for(int i=0; i<n; i++) {
        	for(int j=0; j<k-1; j++) {
        		int a =  queue.poll();
        		queue.add(a);
        	}
        	answer[i] = queue.poll();
        }
        StringBuilder sb = new StringBuilder();
        bw.write("<");
        for(int i=0; i<n; i++) {
        	if(i == n -1) {
        		sb.append(answer[i]);
        	}else {
        		sb.append(answer[i]+", ");
        	}
        }
        bw.write(sb.toString()+">");
        
        bw.flush();
        bw.close();
	}
}
 

 
