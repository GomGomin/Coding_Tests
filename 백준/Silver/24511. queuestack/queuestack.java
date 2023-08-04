
import java.io.*;
import java.lang.reflect.Array;
import java.util.*;


public class Main {


    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int n = Integer.parseInt(br.readLine());

        StringTokenizer st1 = new StringTokenizer(br.readLine());
        StringTokenizer st2 = new StringTokenizer(br.readLine());

        Deque<Integer> queuestack = new ArrayDeque<>();

        for(int i=0; i<n; i++){
            int A = Integer.parseInt(st1.nextToken());
            int B = Integer.parseInt(st2.nextToken());
            if(A == 0){
                queuestack.add(B);
            }
        }

        int m = Integer.parseInt(br.readLine());
        StringTokenizer st3 = new StringTokenizer(br.readLine());
        StringBuilder sb = new StringBuilder();
        for(int i=0; i<m; i++){
            int C = Integer.parseInt(st3.nextToken());
            queuestack.addFirst(C);
            sb.append(queuestack.pollLast()+" ");
        }
        bw.write(sb.toString());
        bw.flush();
        bw.close();
    }
}



