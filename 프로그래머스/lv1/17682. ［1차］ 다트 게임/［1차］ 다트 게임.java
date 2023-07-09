class Solution {
    public int solution(String dartResult) {
        int answer = 0;
        int[] point = new int[3];
        String num ="";
        int idx = 0;
        for(int i = 0; i<dartResult.length(); i++){
            if(dartResult.charAt(i) >= '0' && dartResult.charAt(i) <= '9'){
                num += String.valueOf(dartResult.charAt(i));
            }else if(dartResult.charAt(i) == 'S'){
                point[idx++] = Integer.parseInt(num);
                num="";
            }else if(dartResult.charAt(i) == 'D'){
                point[idx++] = (int)Math.pow(Integer.parseInt(num),2);
                num="";
            }else if(dartResult.charAt(i) == 'T'){
                point[idx++] = (int)Math.pow(Integer.parseInt(num),3);
                num="";
            }else if(dartResult.charAt(i) == '*'){
                if(idx == 1){
                    point[idx-1] *= 2;
                }else{
                    point[idx-2] *= 2;
                    point[idx-1] *= 2;
                }
            }else if(dartResult.charAt(i) == '#'){
                point[idx-1] *= -1;
            }
        }
        
        for(int i : point){
            answer += i;
        }
        return answer;
    }
}