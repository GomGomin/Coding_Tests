class Solution {
    public String solution(String new_id) {
        String answer = "";
        answer = new_id.toLowerCase();
        answer = answer.replaceAll("!|~|@|#|[$]|%|\\^|&|[*]|\\(|\\)|=|[+]|\\[|\\]|\\{|\\}|:|\\?|,|<|>|/","");
        while(answer.contains("..")){
            answer = answer.replaceAll("[.][.]",".");
        }
            
        if(answer.charAt(0) == '.'){
            answer = answer.substring(1);
        }
        
        if(answer.isEmpty()){
            answer += "a";
        }else if(answer.length() >= 16){
            answer = answer.substring(0,15);
        }

        if(answer.charAt(answer.length()-1) == '.'){
                answer = answer.substring(0,answer.length()-1);
        }
        
        while(answer.length() < 3){
            answer += answer.substring(answer.length()-1);
        }
        return answer;
    }
}