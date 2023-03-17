package util;

public class FizzBuzz {

    public static String process(int number) {
        if ( isMultipleOf(number ,3 ,5) )
            return "FizzBuzz";

        if( isMultipleOf(number, 3) )
            return "Fizz";

        if( isMultipleOf(number, 5) )
            return "Buzz";

        return "";
    }

    private static boolean isMultipleOf(int number, int... tests) {
        for(int test : tests) {
            if(number%test != 0)
                return false;
        }

        return true;
    }
}
