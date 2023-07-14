import java.io.*;
import java.util.*;


public class Main {

	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        
        int n = Integer.parseInt(br.readLine());
        int[][] num = new int[n][2];
        for(int i=0; i<n; i++) {
        	StringTokenizer st = new StringTokenizer(br.readLine());
        	num[i][0] = Integer.parseInt(st.nextToken());
        	num[i][1] = Integer.parseInt(st.nextToken());
        }
        
        Arrays.sort(num, (o1, o2) -> {
            if(o1[0] == o2[0]){
                return o1[1] - o2[1];
            }else{
                return o1[0] - o2[0];
            }
        });
        
        for(int i=0; i<n; i++) {
        	bw.write(String.valueOf(num[i][0]) + " " + String.valueOf(num[i][1]) + "\n");
        }
        
        bw.flush();
        bw.close();
	}
}
 
