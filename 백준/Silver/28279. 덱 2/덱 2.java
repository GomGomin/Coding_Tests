
import java.io.*;
import java.lang.reflect.Array;
import java.util.*;


public class Main {


    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int n = Integer.parseInt(br.readLine());

        Deque<Integer> deque = new LinkedList<>();

        for(int i=0; i<n; i++){
            String command = br.readLine();
            String[] ca = command.split(" ");

            switch (command.charAt(0)){
                case '1' :
                    deque.addFirst(Integer.parseInt(ca[1]));
                    break;
                case '2' :
                    deque.addLast(Integer.parseInt(ca[1]));
                    break;
                case '3':
                    if(deque.isEmpty()){
                        bw.write("-1\n");
                    }else{
                        bw.write(String.valueOf(deque.pollFirst())+"\n");
                    }
                    break;
                case '4':
                    if(deque.isEmpty()){
                        bw.write("-1\n");
                    }else{
                        bw.write(String.valueOf(deque.pollLast())+"\n");
                    }
                    break;
                case '5' :
                    bw.write(String.valueOf(deque.size())+"\n");
                    break;
                case '6' :
                    if (deque.isEmpty()){
                        bw.write("1\n");
                    }else{
                        bw.write("0\n");
                    }
                    break;
                case '7':
                    if(deque.isEmpty()){
                        bw.write("-1\n");
                    }else{
                        bw.write(String.valueOf(deque.peekFirst())+"\n");
                    }
                    break;
                case '8':
                    if(deque.isEmpty()){
                        bw.write("-1\n");
                    }else{
                        bw.write(String.valueOf(deque.peekLast())+"\n");
                    }
                    break;
            }
        }

        bw.flush();
        bw.close();

    }
}



