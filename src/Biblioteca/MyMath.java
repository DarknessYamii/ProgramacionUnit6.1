package Biblioteca;

import java.util.Random;

/**
 * Clase MyMath para poder facilitar el transcurso de las actividades de
 * expansion
 * 
 * @author andre
 *
 */
public class MyMath {

	// Metodo factorial recursivo
	public static int fact(int n) {
		if (n > 1) {
			return n * fact(n - 1);
		} else {
			return 1;
		}

	}

	/**
	 * Random para un Int cualsea
	 * 
	 * @param variable
	 * @param mayor
	 * @param menor
	 * @return
	 */
	public static int randomVar(int variable, int mayor, int menor) {
		Random r = new Random();

		return variable = r.nextInt(mayor - (menor - 1)) + menor;

	}

	/**
	 * Identificar si un numero es primo
	 * 
	 * @param numero
	 * @return
	 */
	public static boolean esPrimo(int numero) {
		int contador = 2;
		boolean primo = true;
		while ((primo) && (contador != numero)) {
			if (numero % contador == 0)
				primo = false;
			contador++;
		}
		return primo;
	}

	/**
	 * Metodo para saber si un numero es Capicua.
	 * 
	 * @param numero
	 * @return
	 */
	public static boolean esCapicua(int numero) {
		return MyString.esPalindromo(String.valueOf(numero));
	}

	/**
	 * Metodo para dibujar el triangulo de pascal
	 * 
	 * @param n
	 */
	public static void printNewtonBinomial(int n) {
		for (int i = 0; i < n; i++) {
			for (int k = 0; k < n - i; k++) {
				System.out.print(" ");
			}
			for (int j = 0; j <= i; j++) {
				System.out.print(newtonBinomial(i, j) + " ");
			}
			System.out.println();
		}
	}

	/**
	 * Metodo para obtener la formula del triangulo de pascal recursivo
	 * 
	 * @param i
	 * @param j
	 * @return
	 */
	private static int newtonBinomial(int i, int j) {
		if (j == 0 || j == i) {
			return 1;
		} else {
			return newtonBinomial(i - 1, j - 1) + newtonBinomial(i - 1, j);
		}
	}
}
