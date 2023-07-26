
import java.io.*;
import java.util.*;


public class Main {

	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        
        int n = Integer.parseInt(br.readLine());
        
        Stack<Integer> stack = new Stack<>();
        
        for(int i=0; i<n; i++) {
        	String command = br.readLine();
        	if(command.contains("push")){
        		String[] arr = command.split(" ");
        		stack.push(Integer.parseInt(arr[1]));
        	}else if(command.equals("pop")) {
        		if(stack.empty()) {
        			bw.write("-1"+"\n");
        		}else {
        		int a = stack.peek();
        		bw.write(String.valueOf(a)+"\n");
        		stack.pop();
        		}
        	}else if(command.equals("size")) {
        		int a = stack.size();
        		bw.write(String.valueOf(a)+"\n");
        	}else if(command.equals("empty")) {
        		if(stack.empty()) {
        			bw.write("1"+"\n");
        		}else {
        			bw.write("0"+"\n");
        		}
        	}else if(command.equals("top")) {
        		if(stack.empty()) {
        			bw.write("-1"+"\n");
        		}else {
        		int a = stack.peek();
        		bw.write(String.valueOf(a)+"\n");
        		}
        	}
        	
        }
        
        
        bw.flush();
        bw.close();
	}
}
 

 
