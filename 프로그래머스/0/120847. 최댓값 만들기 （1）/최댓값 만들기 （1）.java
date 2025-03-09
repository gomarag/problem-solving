class Solution {
    public int solution(int[] numbers) {
        int max1 = Integer.MIN_VALUE; // 최댓값
        int max2 = Integer.MIN_VALUE; // 두 번째 최댓값
        
        for (int num : numbers) {
            if (num > max1) {
                max2 = max1; // 현재 최대값을 두 번째로 이동
                max1 = num;  // 새로운 최대값 설정
            } else if (num > max2) {
                max2 = num; // 두 번째 최대값 업데이트
            }
        }
        
        return max1 * max2; // 가장 큰 두 수의 곱 반환
    }
}
