class Solution {
    public int solution(int[] sides) {
        int answer = 0;
        // sorting, Max 안 쓰고 선분 3개 중 가장 긴 변 구해야 할지?
        // 가장 긴 변은 3개 중에 몇 번째?
            // 일단, 첫 번째를 가장 길다고 가정
            // 다음 요소와 비교해서 다음이 크다면 교체
            // 같거나 작다면 건너뛰기
        // 나머지의 합 vs 가장 긴 변
            // 나머지 합 = 전체 합 - 가장 긴 변
        int maxSide = sides[getMaxSideIdx(sides)];
        int sumOfRemains = getSum(sides) - maxSide;
        
        if (maxSide < sumOfRemains) {
            answer = 1;
        } else {
            answer = 2;
        }
        return answer;
    }
    
    private int getMaxSideIdx(int[] arr) {
        int maxIdx = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > arr[maxIdx]) {
                maxIdx = i;
            }
        }
        // 만약 3개가 모두 같다면?
        // 그럼 0번째 요소가 가장 긴 변이 되어도 상관 없음 -> maxIdx = 0
        return maxIdx;
    }
    
    private int getSum(int[] arr) {
        int sum = 0;
        for (int el : arr) {
            sum += el;
        }
        return sum;
    }
}