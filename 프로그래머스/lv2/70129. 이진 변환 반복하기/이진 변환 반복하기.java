class Solution {
    public int[] solution(String s) {
        
        int count = 0;
        int sl = 0;
        
        while(s.length() != 1){
            count++;
            sl += s.length();
            s = s.replaceAll("0", "");
            sl -= s.length();
            s = Integer.toBinaryString(s.length());
        }
        int[] answer = {count, sl};

        return answer;
    }
}