package homework;

 class AvgWordLength {
    public double count(String phrase){
        String[] words = phrase.split(" ");
        double sumLength = 0;
        for (String word : words) {
            sumLength += word.length();
        }
        return sumLength / words.length;
    }
}

class AvgWordLengthTest {
    public static void main(String[] args) {
        //6
        System.out.println(new AvgWordLength().count("Launch Rocket"));

        //4.5
        System.out.println(new AvgWordLength().count("Life is strange thing"));
    }
}