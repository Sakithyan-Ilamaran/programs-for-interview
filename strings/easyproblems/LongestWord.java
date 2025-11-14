package Zohocodinground.strings.easyproblems;

public class LongestWord {
    public static void main(String[] args) {
        findLongestWord("java is a programming language");
    }

    public static void findLongestWord(String sentence) {

        String[] words = sentence.split("\\s+");
        String longestWord = "";

        for (int i = 0; i < words.length; i++) {
            if (words[i].length() > longestWord.length()) {
                longestWord = words[i];
            }
        }

        System.out.println(longestWord);
    }
}
