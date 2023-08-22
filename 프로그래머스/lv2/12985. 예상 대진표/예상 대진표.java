class Solution
{
    public int solution(int n, int a, int b)
    {   
        int answer = 1;
        
        int A = Math.min(a,b);
        int B = Math.max(a,b);
        while(true){
            if(B-A == 1 && B % 2 == 0){
                break;
            }
            A = (A+1) / 2;
            B = (B+1) / 2;
            answer++;
        }

        return answer;
    }
}