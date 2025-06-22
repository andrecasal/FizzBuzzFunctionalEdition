import java.util.stream.IntStream;

public class FizzBuzz {
	public static void main(String[] args) {
		System.out.println("FizzBuzz Game (1-100):");
		playFizzBuzz(100);
	}

	public static void playFizzBuzz(int limit) {
		IntStream.rangeClosed(1, limit)
				.mapToObj(FizzBuzz::mapToFizzBuzz)
				.forEach(System.out::println);
	}

	private static String mapToFizzBuzz(int n) {
		return n % 15 == 0 ? "FizzBuzz" :
		       n % 3 == 0 ? "Fizz" :
		       n % 5 == 0 ? "Buzz" :
		       String.valueOf(n);
	}
}
