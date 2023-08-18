
import java.io.*;


public class Main {
    static boolean[][] chess;
    static int count ;
    static int n;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        n = Integer.parseInt(br.readLine());
        chess = new boolean[n][n];
        count = 0;
        dfs(0);
        bw.write(String.valueOf(count));
        bw.flush();
        bw.close();
    }

    private static void dfs(int depth) {
        if(depth == n){
            count++;
            return;
        }

        for(int i=0; i<n; i++){
            if(!chess[depth][i]) {
                if(queen(depth,i)){
                    chess[depth][i] = true;
                    dfs(depth+1);
                    chess[depth][i] = false;
                }
            }
        }
    }

    private static boolean queen(int column, int row) {
        for(int i=column; i>=0; i--){
            if(chess[i][row]){
                return false;
            };
        }

        int c1 = column;
        int r1 = row;
        while(c1 >= 0 && r1 >= 0){
            if(chess[c1--][r1--]){
                return false;
            }
        }

        int c2 = column;
        int r2 = row;
        while(c2 >= 0 && r2 < n){
            if(chess[c2--][r2++]){
                return false;
            }
        }
        return true;
    }
}



