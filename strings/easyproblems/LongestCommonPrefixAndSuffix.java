package Zohocodinground.strings.easyproblems;

import java.util.Arrays;

public class LongestCommonPrefixAndSuffix {
    public static void main(String[] args) {

        String[] strs1 = {"club", "clap", "clove"};
        String[] strs2 = {"booked" , "licked", "looked", "bed", "booked"};
        Arrays.sort(strs2);
//        for (int i = 0; i < strs2.length; i++) {
//            System.out.println(strs2[i]);
//        }

        System.out.println(findLongestCommonPrefix2(strs1));
        System.out.println(findLongestCommonSuffix(strs2));
    }

    public static String findLongestCommonPrefix(String[] strs) {
        if (strs == null || strs.length == 0) return "";

        Arrays.sort(strs);
        StringBuilder result = new StringBuilder();
        char[] firstWord = strs[0].toCharArray();
        char[] lastWord = strs[strs.length-1].toCharArray();

        for (int i = 0; i < firstWord.length; i++) {
            if (firstWord[i] != lastWord[i]) {
                break;
            }
                result.append(firstWord[i]);
        }

        return result.toString();
    }

    public static String findLongestCommonPrefix2(String[] str) {
        if (str == null || str.length == 0) return "";

        Arrays.sort(str);

        StringBuilder res = new StringBuilder();
        char[] first = str[0].toCharArray();
        char[] last = str[str.length - 1].toCharArray();

        for (int i = 0; i < first.length; i++) {
            if (first[i] != last[i]) {
                break;
            }
            else
                res.append(first[i]);
        }

        return res.toString();
    }


    public static String findLongestCommonSuffix(String[] strs) {
        if (strs == null || strs.length == 0) return "";

        Arrays.sort(strs);

        StringBuilder result = new StringBuilder();
        char[] firstWord = strs[0].toCharArray();
        char[] lastWord = strs[strs.length - 1].toCharArray();
        int minLength = Math.min(firstWord.length, lastWord.length);

        for (int i = firstWord.length - 1; i >= minLength ; i--) {
            if (firstWord[i] != lastWord[i]) {
                break;
            }
            result.append(firstWord[i]);
        }

        return result.reverse().toString();
    }
}
