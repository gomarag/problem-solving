class Solution {
    public int solution(int[] dot) {
        int answer = 0;
        // 1) 두 수의 곱, 2) x 또는 y가 양수인지
        // 양: 1, 3
        // 음: 2, 4
        int x = dot[0];
        int y = dot[1];
        if (x > 0) {
            if (x * y > 0) {
                answer = 1;
            } else {
                answer = 4;
            }
        } else {
            // x < 0
            if (x * y > 0) {
                answer = 3;
            } else {
                answer = 2;
            }
        }
        return answer;
    }
}