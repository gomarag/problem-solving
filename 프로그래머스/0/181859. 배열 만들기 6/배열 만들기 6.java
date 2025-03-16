import java.util.*;

class Solution {
    public int[] solution(int[] arr) {
        int[] answer = {};
        // int[] arr = { 0, 1, 0, ...} => stk
        Stack<Integer> stk = new Stack<>();
        for (int i = 0; i < arr.length; i++) {
            if (stk.empty()) {
                stk.push(arr[i]);
            } else {
                if (stk.peek() == arr[i]) {
                    stk.pop();
                } else {
                    stk.push(arr[i]);
                }
            }
        }
        // stk를 반복문 사용해서 정수형 배열로 변환
        System.out.println(stk);

        if (stk.empty()) {
            return new int[]{-1};
        }

        answer = new int[stk.size()];
        for (int i = stk.size() -1; i >= 0; i--) {
            answer[i] = stk.pop();
        }
        return answer;
    }
}