
import java.io.*;
import java.util.*;


public class Main {

	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        
        int n = Integer.parseInt(br.readLine());
        
        for(int i=0; i<n; i++) {
        	StringTokenizer st = new StringTokenizer(br.readLine());
        	        	
        	int a = Integer.parseInt(st.nextToken());
        	int b = Integer.parseInt(st.nextToken());
        	
        	st= new StringTokenizer(br.readLine());
        	
        	LinkedList<int[]> print = new LinkedList<>();

        	for(int j=0; j<a; j++) {
        		print.add(new int[] {j,Integer.parseInt(st.nextToken())});
        	}
        	
        	int count = 0;
        	
        	while(true) {
        		boolean priority = true;
        		int[] document = print.poll();
        		
        		for(int[] p : print) {
        			if(document[1] < p[1]) {
        				priority = false;
        				break;
        			}
        		}
        		
        		if(priority) {
        			count++;
        			if(document[0] == b) {
        				break;
        			}
        		}else {
        			print.add(document);
        		}
        	}
        	
        	bw.write(String.valueOf(count)+"\n");
        }
        
        bw.flush();
        bw.close();
	}
}
 

 
