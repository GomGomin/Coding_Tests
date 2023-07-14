
import java.io.*;

import java.util.*;


public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        
        int n = Integer.parseInt(br.readLine());
        
        String[] str = new String[n];
        
        for(int i=0; i<n; i++) {
        	str[i] = br.readLine();
        }
        
        Arrays.sort(str, new Comparator<String>() {
			@Override
			public int compare(String o1, String o2) {
				if(o1.length() == o2.length()) {
					return o1.compareTo(o2);
				}
				return o1.length() - o2.length();
			}
		});
        
        StringBuilder sb = new StringBuilder();
        
        String answer = "";
        for(int i=0; i<n; i++) {
            if(answer.contains(str[i])) {
            	continue;
            }
            answer = sb.append(str[i]+"\n").toString();
        }
        bw.write(answer);
        
        bw.flush();
        bw.close();
	}
}
 
