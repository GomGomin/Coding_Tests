
import java.io.*;
import java.util.*;


public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        
        int n = Integer.parseInt(br.readLine());
        
        people[] p = new people[n];
        
        for(int i=0; i<n; i++) {
        	StringTokenizer st = new StringTokenizer(br.readLine());
        	p[i] = new people(Integer.parseInt(st.nextToken()), st.nextToken());
        }
        
        Arrays.sort(p, new Comparator<people>() {
			@Override
			public int compare(people o1, people o2) {
				return o1.age - o2.age;
			}
		});
        
        StringBuilder sb = new StringBuilder();
        for(int i=0; i<p.length; i++) {
        	sb.append(p[i]);
        }
        
        bw.write(sb.toString());
        
        bw.flush();
        bw.close();
	}
	
	public static class people{
		
		int age;
		String name;
		
		public people(int age, String name) {
			this.age = age;
			this.name = name;
		}
		
		@Override
		public String toString() {
			return age + " " + name + "\n";
		}
		
	}
}




