import java.util.*;

class Solution {
    public String[] solution(String[] players, String[] callings) {
        String[] answer = new String[players.length];
        
        HashMap<String, Integer> rankmap = new HashMap<>();
        HashMap<Integer, String> namemap = new HashMap<>();
               
        for(int i=0; i<players.length; i++){
            rankmap.put(players[i], i);
            namemap.put(i, players[i]);
        }
        
        for(int i=0; i<callings.length; i++){
            int rank = rankmap.get(callings[i]);
            String name = namemap.get(rank-1);
            rankmap.put(callings[i], rank-1);
            rankmap.put(name, rank);
            namemap.put(rank-1, callings[i]);
            namemap.put(rank, name);
        }
        
        for(int i=0; i<namemap.size(); i++){
            answer[i] = namemap.get(i);
        }

        return answer;
    }
}