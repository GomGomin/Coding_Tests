
import java.io.*;
import java.lang.reflect.Array;
import java.util.*;


public class Main {


    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int T = Integer.parseInt(br.readLine());

        for(int i=0; i<T; i++){
            String[] p = br.readLine().split("");
            int Dcount = 0;
            for(String s : p){
                if(s.equals("D")){
                    Dcount++;
                }
            }
            int n = Integer.parseInt(br.readLine());
            int[] ax = new int[n];
            StringTokenizer st = new StringTokenizer(br.readLine(),"[],");
            for(int j=0; j<n; j++){
                ax[j] = Integer.parseInt(st.nextToken());
            }

            ArrayDeque<Integer>deque = new ArrayDeque<Integer>();
            for(int s : ax){
                deque.add(s);
            }

            String answer = AC(p,deque);
            bw.write(answer+"\n");
        }
        bw.flush();
        bw.close();

    }

    private static String AC(String[] p, ArrayDeque<Integer> deque) {
        boolean direction = true;

        for(String s : p){
            if(s.equals("R")){
                direction = !direction;
            }else{
                if(deque.isEmpty()){
                    return "error";
                }
                if(direction){
                    deque.poll();
                }else{
                    deque.pollLast();
                }
            }
        }

        StringBuilder sb = new StringBuilder();

        sb.append("[");
        if(!deque.isEmpty()) {
            if (direction) {
                sb.append(deque.poll());
                while (!deque.isEmpty()) {
                    sb.append(",").append(deque.poll());
                }
            } else {
                sb.append(deque.pollLast());
                while (!deque.isEmpty()) {
                    sb.append(",").append(deque.pollLast());
                }
            }
        }
        sb.append("]");

        return sb.toString();
    }
}



