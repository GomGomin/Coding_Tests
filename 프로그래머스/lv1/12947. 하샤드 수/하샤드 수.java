class Solution {
    public boolean solution(int x) {
        boolean answer = true;
        String[] strarr = String.valueOf(x).split("");
        int n = 0;
        for(String str : strarr){
            n+=Integer.parseInt(str);
        }
        return x % n == 0 ? true : false;
    }
}