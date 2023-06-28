
import java.io.*;
import java.util.*;


public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        
        
        String[] strarr = br.readLine().split(" ",0);

        ArrayList<String> list = new ArrayList<>();
        for(String str : strarr) {
        	if(!str.equals(""))
        	list.add(str);
        }
        bw.write(String.valueOf(list.size()));
 
        bw.flush();
        bw.close();
	}
	
}
