class Solution {
    public int solution(int slice, int n) {
        int answer = 0;
        // 사람 수 n, 피자 조각 slice(2 ~ 10)
        // 10 / 7 = 1, 10 % 7 = 3
        // 12 / 4 = 3, 12 % 4 = 0
        answer = n / slice;
        if (n % slice > 0) {
            answer++;
        }
        return answer;
    }
}