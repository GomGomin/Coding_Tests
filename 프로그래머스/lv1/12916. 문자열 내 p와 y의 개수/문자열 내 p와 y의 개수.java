class Solution {
    boolean solution(String s) {
        boolean answer = true;
        String[] strarr = s.toUpperCase().split("");
        int p = 0;
        int y = 0;
        for(String str : strarr){
            if(str.equals("P")){
                p++;
            }else if(str.equals("Y")){
                y++;
            }
        }
        // [실행] 버튼을 누르면 출력 값을 볼 수 있습니다.
        System.out.println(s);

        return p+y == 0 ? true : p==y ? true : false;
    }
}