package ua.com.alevel;

public final class ReverseStringUtil {

    private ReverseStringUtil() {
    }

    private static String reverse(String line) {
        char chars[] = line.toCharArray();
        String reverse = "";
        for (int i = chars.length - 1; i >= 0; i--) {
            reverse += chars[i];
        }
        return reverse;
    }

    public static String reverseAll(String line) {
        return reverse(line.trim());
    }

    public static String reverseByIndexes(String line, int firstIndex, int secondIndex) {
        if (firstIndex > secondIndex) {
            int buff = firstIndex;
            firstIndex = secondIndex;
            secondIndex = buff;
        }
        String reversePart = reverse(line.substring(firstIndex, secondIndex));
        return line.substring(0, firstIndex) + reversePart + line.substring(secondIndex);
    }

    public static String reverseByString(String line, String reversePart) {
        try {
            return reverseByIndexes(line, line.indexOf(reversePart), line.indexOf(reversePart) + reversePart.length());
        } catch (Exception e) {
            System.out.println("there is no such string in entered one");
            return null;
        }
    }

    private static String wordReverse(String line) {
        String words[] = line.split("\\s");
        String reverseWord = "";
        for (String word : words) {
            String string = word;
            string = reverse(string);
            reverseWord += string.toString() + " ";
        }
        return reverseWord.trim();
    }

    public static String reverseAllWords(String line) {
        return wordReverse(line);
    }

    public static String reverseWordsByIndexes(String line, int firstIndex, int secondIndex) {
        if (firstIndex > secondIndex) {
            int buff = firstIndex;
            firstIndex = secondIndex;
            secondIndex = buff;
        }
        String reversePart = reverseAllWords(line.substring(firstIndex, secondIndex));
        return line.substring(0, firstIndex) + reversePart + line.substring(secondIndex);
    }
}
