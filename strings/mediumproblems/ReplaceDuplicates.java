package Zohocodinground.strings.mediumproblems;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class ReplaceDuplicates {
    public static void main(String[] args) {
        char[] arr = {'a','d','r','a','d'};
        char[] op = replaceDuplicated(arr);
        System.out.println(Arrays.toString(op));
    }

    public static char[] replaceDuplicated(char[] arr) {
        Set<Character> used = new HashSet<>();

        int next = 0;

        for (int i = 0; i < arr.length; i++) {
            if (!used.add(arr[i])) {
                while (used.contains((char) ('a' + next))) next++;
                arr[i] = (char) ('a' + next);
                used.add(arr[i]);
            }
        }
        return arr;
    }
}
