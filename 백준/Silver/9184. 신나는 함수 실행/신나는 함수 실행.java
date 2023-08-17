import java.io.*;
import java.util.StringTokenizer;


public class Main {
    static int[][][] memory = new int[21][21][21];
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringBuilder sb = new StringBuilder();
        while(true){
            StringTokenizer st = new StringTokenizer(br.readLine());
            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());
            int c = Integer.parseInt(st.nextToken());
            if(a == -1 && b == -1 && c == -1){
                break;
            }
            int answer = w(a, b, c);
            sb.append("w("+a+", "+b+", "+c+") = "+answer+"\n");
        }
        System.out.println(sb);
    }

    private static int w(int a, int b, int c) {
        if (a <= 0 || b <= 0 || c <= 0){
            return 1;
        }

        if (a > 20 || b > 20 || c > 20) {
            return w(20, 20, 20);
        }

        if(memory[a][b][c] != 0){
            return memory[a][b][c];
        }

        if (a < b && b < c){
            memory[a][b][c] = w(a, b, c-1) + w(a, b-1, c-1) - w(a, b-1, c);
            return memory[a][b][c];
        }

        memory[a][b][c] = w(a-1, b, c) + w(a-1, b-1, c) + w(a-1, b, c-1) - w(a-1, b-1, c-1);
        return memory[a][b][c];
    }
}



