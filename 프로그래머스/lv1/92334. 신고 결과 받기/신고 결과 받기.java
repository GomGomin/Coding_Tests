import java.util.*;

class Solution {
    public int[] solution(String[] id_list, String[] report, int k) {
        
        int[] answer = new int[id_list.length];
        
        HashMap<String,HashSet<String>> reportlist = new HashMap<>();
        HashMap<String,HashSet<String>> reportcount = new HashMap<>();
        
        for(String s : id_list){
            reportlist.put(s, new HashSet<>());
            reportcount.put(s, new HashSet<>());
        }
        
        for(String s :report){
            String[] id = s.split(" ");
            reportlist.get(id[0]).add(id[1]);
            reportcount.get(id[1]).add(id[0]);
        }
        
        for(int i=0; i<id_list.length; i++){
            String s = id_list[i];
            HashSet<String> id = reportlist.get(s);
            Iterator<String> iter = id.iterator();
            while(iter.hasNext()){
                HashSet<String> count = reportcount.get(iter.next());
                if(count.size() >= k){
                    answer[i]++;
                }
            }
        }
        return answer;
    }
}