package homework;

import java.util.Arrays;

class DigitExtracter {
    public int[] extract(String text){
        int count = 0;
        for (int i = 0; i < text.length(); i++) {
            if(isDigit(text.substring(i, i + 1))){
                count++;
            }
        }
        int[] digits = new int[count];
        count = 0;
        for (int i = 0; i < text.length(); i++) {
            if(isDigit(text.substring(i, i + 1))){
                digits[count] = Integer.parseInt(text.substring(i, i + 1));
                count++;
            }
        }
        return digits;
    }

    private boolean isDigit(String s){
        try{
            Integer.parseInt(s);
            return true;
        }catch (Exception e){
            return false;
        }
    }
}

class DigitExtracterTest {
    public static void main(String[] args) {
        DigitExtracter digitExtracter = new DigitExtracter();

        int[] extracted = digitExtracter.extract("april 5, year 2000");

        //[5, 2, 0, 0, 0]
        System.out.println(Arrays.toString(extracted));
    }
}