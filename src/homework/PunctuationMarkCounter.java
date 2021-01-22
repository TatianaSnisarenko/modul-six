package homework;

class PunctuationMarkCounter {
    public int count(String phrase){
        char[] chars = phrase.toCharArray();
        int count = 0;
        for (char c :
                chars) {
            if(c == '.' || c == ',' || c == '!'||c == ':' || c == ';'){
             count++;
            }
        }
        return count;
    }
}

class PunctuationMarkCounterTest {
    public static void main(String[] args) {
        PunctuationMarkCounter counter = new PunctuationMarkCounter();

        //2
        System.out.println(counter.count("Hello, world!"));

        //1
        System.out.println(counter.count("This is Sparta!"));

        //1
        System.out.println(counter.count("End."));
    }
}