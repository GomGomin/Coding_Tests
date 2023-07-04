class Solution {
    public int[] solution(String s) {
        int[] answer = new int[s.length()];
        String[] strarr =  s.split("");
        String str = "";
        for(int i = 0; i<strarr.length; i++){
            if(str.contains(strarr[i])){
                answer[i] = i - str.lastIndexOf(strarr[i]);
                str += strarr[i];
            }else{
                answer[i] = -1;
                str += strarr[i];
            }
        }
        return answer;
    }
}