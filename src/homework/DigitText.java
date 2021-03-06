package homework;

class DigitText {
    public boolean detect(String text){
        String cleanText = text.replaceAll("\\d", "").replace(" ", "");

        if(cleanText.isBlank()){
            return true;
        }else{
            return false;
        }
    }
}

class DigitTextTest {
    public static void main(String[] args) {
        //true
        System.out.println(new DigitText().detect("23 50"));

        //false
        System.out.println(new DigitText().detect("Year 1990"));
    }
}