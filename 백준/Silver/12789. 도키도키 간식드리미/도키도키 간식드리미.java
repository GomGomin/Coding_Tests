
import java.io.*;
import java.lang.reflect.Array;
import java.util.*;


public class Main {


    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int n = Integer.parseInt(br.readLine());
        Queue<Integer> waiting = new LinkedList<>();
        Stack<Integer> waiting2 = new Stack<>();
        StringTokenizer st = new StringTokenizer(br.readLine());
        for(int i=0; i<n; i++){
            waiting.add(Integer.parseInt(st.nextToken()));
        }

        boolean gansick = true;

        int count = 1;

        while (!waiting.isEmpty()) {
            if (waiting.peek() == count) {
                count++;
                waiting.poll();
            } else if (!waiting2.isEmpty() && waiting2.peek() == count) {
                count++;
                waiting2.pop();
            } else {
                waiting2.push(waiting.poll());
            }
        }

        while(!waiting2.isEmpty()){
            if(waiting2.peek() == count){
                waiting2.pop();
                count++;
            }else{
                gansick = false;
                break;
            }
        }

        if(gansick){
            bw.write("Nice");
        }else{
            bw.write("Sad");
        }
        bw.flush();
        bw.close();

    }
}



