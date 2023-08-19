import java.util.*;

class Solution {
    public int[] solution(int n, String[] words) {
        int[] answer = {0,0};
        String first = words[0];
        int count = 0;
        char ch = first.charAt(first.length()-1);
        ArrayList<String> list = new ArrayList<>();
        list.add(first);
        for(int i=1; i<words.length; i++){
            System.out.println(i);
            String word = words[i];
            if(ch != word.charAt(0) || list.contains(word)){
                count = i+1;
                if(count % n != 0){
                    answer[0] = count % n;
                    answer[1] = count / n + 1;
                }else{
                    answer[0] = count % n + n;
                    answer[1] = count / n ;
                }
                break;
            }
            list.add(word);
            ch = word.charAt(word.length()-1);
        }

        // [실행] 버튼을 누르면 출력 값을 볼 수 있습니다. 

        return answer;
    }
}