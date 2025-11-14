package Zohocodinground.arrays.mediumproblems;

import java.util.*;

public class FindDuplicates {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,2,3};
        findDuplicates(arr);
        System.out.println();
        findDuplicatesUsingSet(arr);
        System.out.println();
        findDuplicatesInString("lalaland");
        System.out.println();
        findDuplicatesUsingSetInString("lalaland");
    }

    public static void findDuplicates(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = i+1; j < arr.length; j++) {
                if (arr[i] == arr[j]) {
                    System.out.print(arr[i] + " ");
                }
            }
        }
    }

    public static void findDuplicatesInString(String word) {
        char[] ch = word.toLowerCase().toCharArray();
        Arrays.sort(ch);

        for (int i = 0; i < ch.length; i++) {
            for (int j = i + 1; j < ch.length; j++) {
                if (ch[i] == ch[j]) {
                    System.out.print( ch[i] + " ");
                }
            }
        }

    }

    public static void findDuplicatesUsingSet(int[] arr) {
        Set<Integer> seen = new HashSet<>();
        Set<Integer> duplicate = new HashSet<>();

        for (int num : arr) {
            if (!seen.add(num)) {
                duplicate.add(num);
            }
        }

        System.out.print(duplicate + " ");
    }

    public static void findDuplicatesUsingSetInString(String words) {
        Set<Character> seen = new HashSet<>();
        Set<Character> duplicates = new HashSet<>();

        char[] ch = words.toLowerCase().toCharArray();

        for (char word : ch) {
            if (!seen.add(word)) {
                duplicates.add(word);
            }
        }

        System.out.println(duplicates + " ");
    }

}
