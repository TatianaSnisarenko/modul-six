package homework;

import java.util.Arrays;

class WordSplitter {
    public String[] split(String phrase){
        String newPhrase = phrase.toLowerCase();
        return newPhrase.split("\\s+");
    }
}

class WordSplitterTest {
    public static void main(String[] args) {
        WordSplitter wordSplitter = new WordSplitter();

        String[] words = wordSplitter.split("Hello      world");

        //[hello, world]
        System.out.println(Arrays.toString(words));
    }
}
