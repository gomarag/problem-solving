import java.util.Stack;

class Solution {
    public int[] solution(int[] num_list) {
        int[] answer = {};
        
        Stack<Integer> stk = new Stack<>();
        // 1,2,3,4,5
        for (int num : num_list) {
            // 5,4,3,2,1
            stk.push(num);
        }
        
        answer = new int[stk.size()];
        // Q. 스택 크기 != answer 길이???
        for (int i = 0; i < answer.length; i++) {
            answer[i] = stk.pop();
        }
        return answer;
    }
}