import java.util.function.IntFunction;
import java.util.function.IntPredicate;
import java.util.stream.IntStream;

public class FizzBuzz {
    
    private static final IntPredicate isDivisibleBy3 = n -> n % 3 == 0;
    private static final IntPredicate isDivisibleBy5 = n -> n % 5 == 0;
    private static final IntPredicate isDivisibleBy15 = isDivisibleBy3.and(isDivisibleBy5);
    
    private static final IntFunction<String> fizzBuzzMapper = n ->
        isDivisibleBy15.test(n) ? "FizzBuzz" :
        isDivisibleBy3.test(n) ? "Fizz" :
        isDivisibleBy5.test(n) ? "Buzz" :
        String.valueOf(n);
    
    public static void playFizzBuzz(int limit) {
        IntStream.rangeClosed(1, limit)
                .mapToObj(fizzBuzzMapper)
                .forEach(System.out::println);
    }
    
    public static void main(String[] args) {
        System.out.println("FizzBuzz Game (1-100):");
        playFizzBuzz(100);
    }
}