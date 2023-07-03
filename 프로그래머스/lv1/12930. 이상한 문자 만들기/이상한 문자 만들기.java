class Solution {
    public String solution(String s) {
        String answer = "";
        char[] chararr = s.toCharArray();
        boolean per = true;
        for(int i = 0; i<chararr.length; i++){
           if(chararr[i] != ' '){
               if(per){
                   answer += String.valueOf(chararr[i]).toUpperCase();
                   per = !per;
               }else{
                  answer += String.valueOf(chararr[i]).toLowerCase();
                   per = !per;
               }
           }else{
               answer +=String.valueOf(chararr[i]);
               per = true;
           }
        }
        return answer;
    }
}