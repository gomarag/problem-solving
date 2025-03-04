import java.math.*;

class Solution {
    public int[] solution(int numer1, int denom1, int numer2, int denom2) {
        // 공통 분모 구하기
        int lcm = denom1 * denom2 / gcd(denom1, denom2); 
        
        // 분자 계산
        int newNumer = (numer1 * (lcm / denom1)) + (numer2 * (lcm / denom2));
        
        // 기약 분수로 만들기
        int gcd = gcd(newNumer, lcm);
        
        return new int[]{newNumer / gcd, lcm / gcd};
    }

    // 최대공약수 (유클리드 호제법)
    private int gcd(int a, int b) {
        return b == 0 ? a : gcd(b, a % b);
    }
}