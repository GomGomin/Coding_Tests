
import java.io.*;
import java.util.*;


public class Main {

	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        
        StringBuilder sb = new StringBuilder();
        
        while(true) {
        String str = br.readLine();
        Stack<Character> stack = new Stack<>();
	        if(str.equals(".")) {
	        	break;
	        }else {
	        	str = str.replaceAll("[A-Z,a-z,.,\\s]","");
	        }
	    char[] ch = str.toCharArray();
	    for(char c : ch) {
	    	if(c == ')' && !stack.empty()) {
	    		if(stack.peek() == '(') {
	    			stack.pop();
	    		}else {
	    			stack.push(c);
	    		}
	    	}else if(c == ']' && !stack.empty()) {
	    		if(stack.peek() == '[') {
	    			stack.pop();
	    		}else {
	    			stack.push(c);
	    		}
	    	}else {
	    		stack.push(c);
	    	}
	    }
	    if(stack.empty()) {
	    	bw.write("yes"+"\n");
	    }else {
	    	bw.write("no\n");
	    }
        }
        bw.write(sb.toString());
        bw.flush();
        bw.close();
	}
}
 

 
