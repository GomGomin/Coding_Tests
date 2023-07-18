class Solution {
    public String solution(String[] survey, int[] choices) {
        String answer = "";

        int R =0, T=0, C=0, F=0, J=0, M=0, A=0, N=0;

        for(int i=0; i<choices.length; i++){
            int point = 4 -choices[i];
            switch(survey[i].charAt(0)){
                case 'R' : R+= point;
                    break;
                case 'T' : T+=point;
                    break;
                case 'C' : C+=point;
                    break;
                case 'F' : F+=point;
                    break;
                case 'J' : J+=point;
                    break;
                case 'M' : M+=point;
                    break;
                case 'A' : A+=point;
                    break;
                case 'N' : N+=point;
                    break;
            }
        }
        
        if(R>=T){
            answer += "R";
        }else{
            answer += "T";
        }
        if(C>=F){
            answer += "C";
        }else{
            answer += "F";
        }
        if(J>=M){
            answer += "J";
        }else{
            answer += "M";
        }
        if(A>=N){
            answer += "A";
        }else{
            answer += "N";
        }
        
        return answer;
    }
}