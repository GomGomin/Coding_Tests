
import java.io.*;
import java.lang.reflect.Array;
import java.util.*;


public class Main {


    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int n = Integer.parseInt(br.readLine());

        int answer = fi(n);
        bw.write(String.valueOf(answer));
        bw.flush();
        bw.close();

    }

    private static int fi(int n) {

        if(n <= 1){
            return n;
        }
        return fi(n-1) + fi(n-2);
    }
}



