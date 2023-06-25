import java.util.*;

class Solution {
    public String[] solution(String myStr) {
        ArrayList<String> list = new ArrayList<>();
        String[] answer = myStr.split("[a-c]");
        for(String str : answer){
            if(!str.equals("")){
                list.add(str);
            }
        }
        if(list.isEmpty()){
            list.add("EMPTY");
        }
        return list.stream().map(i -> i).toArray(String[] :: new);
    }
}