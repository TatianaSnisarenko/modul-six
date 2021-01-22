package homework;

class WaterCounter {
    public double count(String text){
        if(text.length() == 0) return 0;
        String textWithoutSpaces = text.replace(" ", "");
        return (text.length() - textWithoutSpaces.length()) / (text.length() * 1.0);
    }
}

class WaterCounterTest {
    public static void main(String[] args) {
        //0.07692307692307693
        System.out.println(new WaterCounter().count("Moon invaders"));

        //0
        System.out.println(new WaterCounter().count("NoWater"));
    }
}