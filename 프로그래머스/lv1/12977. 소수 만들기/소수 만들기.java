class Solution {
    public int solution(int[] nums) {
        int answer = 0;
        int count = 0;

        for(int i = 0; i<nums.length-2; i++){
            for(int j = i+1; j<nums.length-1; j++){
                for(int k = j+1; k<nums.length; k++){
                    int x = nums[i]+nums[j]+nums[k];
                    count = 0;
                    for(int y = 2; y<=x/2; y++){
                        if(x % y == 0){
                            count++;
                            break;
                        }
                    }
                    if(count == 0){
                        answer++;
                    }
                }
            }
        }
        // [실행] 버튼을 누르면 출력 값을 볼 수 있습니다.
        System.out.println("Hello Java");

        return answer;
    }
}