
import java.io.*;


public class Main {
    public static int count;
    static int[] f;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int n = Integer.parseInt(br.readLine());

        StringBuilder sb = new StringBuilder();

        int a = fib(n);

        sb.append(count+" ");
        count = 0;
        f = new int[n];
        int b = fibonacci(n);
        sb.append(count);
        bw.write(sb.toString());
        bw.flush();
        bw.close();
    }

    private static int fibonacci(int n) {
        f[0] = 1;
        f[1] = 1;
        for (int i=2; i<n; i++){
            f[i] = f[i-1] + f[i-2];
            count++;
        }
        return f[n-1];
    }

    private static int fib(int n) {
        if (n == 1 || n == 2) {
            count++;
            return 1;
        }
        return (fib(n - 1) + fib(n - 2));
    }


}



