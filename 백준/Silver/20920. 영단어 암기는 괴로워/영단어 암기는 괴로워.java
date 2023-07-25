
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
        
        for(int i=0; i<n; i++) {
        	String word = br.readLine();
        	if(word.length() < m) {
        		continue;
        	}else {
        		map.put(word, map.getOrDefault(word, 0)+1);
        	}
        }
        
        List<String> keyset = new ArrayList<>(map.keySet());
        
        keyset.sort(new Comparator<String>() {
			@Override
			public int compare(String o1, String o2) {
				if(map.get(o1) == map.get(o2)) {
					Integer a = o1.length();
					Integer b = o2.length();
					if(a == b) {
						return o1.compareTo(o2);
					}
					return b.compareTo(a);
				}
				return map.get(o2).compareTo(map.get(o1));
			}
		});
        
        StringBuilder sb = new StringBuilder();
        
        for(String s : keyset) {
        	sb.append(s+"\n");
        }
        
        bw.write(sb.toString());
        
        
        bw.flush();
        bw.close();
	}
}
 

 
