class Solution {
    public long solution(long n) {
        long answer = 0;
        double x = Math.sqrt(n);
        return Math.floor(x) == x ? (long)Math.pow(x+1,2) : -1;
    }
}