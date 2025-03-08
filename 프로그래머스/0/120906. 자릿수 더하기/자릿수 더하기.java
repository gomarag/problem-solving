class Solution {
    public int solution(int n) {
        int answer = 0;
        // 10으로 나눈 나머지
        // 1234 % 10 = 123 * 10 + 4
        // 123 = 12 * 10 + 3
        // 12 = 10 * 1 + 2
        // 10 = 10 * 1 + 0 -> 나머지가 0이면 '몫'을 더함'
        // 나머지가 0이 될 때까지 10으로 나눔
        // 나머지는 반환값에 더하고
        // 몫은 계속 갱신이 필요함
        int divider = n;
        while (divider != 0) {
            answer += divider % 10;
            divider = divider / 10;
        }
        return answer;
    }
}