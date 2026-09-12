package samplejava;
public class Ex3PrimeNumber {
	public static void main(String[] args) {
		int num = 113;
		isPrime(num);
	}

	private static void isPrime(int num) {
		if (num <= 1) {
			System.out.println("Not prime");
			return;
		} else if (num == 2) {
			System.out.println("Prime");
			return;
		} else if (num % 2 == 0) {
			System.out.println("Not prime");
			return;
		} else {
			int itr = 3;
			// Changed < to <= to correctly handle perfect squares
			while (itr * itr <= num) {
				if (num % itr == 0) {
					System.out.println("Not prime");
					return;
				}
				itr += 2;
			}
		}

		// If no divisors were found, it is prime
		System.out.println("Prime");
	}
}
