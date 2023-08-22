
import java.io.*;
import java.util.*;


public class Main {
        static HashSet<Integer> hash = new HashSet<>();
        static int[] num;
        static int[] oper;
        static int n;
        static int max = Integer.MIN_VALUE;
        static int min = Integer.MAX_VALUE;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        n = Integer.parseInt(br.readLine());
        StringTokenizer st = new StringTokenizer(br.readLine());
        num = new int[n];
        for(int i=0; i<n; i++){
            num[i] = Integer.parseInt(st.nextToken());
        }

        st = new StringTokenizer(br.readLine());
        oper = new int[4];
        for(int i=0; i<4; i++){
            oper[i] = Integer.parseInt(st.nextToken());
        }

        dfs(num[0],1);

        StringBuilder sb = new StringBuilder();
        sb.append(max+"\n"+min);
        bw.write(sb.toString());
        bw.flush();
        bw.close();
    }

    private static void dfs(int number, int depth) {

        if(depth == n){
            max = Math.max(max, number);
            min = Math.min(min, number);
            return;
        }

        for(int i=0; i<4; i++){
            if(oper[i] > 0){
                oper[i]--;
                switch (i){
                    case 0 : dfs(number+num[depth], depth+1);
                        break;
                    case 1 : dfs(number-num[depth], depth+1);
                        break;
                    case 2 : dfs(number*num[depth], depth+1);
                        break;
                    case 3 : dfs(number/num[depth], depth+1);
                        break;
                }
                oper[i]++;
            }
        }
    }
}


