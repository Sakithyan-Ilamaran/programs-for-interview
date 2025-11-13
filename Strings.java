package genericprograms;

public class Strings {
    public static void main(String[] args) {
        System.out.println(validDomain("@gmail.com"));
        System.out.println(getInitial("sakithyan ilamaran"));
        reverseSentence("my name is sakithyan");
        System.out.println();
        System.out.println(countWordStartingWIthLetter(
                "Spring Boot simplifies server setup", 's'));
        System.out.println(maskCardNumber("1234-2345-3456-4567"));
        System.out.println(getFileExt("sakithyan.pdf"));
        System.out.println(splitAddressFromCSV("sakithyan,developer,chennai"));

        String name  = "sakithyan";
        StringBuilder sb = new StringBuilder(name);
        sb.reverse().toString();
        System.out.println(reverseStringUsingRecursion("0110001"));
    }

    public static String validDomain(String email) {
        String[] parts = email.split("@");
        return parts.length == 2 ? parts[1] + " is a valid domain" : "invalid email domain";
    }

    public static String getInitial(String fullName) {
        String[] words = fullName.split(" ");
        StringBuilder initals = new StringBuilder();
        for (String word : words) {
            if (!word.isBlank()) {
                initals.append(Character.toUpperCase(word.charAt(1)));
            }
        }

        return initals.toString();
    }

    public static void reverseSentence(String sentence) {
        String[] words = sentence.split(" ");

        for (int i = words.length - 1; i >= 0; i--) {
            System.out.print(words[i] + " ");
        }
    }

    public static String getFileExt(String fileName) {
        int dotIndex = fileName.lastIndexOf(".");

        return dotIndex != -1 ? fileName.substring(dotIndex) : " no extension found";
    }

    public static int countWordStartingWIthLetter(String sentence, char letter) {
        int count = 0;
        String[] words = sentence.split(" ");

        for (String word : words) {
            if (!word.isEmpty() &&
                    Character.toLowerCase(word.charAt(0)) == Character.toLowerCase(letter))
            {
                count++;
            }
        }

        return count;
    }

    public static String maskCardNumber(String cardNumbers) {
        String[] numSplit = cardNumbers.split("-");

        for (int i = 0; i < numSplit.length - 1 ; i++) {
            numSplit[i] = "****";
        }

        return String.join("-" ,numSplit);
    }

    public static String splitAddressFromCSV(String csvName) {
        String[] columns = csvName.split(",");

        return columns.length>= 3? columns[2] : "column missing";
    }

    public static String reverseStringUsingRecursion(String word) {
        if (word == null || word.length() <= 1) return word;
       return reverseStringUsingRecursion(word.substring(1)) + word.charAt(0);
    }
}

