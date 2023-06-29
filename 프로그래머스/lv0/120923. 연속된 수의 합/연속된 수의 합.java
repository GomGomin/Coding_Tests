class Solution {
    public int[] solution(int num, int total) {
        int[] answer = new int[num];
        if(num % 2 == 0){
            int n = total / (num / 2);
            int x = n / 2;
                for(int j = 0; j<answer.length; j++){
                    answer[j] = x - (num / 2) + 1 + j;
                }
        }else{
            int n = total / num;
            for(int i = 0; i<answer.length; i++){
                answer[i] = n + i - (num/2);
            }
        }
        return answer;
    }
}