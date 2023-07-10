
class Solution {
    public int[] solution(int[] lottos, int[] win_nums) {
        int[] answer = new int[2];
                
        int count = 0;
        int x = 0;
        for(int i = 0; i<lottos.length; i++){
            if(lottos[i] == 0){
                x++;
            }else{
                for(int j = 0; j<win_nums.length; j++){
                    if(lottos[i] == win_nums[j]){
                        count++;
                    }
                }
            }
        }
        
        answer[0] = Math.max(count+x, count);
        answer[1] = Math.min(count+x, count);
        
        for(int i = 0; i<answer.length; i++){
            if(answer[i] < 2){
                answer[i] = 6;
            }else{
                answer[i] = 7 - answer[i];
            }
        }
        
        return answer;
    }
}