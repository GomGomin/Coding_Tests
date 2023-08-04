
import java.io.*;
import java.lang.reflect.Array;
import java.util.*;


public class Main {


    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int n = Integer.parseInt(br.readLine());

        Deque<int[]> deque = new ArrayDeque<>();
        StringTokenizer st = new StringTokenizer(br.readLine());
        for(int i=1; i<=n; i++){
            int[] balloon = {i,Integer.parseInt(st.nextToken())};
            deque.add(balloon);
        }

        StringBuilder sb = new StringBuilder();

        int[] boom = deque.poll();
        sb.append(boom[0]);

        int move = boom[1];

        while(!deque.isEmpty()){
            if(move>0){
                for(int i=1; i<move; i++){
                    deque.add(deque.poll());
                }
            }else{
                for(int i=1; i<=-move; i++){
                    deque.addFirst(deque.pollLast());
                }
            }
            boom = deque.poll();
            sb.append(" "+boom[0]);
            move = boom[1];
        }

        bw.write(sb.toString());
        bw.flush();
        bw.close();
    }
}



