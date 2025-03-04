import java.util.*;

class Solution {
    public int solution(int[][] dots) {
    /*
        평행하다 == 두 선이 같은 거리만큼 떨어져 있다 == 기울기가 같다
        
        기울기 같다면
        (y4 - y3) * (x2 - x1) == (y2 -y1) * (x4 - x3)
        
        4개의 점으로 만들 수 있는 2개 직선의 조합: 4C2 = 6
        
        가능한 조합별로 '평행 여부' 확인
    */
        List<int[][]> combinations = generateCombinations(dots);
        int answer = 0;
        
        for (int[][] combi : combinations) {
            if (isParallel(combi[0], combi[1], combi[2], combi[3])) {
                answer++;
                return answer;
            }
        }
        return answer;
    }
    
    private boolean isParallel(int[] dot1, int[] dot2, int[] dot3, int[] dot4) {
        int dx1 = dot2[0] - dot1[0];
        int dy1 = dot2[1] - dot1[1];
        int dx2 = dot4[0] - dot3[0];
        int dy2 = dot4[1] - dot3[1];

        // 기울기 dy/dx 가 같은지 검사
        return (dy1 * dx2 == dy2 * dx1);
    }
    
    private List<int[][]> generateCombinations(int[][] points) {
        List<int[][]> result = new ArrayList<>();
        
        // (ab, cd), (ac, bd), (ad, bc)
        result.add(new int[][] {points[0], points[1], points[2], points[3]});
        result.add(new int[][] {points[0], points[2], points[1], points[3]});
        result.add(new int[][] {points[0], points[3], points[1], points[2]});
        
        return result;
    }
}