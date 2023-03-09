package Laboratory.Lab05;

public class Task03 {
    public static void main(String[] args) {
        String text = "Слово бяка - это что-то плохое";

        System.out.println(text);
        System.out.println(replaceWord(text));
    }

    private static String replaceWord(String text) {
        return text.replaceAll("бяка", "[вырезано цензурой]");
    }
}
