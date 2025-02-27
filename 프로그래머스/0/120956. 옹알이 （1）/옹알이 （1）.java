import java.util.*;

class Solution {
    public int solution(String[] babbling) {
        /*
            in: String[], ["aya", "yee", "u", "maa", "wyeoo"]
            out: int, 1
            
            1. 발음 가능한 단어 목록 정의: ["aya", "ye", "woo", "ma"]
            2. 각 babbling 요소에 대해:
               1) prev 변수를 ""로 초기화 (이전 단어 기억)
               *2) 단어를 앞에서부터 순차적으로 검사
                   - 발음 가능한 단어 중 하나로 시작하는지 확인
                   - 같은 단어가 연속되면 false 반환
                   - 단어에서 해당 발음을 제거하고 prev 갱신
               3) 단어가 전부 제거되면 true, 남아 있으면 false
            3. 발음 가능한 단어 개수 반환
---------------------------
            1. 발음할 수 있는 단어 목록 정의: ["aya", "ye", "woo", "ma"]
            2. babbling 순회하면서 각 요소 검사
                1) 이 요소가 발음 가능한 단어인가
                2) 발음 가능하면 카운팅
            3. answer 반환
        */
        int count = 0;
        
        for (String word : babbling) {
            if (isValidSoundCombi(word)) {
                count++;
            }
        }
        return count;
        
}
            /*
            * 발음 가능한 단어인지 검사하는 함수
            1. 빈 큐 생성
            2. 단어(요소)를 문자별로 큐에 추가
            3. 단어를 char 단위로 순회 -> 큐가 빌 때까지
                1) 유효한 소리인 경우에 중복 체크를 위한 prev("") 변수 선언
                2) 큐에서 '유효 소리' 길이만큼 꺼내서 대조
                3) 꺼낸 문자열이 '유효 소리'와 일치한다면, 
                    - prev와 같다면 '유효 소리' 중복으로 false
                    - 현재 문자열을 prev에 저장
                    - 큐에서 '유효 소리' 길이 만큼 제거
                4) 문자열이 '유효 소리'와 일치하지 않는다면 false
            4. 큐가 비었다면 '유효 소리'로만 조합된 단어이므로 true
        */
        public boolean isValidSoundCombi(String word) {
        String[] properSounds = {"aya", "ye", "woo", "ma"};
        String prev = "";  // 이전 단어를 기억하여 중복 방지

        while (!word.isEmpty()) {
            boolean found = false;

            for (String sound : properSounds) {
                if (word.startsWith(sound)) { // 단어가 해당 발음으로 시작하는지 확인
                    if (sound.equals(prev)) {
                        return false; // 같은 발음이 연속으로 나오면 false
                    }
                    word = word.substring(sound.length()); // 해당 발음 제거
                    prev = sound; // 이전 발음을 갱신
                    found = true;
                    break;
                }
            }

            if (!found) { // 어떤 발음과도 일치하지 않으면 false
                return false;
            }
        }
        return true; // 모든 발음을 제거할 수 있으면 true
    }
}
    