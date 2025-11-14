package Zohocodinground.strings.easyproblems;

public class DecodeCompressedString {
    public static void main(String[] args) {

        System.out.println(findCompressedString("x3y5z4"));
        System.out.println(findDecompressedString("xxxyyzzzz"));
    }

    public static String findCompressedString(String compressedString) {
        StringBuilder result = new StringBuilder();

        for (int i = 0; i < compressedString.length(); i+=2) {
            int repeatCount = Character.getNumericValue(compressedString.charAt(i+1));
            for (int j = 0; j < repeatCount; j++) {
                result.append(compressedString.charAt(i));
            }
        }

        return result.toString();
    }

    public static String findDecompressedString(String decompressedString) {
        StringBuilder result = new StringBuilder();
        int count = 1;

        for (int i = 1; i < decompressedString.length(); i++) {
            if (decompressedString.charAt(i) == decompressedString.charAt(i-1)) {
                count++;
            } else {
                result.append(decompressedString.charAt(i-1)).append(count);
                count=1;
            }
        }

        result.append(decompressedString.charAt(decompressedString.length()-1)).append(count);

        return result.toString();
    }
}

