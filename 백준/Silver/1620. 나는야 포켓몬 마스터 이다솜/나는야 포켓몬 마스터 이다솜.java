
import java.io.*;
import java.util.*;


public class Main {
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
              
        StringTokenizer st = new StringTokenizer(br.readLine());
        
        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());
        
        HashMap<String,Integer> map = new HashMap<>();
        String[] name = new String[n];
        
        for(int i=0; i<n; i++) {
        	String poketmon = br.readLine();
        	name[i] = poketmon;
        	map.put(poketmon, i+1);
        }
        
        
        for(int i=0; i<m; i++) {
        	String quiz = br.readLine();
        	if(map.containsKey(quiz)) {
        		bw.write(String.valueOf(map.get(quiz))+"\n");
        	}else {
        		String idx = name[Integer.parseInt(quiz)-1];
        		bw.write(String.valueOf(idx)+"\n");
        	}
        }
        
        
        
        bw.flush();
        bw.close();
	}

	private static Integer getKey(HashMap<String, Integer> map, int parseInt) {
		// TODO Auto-generated method stub
		return null;
	}
}




