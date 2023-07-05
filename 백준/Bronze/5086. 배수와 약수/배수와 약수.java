
import java.io.*;
import java.math.BigInteger;
import java.util.*;


public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        while(true) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            int A = Integer.parseInt(st.nextToken());
            int B = Integer.parseInt(st.nextToken());
            if(A == 0 && B == 0) {
            	break;
            }
            if(B % A == 0) {
            	bw.write("factor");
            }else if(A % B == 0) {
            	bw.write("multiple");
            }else {
            	bw.write("neither");
            }
            bw.write("\n");
        }
        
        bw.flush();
        bw.close();
	}
	

}
 
