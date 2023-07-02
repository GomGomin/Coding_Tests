class Solution {
    public String solution(String[] seoul) {
        int n = 0;
        for(String str : seoul){
            if(str.equals("Kim")){
                break;
            }
            n++;
        }
        String answer = "김서방은 " + n + "에 있다";
        return answer;
    }
}