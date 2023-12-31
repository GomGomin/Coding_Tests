class Solution {
    public int[] solution(int brown, int yellow) {
        int[] answer = new int[2];
        int carpet = brown + yellow;
        for(int i=3; i<=carpet; i++){
            if(carpet % i == 0){
                int a = carpet / i;
                int b = i;
                if((a-2) * (b-2) == yellow){
                    answer[0] = a;
                    answer[1] = b;
                    break;
                }
            }
        }
        return answer;
    }
}