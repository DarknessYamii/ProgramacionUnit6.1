package Act39;

import java.util.Scanner;

/**
 * Act39 expansion array String
 * Realiza un programa con un método recursivo que muestre por pantalla la serie
 * de Fibonacci.
 * 
 * @author andre
 *
 */
public class fibRecursivo {
	static int fibRecursivo(int n) {
		if (n < 2)
			return n;
		return fibRecursivo(n - 1) + fibRecursivo(n - 2);
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Introduce cuantos valores de Fibonacci desea:");
		int n = sc.nextInt();
		if (n <= 0) {
			System.err.println("MAL!");
			System.exit(0);
		}

		for (int i = 0; i < n; i++)
			System.out.println(fibRecursivo(i));
	}
}
