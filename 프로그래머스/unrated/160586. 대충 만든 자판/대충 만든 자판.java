class Solution {
    public int[] solution(String[] keymap, String[] targets) {
        int[] answer = new int[targets.length];
        for(int i = 0; i<targets.length; i++){
            answer[i] = keycount(targets[i], keymap);
        }
        return answer;
    }
    
    public int keycount(String targets, String[] keymap){
        
        int count = 0;
        
        for(int i=0; i<targets.length(); i++){
            int min = Integer.MAX_VALUE;
            for(int j=0; j<keymap.length; j++){
                String key = String.valueOf(targets.charAt(i));
                if(keymap[j].contains(key)){
                    min = Math.min(min, keymap[j].indexOf(key)+1);
                }
            }
            if(min == Integer.MAX_VALUE){
                return -1;
            }else{
                count += min;
            }
        }
        return count;
    }
}