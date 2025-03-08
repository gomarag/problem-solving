class Solution {
    public int[] solution(int n, int[] numlist) {
        int[] answer = {};
        // 정적 자료구조 -> 배열 길이 구하기
        // 배열 길이 == 배수의 개수
        int count = 0;
        for (int i = 0; i < numlist.length; i++) {
            if (numlist[i] % n == 0) {
                count++;
            }
        }
        
        answer = new int[count];
        int idx = 0;
        for (int i = 0; i < numlist.length; i++) {
            if (numlist[i] % n == 0) {
                answer[idx] = numlist[i];
                idx++;
            }
        }
        
        return answer;
    }
}