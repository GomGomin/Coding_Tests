import java.util.*;

class Solution
{
    public int solution(String s)
    {
        char[] ch = s.toCharArray();
        Stack<Character> stack = new Stack<>();
        for(char c : ch){
            if(!stack.isEmpty() && stack.peek() == c){
                stack.pop();
            }else{
                stack.push(c);
            }
        }
        if(stack.isEmpty()){
            return 1;
        }else{
            return 0;
        }
    }
}