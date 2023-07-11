class Solution {
    public String solution(String X, String Y) {
        StringBuilder sb = new StringBuilder();
        
        int[] arr1 = new int[10];
        int[] arr2 = new int[10];
        
        for(int i = 0; i<X.length(); i++){
            arr1[X.charAt(i) - 48]++;
        }
        
        for(int i = 0; i<Y.length(); i++){
            arr2[Y.charAt(i) - 48]++;
        }
        
        for(int i = 9; i>=0; i--){
            for(int j = 0; j<Math.min(arr1[i],arr2[i]); j++){
                sb.append(i);
            }
        }
        
        String answer = sb.toString();
        
        if(answer.length() == 0){
            answer = "-1";
        }else if(answer.substring(0,1).equals("0")){
            answer = "0";
        }
        
        
        return answer;
    }
}