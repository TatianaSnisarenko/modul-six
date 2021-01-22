package homework;

import java.util.Arrays;

class WordDeleter {
    public String remove(String phrase, String[] words) {
        String[] parts = phrase.split(" ");

        for (int i = 0; i < parts.length; i++) {
            for (String word : words) {

                if (parts[i] != null && parts[i].equals(word)) {
                    parts[i] = null;
                }
            }
        }

        String resultString = "";
        for (String part : parts) {
            if (part != null) {
                resultString = resultString + " " + part;
            }
        }
        return resultString.strip();
    }
}

class WordDeleterTest {
    public static void main(String[] args) {
        WordDeleter wordDeleter = new WordDeleter();

        //Hello
        System.out.println(wordDeleter.remove("Hello Java", new String[]{"Java"}));
        //This Sparta
        System.out.println(wordDeleter.remove("This is Sparta", new String[]{"is"}));
        //zawofu mynopybi yhypno potou hidi mynopybi zime", [zawofu, yhypno, potou, hidi, zime]
        System.out.println(wordDeleter.remove("zawofu mynopybi yhypno potou hidi mynopybi zime", new String[]{"zawofu", "yhypno", "potou", "hidi", "zime"}));
    }
}