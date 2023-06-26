class Solution {
    public String solution(String my_string, int[][] queries) {
        String answer = my_string;
        for(int i = 0; i < queries.length; i++){
            String str1 = answer.substring(0,queries[i][0]);
            String str2 = answer.substring(queries[i][0],queries[i][1]+1);
            String str3 = answer.substring(queries[i][1]+1);
            String blank = "";
            for(int j = str2.length()-1; j>=0; j--){
                blank += str2.charAt(j);
            }
            answer = str1 + blank + str3;
        }
        return answer;
    }
}