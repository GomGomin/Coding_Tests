class Solution {
    public int[][] solution(int n) {
        int[][] answer = new int[n][n];
        boolean plus = true;
        int max = n-1;
        int min = 0;
        int x = 1;
        for(int i = 0; i<n; i++){
            if(plus){
                for(int j = min; j<=max; j++){
                    answer[min][j]=x;
                    x++;
                }
                for(int j = min+1; j<=max; j++){
                    answer[j][max]=x;
                    x++;
                }
            }else{
                for(int j = max-1; j>=min; j--){
                    answer[max][j]=x;
                    x++;
                }
                max--;
                for(int j = max; j>=min+1; j--){
                    answer[j][min]=x;
                    x++;
                }
                min++;
            }
            plus = !plus;
        }
        return answer;
    }
}