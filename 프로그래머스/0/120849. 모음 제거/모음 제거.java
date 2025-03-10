class Solution {
    public String solution(String my_string) {
        String answer = "";
        char[] chArray = my_string.toCharArray();
        // 문자 배열 순회하면서 '모음'인 경우는 건너뛰고 answer에 붙여넣기(공백인 경우도 포함)
        StringBuilder sb = new StringBuilder();
        for (char ch : chArray) {
            if (isVowel(ch)) {
                continue;
            } else {
                sb.append(ch);
            }
        }
        answer = sb.toString();
        return answer;
    }

    public static boolean isVowel(char ch) {
        if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
            return true;
        } else {
            return false;
        }
    }
}