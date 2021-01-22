package homework;

class UniqueCharCounter {
    public int count(String phrase){
        String signs = "";
        int count = 0;
        for (int i = 0; i < phrase.length(); i++) {
            String sign = phrase.substring(i, i + 1);
            if(!signs.contains(sign)) {
                count++;
                signs +=sign;
            }
        }
        return count;
    }
}

class UniqueCharCounterTest {
    public static void main(String[] args) {
        UniqueCharCounter charCounter = new UniqueCharCounter();

        //3
        System.out.println(charCounter.count("123"));

        //4
        System.out.println(charCounter.count("ab100"));

        //3
        System.out.println(charCounter.count("Java"));
    }
}
