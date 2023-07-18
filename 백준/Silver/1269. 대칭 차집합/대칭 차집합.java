
import java.io.*;
import java.util.*;


public class Main {
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
              
        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());
        
        HashSet<String> set1 = new HashSet<String>();        
        
        st = new StringTokenizer(br.readLine());
        
        for(int i=0; i<n; i++) {
        	set1.add(st.nextToken());
        }
        
        st = new StringTokenizer(br.readLine());
        for(int i=0; i<m; i++) {
        	String num = st.nextToken();
        	if(set1.contains(num)) {
        		set1.remove(num);
        	}else {
        		set1.add(num);
        	}
        }
        
        bw.write(String.valueOf(set1.size()));
        
        bw.flush();
        bw.close();
	}
}




