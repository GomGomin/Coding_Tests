
import java.io.*;
import java.util.*;


public class Main {
    public static int[] arr;
    public static int n, m;
    public static StringBuilder sb = new StringBuilder();

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        StringTokenizer st = new StringTokenizer(br.readLine());

        n = Integer.parseInt(st.nextToken());
        m = Integer.parseInt(st.nextToken());

        arr = new int[m];

        dfs(1,0);

        System.out.print(sb);
    }

    private static void dfs(int num, int depth) {
        if(depth == m){
            for(int i : arr){
                sb.append(i+" ");
            }
            sb.append("\n");
            return;
        }
        for(int i=num; i<=n; i++){
            arr[depth] = i;
            dfs(i,depth+1);
        }
    }
}



