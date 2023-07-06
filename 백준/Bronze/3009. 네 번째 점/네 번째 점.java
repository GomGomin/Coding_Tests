
import java.io.*;
import java.lang.reflect.Array;
import java.math.BigInteger;
import java.util.*;


public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        
        ArrayList<String> list1 = new ArrayList<>();
        ArrayList<String> list2 = new ArrayList<>();

        
        for(int i = 0; i<3; i++) {
        	StringTokenizer st = new StringTokenizer(br.readLine());
        	String a = st.nextToken();
        	String b = st.nextToken();
        	if(list1.contains(a)) {
        		list1.remove(a);
        	}else {
        		list1.add(a);
        	}
        	if(list2.contains(b)) {
        		list2.remove(b);
        	}else {
        		list2.add(b);
        	}
        }
        
        bw.write(list1.get(0)+ " "+list2.get(0));
        
        bw.flush();
        bw.close();
	}
	

}
 
