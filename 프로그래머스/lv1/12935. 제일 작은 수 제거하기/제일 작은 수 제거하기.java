import java.util.*;

class Solution {
    public int[] solution(int[] arr) {
        
        int min = arr[0];
        for(int i = 1; i<arr.length; i++){
            if(min > arr[i]){
                min = arr[i];
            }
        }
        
        ArrayList<Integer> list = new ArrayList<>();
        
        for(int i : arr){
            if(i != min){
                list.add(i);
            }
        }
        
        if(list.size() == 0){
            list.add(-1);
        }
        return list.stream().mapToInt(i -> i).toArray();
    }
}