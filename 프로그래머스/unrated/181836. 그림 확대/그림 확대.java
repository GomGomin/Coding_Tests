class Solution {
    public String[] solution(String[] picture, int k) {
        String[] answer = new String[picture.length*k];
        for(int i = 0; i<picture.length; i++){
            String[] arr = picture[i].split("");
            for(int j = 0; j<k; j++){
            String str = "";
            for(String x : arr){
                str += x.repeat(k);
            }
            answer[j+(i*k)] = str;
            }
        }
        return answer;
    }
}