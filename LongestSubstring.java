package softsuave;

import java.util.HashSet;
import java.util.Set;

public class LongestSubstring {
    public static void main(String[] args) {
        int len = longestSubStringWithoutRepeatingCharacter("abcabghjkl");
        System.out.println(len);
    }

    public static int longestSubStringWithoutRepeatingCharacter(String s) {
        int start = 0;
        int end = 0;
        int maxLen = Math.min(s.length(), 1);

        Set<Character> seen = new HashSet<>();

        while (end < s.length()) {
            char c = s.charAt(end);

            while (seen.contains(c)) {
                seen.remove(s.charAt(start));
                start += 1;
            }

            seen.add(c);
            int windowLen = end - start + 1;
            maxLen = Math.max(windowLen, maxLen);
            end += 1;
        }

        return maxLen;
    }

    public static int longestSubStringWithoutRepeatingCharacter1(String s) {
        int start = 0;
        int end = 0;
        int maxLen = Math.min(s.length(), 1);
        Set<Character> seen = new HashSet<>();
        while (end < s.length()) {
            char c = s.charAt(end);

            while (seen.contains(c)) {
                seen.remove(c);
                start = start + 1;
            }

            seen.add(c);
            int windowLen = end - start + 1;
            maxLen = Math.max(windowLen, maxLen);
            end = end + 1;
        }

        return maxLen;
    }
}
