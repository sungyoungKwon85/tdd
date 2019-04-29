package xpworks;

public class FizzBuzz {
    // fizzBuzz_should_say_1_for_1 는 성공 했다.
//    public static String say(int number) {
//        return "1";
//    }

    // fizzBuzz_should_say_2_for_2 이거 돌린 후, 실패해서 리팩토링을 했다.
    /*public static String say(int number) {
//        if (number == 2) {
//            return "" + 2;
//        }
//        return "" + 1;

        // refactoring을 계속하다가.. 이게 좋겠다
        return String.valueOf(number);
    }*/


    // fizzBuzz_should_say_3_for_3 이거 돌린 후, 실패해서 리팩토링을 했다.
    /*public static String say(int number) {
        if (number % 3 == 0) {
            return "Fizz";
        }
        return String.valueOf(number);
    }*/

    // fizzBuzz_should_say_Buzz_for_multiples_of_5 이거 돌린 후, 실패해서 리팩토링을 했다.
    /*public static String say(int number) {
        if (number % 3 == 0) {
            return "Fizz";
        }
        if (number % 5 == 0) {
            return "Buzz";
        }
        return String.valueOf(number);
    }*/

    // fizzBuzz_should_say_Buzz_for_multiples_of_15 이거 돌린 후, 실패해서 리팩토링을 했다.
    public static String say(int number) {
        if (number % 15 == 0) {
            return "FizzBuzz";
        }
        if (number % 3 == 0) {
            return "Fizz";
        }
        if (number % 5 == 0) {
            return "Buzz";
        }
        return String.valueOf(number);
    }


}
