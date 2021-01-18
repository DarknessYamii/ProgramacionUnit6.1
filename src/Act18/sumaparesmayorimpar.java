package Act18;

import java.util.Arrays;

import Biblioteca.MyArrays;

/**
 * Act18 de expansion de arrays Leer una secuencia de 20 números almacenarlos en
 * un vector A[1..20] y mostrar la suma de los elementos que ocupan posiciones
 * pares y el mayor de los que ocupan posiciones impares.
 * 
 * @author andre
 *
 */
public class sumaparesmayorimpar {

	public static void main(String[] args) {
		int array[] = new int[20];
		int suma = 0;
		MyArrays.randomArr(array, 10, 1);
		int mayor = array[1];
		System.out.println(Arrays.toString(array));
		for (int i = 0; i < array.length; i += 2) { // Empieza por 0 y el ultimo array par es el 18 ya que los arrays
													// empiezan por 0 y el array 20 seria el 19
			suma += array[i];
		}
		for (int i = 1; i < array.length; i += 2) {
			if (array[i] > mayor) {
				mayor = array[i];
			}
		}
		System.out.println("La suma de posiciones pares es: " + suma);
		System.out.println("El mayor de las posiciones impares es: " + mayor);
	}

}
