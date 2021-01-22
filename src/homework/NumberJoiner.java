package homework;

class NumberJoiner {
    public String join(int[] numbers) {
        StringBuilder sb = new StringBuilder("");

        for(int number: numbers) {
            sb.append(number);
        }
        return sb.toString();
    }
}

class NumberJoinerTest {
    public static void main(String[] args) {
        //102030
        System.out.println(new NumberJoiner().join(new int[] {10, 20, 30}));
    }
}