
import java.io.*;
import java.util.*;


public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        
        String str = br.readLine();
        String[] cro = {"c=","c-","dz=","d-","lj","nj","s=","z="};
        

        for(String s : cro) {
        	if(str.contains(s)) {
        		str = str.replaceAll(s, "*");
        	}
        }
        bw.write(str.length()+"");
        bw.flush();
        bw.close();
	}
	
}
 