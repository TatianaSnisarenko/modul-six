package homework;

class DoubleSpaceCleaner {
    public String clean(String phrase){
        String[] parts = phrase.strip().split(" ");
        String cleanString = "";
        for (String s :
                parts) {

            if(!s.isBlank()){
                cleanString = cleanString + " " + s;
            }
        }

       return cleanString.strip();

    }
}

class DoubleSpaceCleanerTest {
    public static void main(String[] args) {
        DoubleSpaceCleaner cleaner = new DoubleSpaceCleaner();

        //Hello World
        System.out.println(cleaner.clean("Hello World"));

        //Hello World
        System.out.println(cleaner.clean("       Hello              World          "));
    }
}