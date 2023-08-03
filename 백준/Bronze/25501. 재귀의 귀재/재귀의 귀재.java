
import java.io.*;
import java.lang.reflect.Array;
import java.util.*;


public class Main {


    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int n = Integer.parseInt(br.readLine());

        for(int i=0; i<n; i++){
            String word = br.readLine();
            int[] Palindrome = isPalindrome(word);
            bw.write(String.valueOf(Palindrome[0])+" "+String.valueOf(Palindrome[1])+"\n");
        }

        bw.flush();
        bw.close();

    }

    private static int[] isPalindrome(String word) {
        return recursion(word, 0, word.length()-1);
    }

    private static int[] recursion(String word, int l, int r) {
        if(l >= r)  return new int[]{1, l+1};
        else if(word.charAt(l) != word.charAt(r)) return new int[]{0,l+1};
        else return recursion(word, l+1, r-1);
    }
}



