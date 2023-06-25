class Solution {
    public String solution(String my_string, int s, int e) {
        String answer = "";
        String[] arr = my_string.split("");
        String temp = "";
        for(int i = 0; i< (e-s)/2 +1; i++){
            temp = arr[i+s];
            arr[i+s] = arr[e-i];
            arr[e-i] = temp;
        }
        for(String str : arr){
            answer+= str;
        }
        return answer;
    }
}