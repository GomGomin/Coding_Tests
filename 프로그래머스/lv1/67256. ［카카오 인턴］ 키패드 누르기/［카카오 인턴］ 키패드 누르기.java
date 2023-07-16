class Solution {
    public static int[] left = {0,3};
    public static int[] right = {2,3};
    
    public String solution(int[] numbers, String hand) {
        StringBuilder answer = new StringBuilder();
        for(int i=0; i<numbers.length; i++){
            int[] num = {(numbers[i]-1)%3,(numbers[i]-1) / 3};
            if(numbers[i] == 0){
                num[0] = 1;
                num[1] = 3;
            }
            answer.append(button(num, left, right, hand));
        }
        return answer.toString();
    }
    
    public static String button(int[] num, int[] left, int[] right, String hand){
        String result = "";
        if(num[0] == 0){
            result = "L";
            left[0] = num[0];
            left[1] = num[1];
        }else if(num[0] == 2){
            result = "R";
            right[0] = num[0];
            right[1] = num[1];
        }else if(num[0] == 1){
            int l = 0;
            int r = 0;
            for(int i=0; i<num.length; i++){
                l += Math.abs(num[i] - left[i]);
                r += Math.abs(num[i] - right[i]);
            }
            if(l < r){
                result = "L";
                left[0] = num[0];
                left[1] = num[1];
            }else if(l > r){
                result = "R";
                right[0] = num[0];
                right[1] = num[1];
            }else if(r == l){
                if(hand.equals("left")){
                    result = "L";
                    left[0] = num[0];
                    left[1] = num[1];
                }else{
                    result = "R";
                    right[0] = num[0];
                    right[1] = num[1];
                }
            }
        }
        return result;
    }
}