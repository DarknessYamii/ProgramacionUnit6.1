package Act12;

import java.util.Arrays;
import java.util.Random;

/**
 * Act12 de expansion de arrays Realiza un programa que cree un vector de 100
 * posiciones con números aleatorios entre 10 y 80. Una vez creado el vector el
 * programa deberá mostrar el mayor, el menor, el valor que más se repite y la
 * media.
 * 
 * @author andre
 *
 */
public class randomMayorMenorMediaArrays {

	public static void main(String[] args) {
		int array[] = new int[100];
		int maximaVecesQueSeRepite = 0;
		int moda = 0, media = 0, mayor = 0, menor = 81;
		Random r = new Random();
		int i, j;
		for (i = 0; i < array.length; i++) {
			array[i] = r.nextInt(80 - 9) + 10;
			media = array[i] + media;
			// Ponemos if para que dentro de este se intercambien los valores de la variable
			// mayor si se cumple la condicion
			if (mayor < array[i]) {
				mayor = array[i];
			}
			// Ponemos if para que dentro de este se intercambien los valores de la variable
			// menor si se cumple la condicion
			if (menor > array[i]) {
				menor = array[i];
			}

		}
		Arrays.sort(array);
		//Busqueda de Moda
		for (i = 0; i < array.length; i++) {
			int vecesQueSeRepite = 0;
			for (j = 0; j < array.length; j++) {
				if (array[i] == array[j])
					vecesQueSeRepite++;
			}
			if (vecesQueSeRepite > maximaVecesQueSeRepite) {
				moda = array[i];
				maximaVecesQueSeRepite = vecesQueSeRepite;
			}
		}
		media = media / array.length;
		System.out.println("El mayor es: " + mayor);
		System.out.println("El menor es: " + menor);
		System.out.println("La media es: " + media);
		System.out.println("El numero mas repetido es: " + moda);
	}
}
