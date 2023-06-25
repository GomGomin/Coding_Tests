class Solution {
    public String[] solution(String my_str, int n) {
        int length = my_str.length() % n != 0 ? my_str.length() / n + 1: my_str.length() / n;
        String[] answer = new String[length];
        for(int i = 0; i<length; i++){
            if(i != length-1){
                answer[i] = my_str.substring(i*n,(i+1)*n);
            }else{
                answer[i] = my_str.substring(i*n,my_str.length());
            }
        }
        return answer;
    }
}