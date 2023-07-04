class Solution {
    public int solution(String s) {
        int answer = 0;
        String[] num = {"zero", "one", "two", "three", "four", "five", "six", "seven", "eight", "nine"};
        int[] number = {0,1,2,3,4,5,6,7,8,9};
        for(int i = 0; i<10; i++){
            if(s.contains(num[i])){
                s = s.replaceAll(num[i],String.valueOf(number[i]));
            }
        }
        return Integer.parseInt(s);
    }
}