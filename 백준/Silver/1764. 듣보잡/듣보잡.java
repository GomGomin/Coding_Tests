
import java.io.*;
import java.util.*;


public class Main {
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
              
        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());
        
        HashSet<String> listen = new HashSet<String>();
        
        for(int i=0; i<n; i++) {
        	listen.add(br.readLine());
        }
        
        int count = 0;
        ArrayList<String> list = new ArrayList<String>();
        for(int i=0; i<m; i++) {
        	String name = br.readLine();
        	if(listen.contains(name)) {
        		count++;
        		list.add(name);
        	}
        }
        
        Collections.sort(list);
        
        bw.write(String.valueOf(count)+"\n");
        for(String str : list) {
        	bw.write(str+"\n");
        }
        
        bw.flush();
        bw.close();
	}
}




