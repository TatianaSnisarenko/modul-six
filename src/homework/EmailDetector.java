package homework;

class EmailDetector {
    public boolean isPresent(String text){
        String textWithoutEmail = text.replaceAll("\\w{2}@\\w{2}", "");
        if(text.length() - textWithoutEmail.length() == 5){
            return true;
        }else{
            return false;
        }

    }
}

class EmailDetectorTest {
    public static void main(String[] args) {
        //true
        System.out.println(new EmailDetector().isPresent("This email is no-reply@goo.com"));

        //false
        System.out.println(new EmailDetector().isPresent("No email present, but @ there"));
    }
}
