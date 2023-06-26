
import java.io.*;
import java.util.*;


public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        
        int n = Integer.parseInt(br.readLine());
        String[] str = br.readLine().split("");
        int sum = 0;
        for(int i =0; i<n; i++) {
        	sum += Integer.parseInt(str[i]);
        }
        bw.write(String.valueOf(sum));

        
        bw.flush();
        bw.close();
	}
	
}
