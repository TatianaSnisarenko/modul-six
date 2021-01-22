package homework;

class SensitiveDataSearcher {
    public boolean isSensitiveDataPresent(String phrase){
        String[] sensitiveData = new String[]{"pass", "key", "login", "email"};
        boolean isSensitive = false;
        for (String word : sensitiveData) {
            if(phrase.toLowerCase().contains(word)){
                isSensitive = true;
            }
        }
        return isSensitive;
    }


}

class SensitiveDataSearcherTest {
    public static void main(String[] args) {
        SensitiveDataSearcher searcher = new SensitiveDataSearcher();

        //false
        System.out.println(searcher.isSensitiveDataPresent("Hello world"));

        //true
        System.out.println(searcher.isSensitiveDataPresent("Pass: swordfish"));
    }
}
