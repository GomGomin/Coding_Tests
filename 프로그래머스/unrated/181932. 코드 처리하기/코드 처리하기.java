class Solution {
    public String solution(String code) {
        String answer = "";
        String[] str = code.split("");
        int mode = 0;
        for(int i = 0; i<str.length; i++){
            if(mode == 0){
                if(str[i].equals("1")){
                    mode = 1;
                }else if(i % 2 == 0){
                    answer += str[i];
                }
            }else if(mode == 1){
                if(str[i].equals("1")){
                    mode = 0;
                }else if(i % 2 == 1){
                    answer += str[i];
                }
            }
        }
        
        return answer.length() == 0 ? "EMPTY" : answer;
    }
}