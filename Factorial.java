// factorial of an integer
// F(n) = F(1)*F(2)...F(n-1)*F(n)

public class Factorial {

	public static void main(String[] args) {

		System.out.print(factorial(3));
		
	}

	private static long factorial(long n) {
		if (n == 1)
			return 1;
		
		else
			return (n * factorial(n - 1));
	}

}
