import java.util.*;

class Solution {
    public String[] solution(String myString) {
        ArrayList<String> list = new ArrayList<>();
        String[] str = myString.split("x");
        Arrays.sort(str);
        for(int i = 0; i<str.length; i++){
            if(!str[i].equals("")){
                list.add(str[i]);
            }
        }
        String[] answer = list.toArray(new String[list.size()]);
        return answer;
    }
}