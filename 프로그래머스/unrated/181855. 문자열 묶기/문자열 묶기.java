class Solution {
    public int solution(String[] strArr) {
        int answer = 0;
        int[] arr = new int[30];
        for(int i = 0; i<strArr.length; i++){
            arr[strArr[i].length()-1]++;
        }
        for(int i : arr){
            if(i > answer){
                answer = i;
            }
        }
        return answer;
    }
}