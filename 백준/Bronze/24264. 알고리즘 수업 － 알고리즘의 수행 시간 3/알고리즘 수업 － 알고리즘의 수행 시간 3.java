
import java.io.*;
import java.lang.reflect.Array;
import java.math.BigInteger;
import java.util.*;


public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        
        long n = Long.parseLong(br.readLine());
        
        bw.write(String.valueOf(n*n) + "\n" + "2");
        
        
        bw.flush();
        bw.close();
	}

}
 