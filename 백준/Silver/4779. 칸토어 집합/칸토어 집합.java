
import java.io.*;
import java.lang.reflect.Array;
import java.util.*;


public class Main {
    static StringBuilder sb;
    static int n;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String s;
        while((s = br.readLine()) != null){
            n = Integer.parseInt(s);
            int length = (int)Math.pow(3,n);

            sb = new StringBuilder();
            for(int i=0; i<length; i++){
                sb.append("-");
            }
            can(0, length);
            System.out.println(sb);
        }
    }

    private static void can(int start, int length) {
        if(length == 1){
            return;
        }

        int newSize = length/3;

        for(int i=start+newSize; i<start + newSize*2; i++){
            sb.setCharAt(i,' ');
        }
        can(start,newSize);
        can(start + newSize*2, newSize);
    }
}



