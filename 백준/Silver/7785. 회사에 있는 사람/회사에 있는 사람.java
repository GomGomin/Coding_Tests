
import java.io.*;
import java.util.*;


public class Main {
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
              
        int n = Integer.parseInt(br.readLine());
        
        HashMap<String, String> map = new HashMap<>();

    	for(int i=0; i<n; i++) {
    		StringTokenizer st = new StringTokenizer(br.readLine());
    		map.put(st.nextToken(), st.nextToken());
    	}
        
    	Iterator<Map.Entry<String,String>> iter = map.entrySet().iterator();
    	
    	ArrayList<String> list = new ArrayList<String>();
    	
    	while(iter.hasNext()) {
    		Map.Entry<String, String> entry = iter.next();
    		if(entry.getValue().equals("enter")) {
    			list.add(entry.getKey());
    		}
    	}
    	
    	Collections.sort(list, Collections.reverseOrder());
    	
    	for(int i=0; i<list.size(); i++) {
    		bw.write(list.get(i)+"\n");
    	}

        bw.flush();
        bw.close();
	}
}




