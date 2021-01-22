import java.util.Arrays;
import java.util.Scanner;

public class SomeTest {

    /*public void testMath() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter x here");
        int x = scanner.nextInt();
        System.out.println("Enter y here");
        int y = scanner.nextInt();
        System.out.println((x+y) + " " + (x-y) + " " + (x*y) + " " + (x/y));
        scanner.close();
    }

    public static void main(String[] args) {
        new SomeTest().testMath();
    }*/

    public int[] leavePrices9(int[] prices){
        int[] tempResult = new int[prices.length];
        int counter = 0;
        for (int i = 0; i < prices.length; i++) {
            if(prices[i] % 10 == 9){
                tempResult[counter] = prices[i];
                counter++;
            }
        }
        return Arrays.copyOf(tempResult, counter);
    }

    public static void main(String[] args) {
        SomeTest t = new SomeTest();
        System.out.println(Arrays.toString(t.leavePrices9(new int[] {1,99,5,49})));
    }
}
