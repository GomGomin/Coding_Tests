class Solution {
    public int solution(int n, int m, int[] section) {
        int answer = 0;
        boolean[] faint = new boolean[n];
        for(int i = 0; i<section.length; i++){
            faint[section[i]-1] = true;
        }
        
        for(int i = 0; i<section.length; i++){
            if(faint[section[i]-1] == true){
                for(int j = 0; j<m; j++){
                    if(section[i]-1+j > n-1){
                        break;
                    }
                    faint[section[i]-1+j] = false;
                }
                answer++;
            }
        }        
        return answer;
    }
}