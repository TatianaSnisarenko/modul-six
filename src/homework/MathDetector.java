package homework;

class MathDetector {
    public boolean isMath(String text){
        boolean containsEquals = text.contains("=");

        boolean containsMathSign = text.contains("+")
                ||text.contains("-")
                ||text.contains("*")
                ||text.contains("/");

        String digitReplaced = text.replaceAll("[0-9]", "");

        boolean containsDigits = text.length() - digitReplaced.length() >= 2;

        if(containsDigits && containsEquals && containsMathSign){
            return true;
        }else{
            return false;
        }
    }
}

class MathDetectorTest {
    public static void main(String[] args) {
        //true
        System.out.println(new MathDetector().isMath("2+2=4"));

        //false
        System.out.println(new MathDetector().isMath("1992 is great year"));

        //false
        System.out.println(new MathDetector().isMath("Venus vs Earth"));
    }
}