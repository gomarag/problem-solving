import java.util.*;

public class Solution {
    public int[] solution(int []arr) {
        int[] answer = {};
        /*
            arr = [1, 1, 3, 3, 0, 1, 1]
            arr를 순회
            첫 요소를 스택에 넣고
            만약, 스택의 최상위 요소가 확인하는 요소와 같다면, 다음으로 넘어가고
            스택의 최상위 요소와 다르다면, 스택에 추가
        */
        Stack <Integer> stk = new Stack<>();
        for (int num : arr) {
            if (stk.isEmpty() || stk.peek() != num) {
                stk.push(num);
            }
        }
        
        answer = new int[stk.size()];
        for (int i = stk.size() - 1; i >= 0; i--) {
            answer[i] = stk.pop();
        }
        return answer;
    }
}