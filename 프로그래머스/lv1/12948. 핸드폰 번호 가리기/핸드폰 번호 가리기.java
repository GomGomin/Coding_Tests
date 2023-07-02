class Solution {
    public String solution(String phone_number) {
        String[] strarr = phone_number.substring(0,phone_number.length()-4).split("");
        
        String answer = "";
        for(String str : strarr){
            answer += str.replaceAll("^[0-9]+$","*");
        }
        
        return answer+phone_number.substring(phone_number.length()-4);
    }
}