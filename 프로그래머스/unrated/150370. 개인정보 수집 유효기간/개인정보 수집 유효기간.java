import java.util.*;

class Solution {
    public int[] solution(String today, String[] terms, String[] privacies) {
        
        ArrayList<Integer> list = new ArrayList<>();
        
        HashMap<String, Integer> map = new HashMap<>();
        
        for(String term : terms){
            String[] termarr = term.split(" ");
            map.put(termarr[0],Integer.parseInt(termarr[1]));
        }
                
        String[] todayarr = today.split("[.]");
        
        int[] todaynum = new int[todayarr.length]; 
        
        for(int i=0; i<todaynum.length; i++){
            todaynum[i] = Integer.parseInt(todayarr[i]);
        }
        
        int[] expire = new int[3];
        
        for(int i=0; i<privacies.length; i++){
            expire = expireDate(privacies[i],map);
            for(int j=0; j<expire.length; j++){
                if(expire[j] < todaynum[j]){
                    list.add(i+1);
                    break;
                }else if (expire[j] > todaynum[j]){
                    break;
                }
            }
        }
        
        return list.stream().mapToInt(i -> i).toArray();
    }
    
    public int[] expireDate(String privacie, HashMap<String, Integer> map){ 
        String[] privaciedate = privacie.split("[.]|\\s");
        int term = map.get(privaciedate[3]);
        int eY = Integer.parseInt(privaciedate[0]);
        int eM = Integer.parseInt(privaciedate[1]) + term;
        int eD = Integer.parseInt(privaciedate[2]) - 1;

        if(eM > 12){
            int plusY = eM / 12;
            eM %= 12;
            eY += plusY;
            if(eM == 0){
                eM +=12;
                eY--;
            }
        }else if(eM < 1){
            eM += 12;
            eY--;
        }
        
        int[] expire = {eY, eM, eD};
        return expire;
    }
}