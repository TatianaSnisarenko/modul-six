package homework;

class WordFreqCounter {
    public float countFreq(String phrase, String word){
        String[] words = phrase.split(" ");
        float count = 0f;
        for (String w :
                words) {
            if (word.equalsIgnoreCase(w)) {
                count++;
            }
        }
        return count / words.length;
    }
}

class WordFreqCounterTest {
    public static void main(String[] args) {
        WordFreqCounter freqCounter = new WordFreqCounter();

        //0.5
        System.out.println(freqCounter.countFreq("Hello Java", "java"));

        //0
        System.out.println(freqCounter.countFreq("Hello World", "java"));
    }
}
