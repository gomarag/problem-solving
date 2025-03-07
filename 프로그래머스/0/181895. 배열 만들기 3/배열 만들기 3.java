class Solution {
    public int[] solution(int[] arr, int[][] intervals) {
        int[] answer = {};
        
        //i:  [1, 2, 3, 4, 5]
        //     0  1  2  3  4
        // intervals[0] -> 부분배열 1 -> ->
        // intervals[1] -> 부분배열 2
        int a1 = intervals[0][0];
        int b1 = intervals[0][1];
        
        int a2 = intervals[1][0];
        int b2 = intervals[1][1];
        
        int len1 = b1 - a1 + 1;
        int len2 = b2 - a2 + 1;
        answer = new int[len1 + len2]; // 정적 자료 구조
        // arr
        int idx = 0;
        for (int i = a1; i <= b1; i++) {
            // 2 3 4
            answer[idx] = arr[i];
            idx++;
        }
        
        for (int i = a2; i <= b2; i++) {
            // idx 3 
            answer[idx] = arr[i];
            idx++;
        }
        return answer;
    }
}