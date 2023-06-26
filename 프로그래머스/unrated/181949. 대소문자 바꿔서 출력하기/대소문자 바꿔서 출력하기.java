import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String a = sc.next();
        char[] ch = a.toCharArray();
        String answer = "";
        for(char x : ch){
            if(x >= 97){
                answer += String.valueOf(Character.toUpperCase(x));
            }else{
                answer += String.valueOf(Character.toLowerCase(x));
            }
        }
        System.out.print(answer);
    }
}