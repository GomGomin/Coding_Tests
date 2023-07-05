import java.util.*;

class Solution {
    public String solution(String[] cards1, String[] cards2, String[] goal) {
        ArrayList<String> list = new ArrayList<>(Arrays.asList(goal));
        String answer = "";
        int idx = 0;
        int count = 0;
        for(String str : cards1){
            if(!list.contains(str)){
                break;
            }
            if(idx <= list.indexOf(str)){
                idx = list.indexOf(str);
                count++;
            }
        }
        idx = 0;
        for(String str : cards2){
            if(!list.contains(str)){
                break;
            }
            if(idx <= list.indexOf(str)){
                idx = list.indexOf(str);
                count++;
            }
        }
        return list.size() == count ? "Yes" : "No";
    }
}