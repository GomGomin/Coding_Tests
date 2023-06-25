import java.util.*;

class Solution {
    public int[] solution(int n, int[] slicer, int[] num_list) {
        ArrayList<Integer> list = new ArrayList<>();
        int[] answer = new int[0];
            switch (n){
                case 1 :
                answer = Arrays.copyOfRange(num_list,0,slicer[1]+1);
                break;
            case 2:
                answer = Arrays.copyOfRange(num_list,slicer[0],num_list.length);
                break;
            case 3 :
                answer = Arrays.copyOfRange(num_list,slicer[0],slicer[1]+1);
                break;
            case 4:
                for(int i = slicer[0]; i<=slicer[1]; i+=slicer[2]){
                    list.add(num_list[i]);
                }
                    answer = list.stream().mapToInt(i -> i).toArray();
                break;
            }
        return answer;
    }
}