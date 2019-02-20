package one;

public class Factorial {

    public static void main(String[] args) {
        System.out.println(factorialMethod(5));
    }

    public static int factorialMethod(int number) {
        if (number <= 0) {// will hceck only 1st line after if
            //System.out.println("dsf");
            throw new RuntimeException("The number must be greater than 0");
        }else if (number>20){
            throw new RuntimeException("number must be less than 20");
        }

        int result = 1;
        for (int i = 1; i <= number; i++) {
            result = result * (i);
        }
        return result;
    }
}
