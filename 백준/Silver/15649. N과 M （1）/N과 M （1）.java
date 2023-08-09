
import java.io.*;
import java.util.*;


public class Main {
    static boolean[] node;
    static int[] arr;
    static StringBuilder sb = new StringBuilder();
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        StringTokenizer st = new StringTokenizer(br.readLine());

        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());

        node = new boolean[n];
        arr = new int[m];

        dfs(n,m,0);
        bw.write(sb.toString());
        bw.flush();
        bw.close();
    }

    private static void dfs(int n, int m, int depth) {
        if(depth == m){
            for(int i=0; i<m; i++){
                sb.append(arr[i]+" ");
            }
            sb.append("\n");
            return;
        }

        for(int i=0; i<n; i++){
            if(!node[i]){
                node[i] = true;
                arr[depth] = i+1;
                dfs(n,m,depth+1);
                node[i] = false;
            }
        }
    }
}



