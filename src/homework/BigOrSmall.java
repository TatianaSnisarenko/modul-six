package homework;

class BigOrSmall {
    public String calculate(String text){
        char[] chars = text.toCharArray();
        int bigCharsCount = 0;
        int smallCharsCount = 0;
        for (char c : chars) {
            if(c == ' ') continue;
            if(Character.isUpperCase(c)){
                bigCharsCount++;
            }else if(Character.isLowerCase(c)){
                smallCharsCount++;
            }
        }
        if(bigCharsCount > smallCharsCount){
            return "Big";
        }else if(bigCharsCount < smallCharsCount){
            return "Small";
        }else{
            return "Same";
        }
    }
}

class BigOrSmallTest {
    public static void main(String[] args) {
        //Small
        System.out.println(new BigOrSmall().calculate("Java"));

        //Big
        System.out.println(new BigOrSmall().calculate("JAVA"));

        //Same
        System.out.println(new BigOrSmall().calculate("jAvA"));
    }
}
