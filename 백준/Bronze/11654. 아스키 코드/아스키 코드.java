
import java.io.*;
import java.util.*;


public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        
        String str = br.readLine();
        int n = (int)str.charAt(0);
        bw.write(String.valueOf(n));

        
        bw.flush();
        bw.close();
	}
	
}
