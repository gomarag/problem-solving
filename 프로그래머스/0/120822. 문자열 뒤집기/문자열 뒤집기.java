import java.util.Stack;

class Solution {
    public String solution(String my_string) {
        // 거꾸로 뒤집은 문자열 -> Stack
        // Stack에 문자열의 '글자' 하나씩 넣었다가
        // 반환 문자열에 스택에서 꺼낸 글자 하나씩 추가
        // 반환

        // Q. 스택의 크기 지정 안하면 어떻게 되나?
        Stack<Character> stack = new Stack<>();

        for (int i = 0; i < my_string.length(); i++) {
            stack.push(my_string.charAt(i));
        }

        StringBuilder answer = new StringBuilder();
        while (!stack.isEmpty()) {
            answer.append(stack.pop()); // O(1)
        }

        return answer.toString();
    }
}