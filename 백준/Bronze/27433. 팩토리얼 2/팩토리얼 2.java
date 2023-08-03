
import java.io.*;
import java.lang.reflect.Array;
import java.util.*;


public class Main {


    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        long n = Long.parseLong(br.readLine());

        long answer = fa(n);
        bw.write(String.valueOf(answer));
        bw.flush();
        bw.close();

    }

    private static long fa(long n) {
        if(n <= 1){
            return 1;
        }
        return n * fa(n-1);
    }
}



