package Zohocodinground.strings.easyproblems;

import java.util.LinkedHashMap;
import java.util.Map;

public class ReverseString {
    public static void main(String[] args) {

        String word = "lala.land";
        System.out.println(findReverseString(word));
        System.out.println(findReverseWords(word));
        System.out.println(findReverseWordByDot(word));
    }

    public  static String findReverseString(String s) {
        Map<Character, Integer> map = new LinkedHashMap<>();

        for (int i = s.length() - 1; i >= 0; i--) {
            char ch = s.charAt(i);
            if (ch != ' ') {
                map.putIfAbsent(ch, i);
            }
        }

        StringBuilder stringBuilder = new StringBuilder();

        for (char ch: map.keySet()) {
            stringBuilder.append(ch);
        }

        return stringBuilder.toString();
    }

    public static String findReverseWords(String s) {
        String[] str = s.split(" ");

        String revStr = "";

        for (int i = str.length-1; i >= 0; i--) {
            revStr = revStr + str[i] + " ";
        }

        return revStr;
    }

    public static String findReverseWordByDot(String s) {
        String[] str = s.split("\\.");
        String revStr = "";

        for (int i = str.length-1; i >=0 ; i--) {
            revStr +=  str[i];
            if (i != 0) {
                revStr += ".";
            }
        }

        return revStr;
    }
}
