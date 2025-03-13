class Solution {
    public static int solution(int price) {
        // 10+: 5% -> 95%
        // 30+: 10% -> 90%
        // 50+: 20% -> 80%
        if (price >= 500_000) {
            return (int)(price * 0.8);
        } else if (price >= 300_000) {
            return (int)(price * 0.9);
        } else if (price >= 100_000) {
            return (int)(price * 0.95);
        }
        return price; // 할인 없음
    }
}