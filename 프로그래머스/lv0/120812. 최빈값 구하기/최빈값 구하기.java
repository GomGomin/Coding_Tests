import java.util.*;

class Solution {
    public int solution(int[] array) {
        Arrays.sort(array);
        ArrayList<Integer> list = new ArrayList<>();
        list.add(array[0]);
        int max = 1;
        int count = 1;
        for(int i =1; i<array.length; i++){
            if(array[i] == array[i-1]){
                count++;
                if(count > max){
                max = count;
                list.clear();
                list.add(array[i]);
                }else if(count == max){
                    list.add(array[i]);
                }
            }else{
                count = 1;
                if(count == max){
                list.add(array[i]);
                }
            }
        }
        return list.size() != 1 ? -1 : list.get(0).intValue();
    }
}