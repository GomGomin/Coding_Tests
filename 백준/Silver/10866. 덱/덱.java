
import java.io.*;
import java.util.*;


public class Main {


    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        Deque<Integer> deque = new ArrayDeque<>();

        int n = Integer.parseInt(br.readLine());
        for(int i=0; i<n; i++){

            String command = br.readLine();

            if(command.contains("push")){
                String[] commandStrings = command.split(" ");
                if(command.contains("front")){
                    deque.addFirst(Integer.parseInt(commandStrings[1]));
                }else if(command.contains("back")){
                    deque.addLast(Integer.parseInt(commandStrings[1]));
                }
            }else if(command.contains("pop")){
                String[] commandStrings = command.split(" ");
                if(deque.isEmpty()){
                    bw.write("-1\n");
                }else{
                    if(command.contains("front")){
                        int a = deque.pollFirst();
                        bw.write(String.valueOf(a)+"\n");
                    }else{
                        int a = deque.pollLast();
                        bw.write(String.valueOf(a)+"\n");
                    }
                }
            }else if(command.equals("size")){
                bw.write(String.valueOf(deque.size())+"\n");
            }else if(command.equals("empty")){
                if(deque.isEmpty()){
                    bw.write("1\n");
                }else{
                    bw.write("0\n");
                }
            }else if(command.equals("front") || command.equals("back")){
                if(deque.isEmpty()){
                    bw.write("-1\n");
                }else{
                    if(command.equals("front")){
                        bw.write(String.valueOf(deque.peekFirst())+"\n");
                    }else{
                        bw.write(String.valueOf(deque.peekLast())+"\n");
                    }
                }
            }
        }

        bw.flush();
        bw.close();
    }
}



