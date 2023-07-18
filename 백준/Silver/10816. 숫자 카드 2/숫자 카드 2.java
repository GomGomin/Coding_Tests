
import java.io.*;
import java.util.*;


public class Main {
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
              
        int n = Integer.parseInt(br.readLine());
        
        HashMap<String, Integer> map = new HashMap<String, Integer>();
        
        StringTokenizer st = new StringTokenizer(br.readLine());
        for(int i=0; i<n; i++) {
        	String card = st.nextToken();
        	map.put(card, map.getOrDefault(card, 0)+1);
        }
        
        int m = Integer.parseInt(br.readLine());
        
        st = new StringTokenizer(br.readLine());
        for(int i=0; i<m; i++) {
        	String number = st.nextToken();
        	int answer = map.getOrDefault(number,0);
        	bw.write(String.valueOf(answer)+" ");
        }
        
        bw.flush();
        bw.close();
	}
}




