package tdd;

import java.util.stream.IntStream;

public class FizzBuzzer {
    public static String getValue(int input) {
        if (input < 1 || input > 100)
            throw new RuntimeException("the number must be greater" + " less than or equal 100");
        String result = "";
        if (input % 3 == 0)
            result += "Fizz";
        if (input % 5 == 0)
            result += "Buzz";
        if (result.isEmpty())
            result += Integer.toString(input);
        return result;
    }

    // home work
    public static void getFizzBuzz (){
        IntStream.rangeClosed(1,100).mapToObj(i -> i % 5 ==0 ?
                (i % 3 == 0 ? "FizzBuzz" :"Buzz") : (i % 3 == 0 ? "Fizz" : i))
                .forEach(System.out :: println);
    }

    public static void main(String[] args) {
        getFizzBuzz();
    }
}
