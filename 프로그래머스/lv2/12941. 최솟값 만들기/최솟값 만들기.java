import java.util.*;

class Solution
{
    public int solution(int []A, int []B)
    {
        int answer = 0;
        
        Arrays.sort(A);
        Arrays.sort(B);
        
        int asize = A.length;
        int bsize = B.length;
        
        if(asize > bsize){
            for(int i=0; i<B.length; i++){
                answer += A[i] * B[bsize-1-i];
            }
        }else{
            for(int i=0; i<A.length; i++){
                answer += A[i] * B[bsize-1-i];
            }
        }

        return answer;
    }
}