
import java.io.*;
import java.util.*;


public class Main {

	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        
        int n = Integer.parseInt(br.readLine());
        
        for(int i=0; i<n; i++) {
            Stack<Character> stack = new Stack<>();
        	char[] ch = br.readLine().toCharArray();
        	for(int j=0; j<ch.length; j++) {
        		if(ch[j] == ')' && !stack.empty()) {
        			if(stack.peek() == '(') {
        				stack.pop();
        			}else {
        				stack.push(ch[j]);
        			}
        		}else {
        			stack.push(ch[j]);
        		}
        	}
        	if(stack.empty()) {
        		bw.write("YES\n");
        	}else {
        		bw.write("NO"+"\n");
        	}
        }
        

        
        bw.flush();
        bw.close();
	}
}
 

 
