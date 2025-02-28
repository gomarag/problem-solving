class Solution {
    public double solution(int[] numbers) {
        double average = 0;
        double sum = 0;
        
        for (double num : numbers) {
            sum = sum + num;
        }
        average = sum / (numbers.length);
        return average;
    }
}