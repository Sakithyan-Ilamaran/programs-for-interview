package Zohocodinground.strings.easyproblems;

public class RemoveVowels {
    public static void main(String[] args) {
        removeVowelIfSingle("sakithyan");
        removeVowelIfSingle("beautiful");
        removeAnyVowel("beautiful");
    }

    public static boolean isVowel(Character ch) {
        ch = Character.toLowerCase(ch);
        return (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u');
    }

    public static void removeVowelIfSingle(String s) {
        StringBuilder sb= new StringBuilder();

        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);

            if (!isVowel(ch)) {
                sb.append(ch);
            } else {
                boolean preVowel = (i > 0 && isVowel(s.charAt(i - 1)));
                boolean nextVowel = (i < s.length() - 1 && isVowel(s.charAt(i + 1)));

                if (preVowel || nextVowel) {
                    sb.append(ch);
                }
             }
        }
        System.out.println(sb);
    }

    public static void removeAnyVowel(String s) {
        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);

            if (!isVowel(ch)) {
                sb.append(ch);
            }
        }

        System.out.println(sb);
    }

    public static void removeAnyVowelInArray(String[] s) {
        String[] s2 = new String[10];

    }
}


