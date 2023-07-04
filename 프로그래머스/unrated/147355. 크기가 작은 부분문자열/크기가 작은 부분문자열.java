class Solution {
    public int solution(String t, String p) {
        int answer = 0;
        long x = Long.parseLong(p);
        long pl = p.length();
        
        for(long i = 0; i<=t.length()-pl; i++){
            if(Long.parseLong(t.substring((int)i,(int)(i+pl))) <= x){
                answer++;
            }
        }
        return answer;
    }
}