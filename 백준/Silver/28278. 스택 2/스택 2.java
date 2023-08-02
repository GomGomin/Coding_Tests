
import java.io.*;
import java.lang.reflect.Array;
import java.util.*;


public class Main {


    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int n = Integer.parseInt(br.readLine());
        Stack<Integer> stack = new Stack<>();
        for(int i=0; i<n; i++){
            String command = br.readLine();
            switch (command.charAt(0)){
                case '1' :
                    String[] push = command.split(" ");
                    stack.add(Integer.parseInt(push[1]));
                    break;
                case '2':
                    if(stack.isEmpty()){
                        bw.write("-1\n");
                    }else{
                        bw.write(String.valueOf(stack.peek())+"\n");
                        stack.pop();
                    }
                    break;
                case '3':
                    bw.write(String.valueOf(stack.size())+"\n");
                    break;
                case '4':
                    if(stack.isEmpty()){
                        bw.write("1\n");
                    }else{
                        bw.write("0\n");
                    }
                    break;
                case '5':
                    if(stack.isEmpty()){
                        bw.write("-1\n");
                    }else{
                        bw.write(stack.peek()+"\n");
                    }
                    break;
            }
        }

        bw.flush();
        bw.close();

    }
}



