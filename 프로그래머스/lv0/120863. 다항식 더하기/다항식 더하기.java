class Solution {
    public String solution(String polynomial) {
        String answer = "";
        int x = 0;
        int n = 0;
        String[] strarr = polynomial.split(" ");
        for(String str : strarr){
            if(str.contains("x")){
                x += str.substring(0,1).equals("x") ? 1 : Integer.parseInt(str.substring(0,str.length()-1));
            }else if(!str.equals("+")){
                n += Integer.parseInt(str);
            }
        }
        
        if(x == 1){
        if(x == 0){
            answer += n+"";
        }else if(n == 0){
            answer += "x";
        }else{
            answer += "x + " + n;
        }
        }else{
                    if(x == 0){
            answer += n+"";
        }else if(n == 0){
            answer += x+"x";
        }else{
            answer += x+"x + " + n;
        }
        }
        
        return answer;
    }
}