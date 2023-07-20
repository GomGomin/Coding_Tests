
import java.io.*;
import java.util.*;


public class Main {
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
            
        StringBuilder sb = new StringBuilder();
        
        while(true) {
        	int x = Integer.parseInt(br.readLine());
        	
        	if(x == 0) {
        		break;
        	}
        	int sosu = find(x);
        	sb.append(sosu+"\n");
        }
        
        bw.write(sb.toString());
        
        bw.flush();
        bw.close();
	}

	private static int find(int x) {
		
		int start = x+1;
		int end = x*2;
		int count = 0;
		for(int i=start; i<=end; i++) {
			boolean sosu = true;
			for(int j=2; j<=Math.sqrt(i); j++) {
				if(i % j == 0) {
					sosu = false;
					break;
				}
			}
			if(sosu) {
				count++;
			}
		}
		return count;
	}
}