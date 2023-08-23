
import java.io.*;
import java.util.*;


public class Main {
        static int[][] team;
        static int n;
        static boolean[] visit;
        static int min = Integer.MAX_VALUE;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        n = Integer.parseInt(br.readLine());

        team = new int[n][n];

        for(int i=0; i<n; i++){
            StringTokenizer st = new StringTokenizer(br.readLine());
            for(int j=0; j<n; j++){
                team[i][j] = Integer.parseInt(st.nextToken());
            }
        }

        visit = new boolean[n];

        dfs(0, 0);


        bw.write(String.valueOf(min));
        bw.flush();
        bw.close();
    }

    private static void dfs(int index, int depth) {

        if(depth == n/2){
            ability();
            return;
        }

        for(int i=index; i<n; i++){
            if(!visit[i]){
                visit[i] = true;
                dfs(i+1, depth+1);
                visit[i] = false;
            }
        }
    }

    private static void ability() {
        int start = 0;
        int link = 0;

        for(int i=0; i<n; i++){
            for(int j=i+1; j<n; j++){
                if(visit[i] && visit[j]){
                    start += team[i][j] + team[j][i];
                }else if(!visit[i] && !visit[j]){
                    link += team[i][j] + team[j][i];
                }
            }
        }

        min = min < Math.abs(start - link) ? min : Math.abs(start - link);
    }
}


