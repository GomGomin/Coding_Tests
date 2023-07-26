
import java.io.*;
import java.util.*;


public class Main {

	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        Stack<Integer> stack = new Stack<>();
        StringBuilder sb = new StringBuilder();
        int n = Integer.parseInt(br.readLine());
        int start = 0;
        for(int i=0; i<n; i++) {
        	int a = Integer.parseInt(br.readLine());
        	if(start < a) {
        		for(int j=start+1; j<=a; j++) {
        			sb.append("+\n");
        			stack.push(j);
        		}
        		start = a;
        	}else if(stack.peek() != a) {
        		sb = new StringBuilder();
        		sb.append("NO");
        			break;
        		}
        	stack.pop();
        	sb.append("-\n");
        }
        bw.write(sb.toString());
        bw.flush();
        bw.close();
	}
}
 

 
