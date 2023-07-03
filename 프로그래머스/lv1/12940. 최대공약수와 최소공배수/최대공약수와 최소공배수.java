class Solution {
    public int[] solution(int n, int m) {
        int max = Math.max(n,m);
        int min = Math.min(n,m);
        int a = yak(min,max);
        int b = n*m/ a;
        int[] answer = {a,b};

        return answer;
    }
    
    public int yak(int min, int max){
        int n = min;
        while(true){
            if(max % n == 0 && min % n == 0){
                break;
            }
            n--;
        }
        return n;
    }
}
