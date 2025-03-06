class Solution {
    public int[] solution(int money) {
        int[] answer = new int[2];
        int ICE_COFFEE = 5_500;

        // [몫, 나머지]
        answer[0] = money / ICE_COFFEE;
        answer[1] = money % ICE_COFFEE;
        return answer;
    }
}