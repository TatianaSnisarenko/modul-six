package homework;

class PhraseMaker {
    public String join(String[] words) {
        StringBuilder sb = new StringBuilder();

        for(int i = 0; i < words.length; i++) {
            String word = words[i];
            if (word.length() <= 3) {
                word = word.toUpperCase();
            } else {
                word = word.toLowerCase();
            }
            sb.append(word);

            if (i != words.length - 1) {
                sb.append(" ");
            }
        }
        return sb.toString();
    }
}

class PhraseMakerTest {
    public static void main(String[] args) {
        String[] words = {"Life", "is", "great", "thing"};

        //life IS great thing
        System.out.println(new PhraseMaker().join(words));
    }
}
