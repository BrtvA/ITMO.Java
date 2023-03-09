package Laboratory.Lab05;

import java.util.Locale;

public class Task02 {
    public static void main(String[] args) {
        String word = "Довод";

        System.out.println("Слово \'" + word + "\' "
                            + (isPalindrome2(word) ? "является" : "не является")
                            + " палиндромом");
    }

    public static boolean isPalindrome2(String word) {
        word = word.toLowerCase();
        String left = "";
        String right = "";
        int wordLength = word.length();

        if (wordLength % 2 == 0) {
            left = word.substring(0, wordLength / 2);
            right = word.substring(wordLength / 2);
        } else {
            left = word.substring(0, wordLength / 2);
            right = word.substring(wordLength / 2 + 1);
        }

        StringBuilder rightBuilder = new StringBuilder(right);

        return left.equals(rightBuilder.reverse().toString());
    }
}
