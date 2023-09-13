class Solution {
    public int solution(int[] arr) {
        int answer = 1;
        while(true){
            int count = 0;
            for(int i=0; i<arr.length; i++){
                if(answer % arr[i] == 0){
                    count++;
                }
            }
            if(count == arr.length){
                break;
            }
            answer++;
        }
        return answer;
    }
}