class Solution {
    public String[] solution(String[] quiz) {
        String[] answer = new String[quiz.length];
        for(int i = 0; i<quiz.length; i++){
            String[] str = quiz[i].split(" ");
            int n = Integer.parseInt(str[0]);;
            for(int j = 1; j<str.length-2; j+=2){
                if(str[j].equals("+")){
                    n += Integer.parseInt(str[j+1]);
                }else if (str[j].equals("-")){
                    n -= Integer.parseInt(str[j+1]);
                }else{
                    break;
                }
            }
            if(n == Integer.parseInt(str[str.length-1])){
                answer[i] = "O";
            }else{
                answer[i] = "X";
            }
        }
        return answer;
    }
}