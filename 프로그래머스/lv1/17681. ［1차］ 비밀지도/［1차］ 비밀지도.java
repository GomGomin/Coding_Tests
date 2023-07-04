class Solution {
    public String[] solution(int n, int[] arr1, int[] arr2) {
        String[] answer = new String[n];
        for(int i = 0; i<n; i++){
            String str = "";
            String[] Twoarr1 = Integer.toBinaryString(arr1[i]+(int)Math.pow(2,n)).split("");
            String[] Twoarr2 = Integer.toBinaryString(arr2[i]+(int)Math.pow(2,n)).split("");
            for(int j = 1; j<=n; j++){
                if(Twoarr1[j].equals("1") || Twoarr2[j].equals("1")){
                    str +="#";
                }else{
                    str += " ";
                }
            }
            answer[i] = str;
        }
        
        return answer;
    }
}