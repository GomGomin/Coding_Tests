
import java.io.*;
import java.util.*;


public class Main {

	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        
        int n = Integer.parseInt(br.readLine());
        StringBuilder sb = new StringBuilder();
        Queue<Integer> queue = new LinkedList<>();
        int last = 0;
        for(int i=0; i<n; i++) {
        	String str = br.readLine();
        	String[] arr = str.split(" ");
        	if(str.contains("push")) {
        		int value = Integer.parseInt(arr[1]);
        		queue.add(value);
        		last = value;
        	}else if(str.equals("pop")) {
        		if(queue.isEmpty()) {
        			sb.append("-1\n");
        		}else {
        			int a = queue.poll();
        			sb.append(a+"\n");
        		}
        	}else if(str.equals("size")) {
        		int a = queue.size();
        		sb.append(a+"\n");
        	}else if(str.equals("empty")) {
        		if(queue.isEmpty()) {
        			sb.append("1\n");
        		}else {
        			sb.append("0\n");
        		}
        	}else if(str.equals("front")) {
        		if(queue.isEmpty()) {
        			sb.append("-1\n");
        		}else {
        			int a = queue.peek();
        			sb.append(a+"\n");
        		}
        	}else if(str.equals("back")) {
        		if(queue.isEmpty()) {
        			sb.append("-1\n");
        		}else {
        			sb.append(last+"\n");
        		}
        	}
        	
        }
        bw.write(sb.toString());
        bw.flush();
        bw.close();
	}
}
 

 
