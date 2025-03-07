class Solution {
    public int solution(int n) {
        int answer = 0;
        // totalPiece = 7
        // 7명 => 1
        // 8명 => 1 | 1 = 2
        // 9명 => 1 | 2 = 2
        //10명 => 1 | 3 = 2
        // ...
        //15명 => 2 | 1 = 3
        answer = n / 7; // 자동으로 내림 처리 하지 않음??
        int remainder = n % 7;

        if (remainder > 0 && remainder < 7) {
            answer++;
        }
        return answer;
    }
}