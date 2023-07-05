import java.util.*;

class Solution {
    public int[] solution(int[] answers) {
        int a = 1;
        int[] b = {1,3,4,5,2};
        int[] c = {3,1,2,4,5};
        int acount = 0;
        int bcount = 0;
        int ccount = 0;

        for(int i = 0; i<answers.length; i++){
            if(a  > 5 ){
                a -= 5;
            }
            acount += a == answers[i] ? 1 : 0;
            a++;
            
            bcount += (i % 2 == 0 ?  b[4] : b[i % 8 / 2]) == answers[i] ? 1 : 0;
            
            int cnum = i % 10 / 2 ;
            ccount += c[cnum] == answers[i] ? 1 : 0; 
        }
        
        int[] arr = {acount, bcount, ccount};
        ArrayList<Integer> list = new ArrayList<>();
        int max = Math.max(Math.max(acount,bcount),ccount); 
        for(int i=0; i<3; i++){
            if(max == arr[i]){
                list.add(i+1);
            }
        }
        return list.stream().mapToInt(i -> i).toArray();
    }
}