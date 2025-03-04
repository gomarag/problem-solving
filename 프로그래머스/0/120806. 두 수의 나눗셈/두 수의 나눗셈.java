class Solution {
    public int solution(int num1, int num2) {
        // 자바에서 정수 나눗셈 -> 자동으로 Math.floor() 실행
        double divided = ((double)num1) / num2;
        double result = divided * 1_000;
        return (int) result;
    }
}