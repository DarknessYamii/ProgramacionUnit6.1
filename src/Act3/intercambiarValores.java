package Act3;

import java.util.Scanner;

/**
 * Act 3 de la expansion de actividades
 * Leer un array de 10 elementos e intercambiar los elementos situados en
 * posiciones consecutivas
 * @author andre
 *
 */
public class intercambiarValores {

	public static void main(String[] args) {
		try (Scanner scan = new Scanner(System.in)) {
			int i;
			int array[] = new int[10];
			System.out.println("Indique los números del array: ");
			for (i = 0; i < array.length; i++) {
				System.out.print("posición " + i + " = ");
				array[i] = scan.nextInt();
			}
			int j = 0;
			int k = 0;
			for (i = 0; i < array.length; i += 2) {
				j = array[i];
				k = array[i + 1];
				array[i] = k;
				array[i + 1] = j;
				System.out.println("posición " + i + " intercambiada = " + array[i]);
				System.out.println("posición " + (i + 1) + " intercambiada = " + array[i + 1]);
			}
		}
	}
}
