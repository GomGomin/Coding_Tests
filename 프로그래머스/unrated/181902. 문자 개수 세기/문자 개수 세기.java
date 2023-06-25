class Solution {
    public int[] solution(String my_string) {
        int[] answer = new int[52];
        char[] arr = my_string.toCharArray();
        for(char ch : arr){
            if((int)ch > 90){
                answer[(int)ch-97+26]++;
            }else{
                answer[(int)ch-65]++;
            }
        }
        return answer;
    }
}