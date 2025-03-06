class Solution {
    public int solution(int[] array, int height) {
        int answer = 0;
        // 149, | 167 | 180, 192, 170
        // 정렬이 안 된 배열
        // 배열 전체 순회하면서, 기준인 키 보다 크다면 카운팅 하고
        // 같거나 작다면, 건너뛰기
        for (int el : array) {
            if (el > height) {
                answer++;
            }
        }
        return answer;
    }
}