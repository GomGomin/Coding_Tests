class Solution {
    public String solution(int a, int b) {
        int[] day = {31, 29, 31, 30, 31, 30, 31, 31, 30, 31, 30};
        String[] D = {"SUN", "MON", "TUE", "WED", "THU", "FRI", "SAT"};
        int count = 0;
        for(int i = 1; i<a; i++){
            count+=day[i-1];
        }
        int yoil = (count + b) % 7;
        String answer = D[ yoil+4 > 6 ? yoil+4 - 7: yoil+4];
        return answer;
    }
}