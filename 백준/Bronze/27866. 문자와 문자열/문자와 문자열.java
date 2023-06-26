
import java.io.*;
import java.util.*;


public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        
        String str = br.readLine();
        int n = Integer.parseInt(br.readLine());
        bw.write(str.substring(n-1,n));
        
        bw.flush();
        bw.close();
	}
	
}
