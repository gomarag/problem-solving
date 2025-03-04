class Solution {
    public int[] solution(int[] num_list) {
        int left = 0;
        int right = num_list.length - 1;
        
        // left가 rigth 보다 커지면, 종료
        while (left < right) {
            int temp = num_list[left];
            
            num_list[left] = num_list[right];
            num_list[right] = temp;
            
            left++;
            right--;
        }
        return num_list;
    }
}