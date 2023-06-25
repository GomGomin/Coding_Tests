class Solution {
    public int[] solution(int[] arr) {
        int start = 0;
        int end  = 0;
        for(int i = 0; i<arr.length; i++){
            if(arr[i] == 2){
                start = i;
                for(int j= arr.length-1; j>=i; j--){
                    if(arr[j] == 2){
                        end = j;
                        break;
                    }
                }
                break;
            }
        }
        int[] answer = new int[end - start + 1];
        for(int i = 0; i<answer.length; i++){
            if(end == 0){
                answer[i] = -1;
                break;
            }
            answer[i] = arr[i+start];
        }
        return answer;
    }
}