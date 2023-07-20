
import java.io.*;
import java.util.*;


public class Main {
	
	public static boolean[] eartos;
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
            
        StringBuilder sb = new StringBuilder();
        
        int prime = 1000000;
        
        eartos = new boolean[prime+1];
        
        getprime();
        
        int t = Integer.parseInt(br.readLine());
        
        
        for(int i=0; i<t; i++) {
        	int n = Integer.parseInt(br.readLine());
        	int count = 0;
            HashSet<Integer> set = new HashSet<Integer>();
            for(int j=2; j<=n-2; j++) {
            	if(!eartos[j]) {
            		int x = n-j;
            		if(!eartos[x]) {
            			if(!set.contains(j)) {
                			set.add(j);
                			set.add(x);
                			count++;
            			}
            		}
            	}
            }
        	sb.append(count+"\n");
        }
        
        bw.write(sb.toString());
        
        bw.flush();
        bw.close();
	}

	private static void getprime() {
		eartos[0] = eartos[1] = true;
		
		for(int i=2; i<=Math.sqrt(eartos.length); i++) {
			if(eartos[i]) {
				continue;
			}
			for(int j=i*i; j<eartos.length; j+=i ) {
				eartos[j] = true;
			}
		}
		
		
	}
}