
import java.io.*;
import java.util.*;


public class Main {
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        
        int n = Integer.parseInt(br.readLine());
                
    	StringTokenizer st = new StringTokenizer(br.readLine());
    	
    	HashSet<Integer> set = new HashSet<Integer>();
    	
        int[] num = new int[n];
        for(int i=0; i<n; i++) {
        	int number = Integer.parseInt(st.nextToken());
        	set.add(number);
        	num[i] = number;
        }

        
        ArrayList<Integer> list = new ArrayList<>(set);

        Collections.sort(list);
        
        HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();
        
        int idx = 0;
        
        for(int i : list) {
        	map.put(i,map.getOrDefault(i, idx++));
        }
        
        for(int i : num) {
        	bw.write(String.valueOf(map.get(i))+" ");
        }
        
        
        bw.flush();
        bw.close();
	}
}




