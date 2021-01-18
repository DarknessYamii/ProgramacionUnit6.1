package Act2;

import java.util.Scanner;
/**
 * Act 2 de la expansion de actividades
 * Obtenga la sumatoria y la media de los elementos de un array.
 * @author andre
 *
 */
public class sumymediadeArrays {

	public static void main(String[] args) {
		int array[] = new int[6];
		Scanner sc = new Scanner(System.in);
		int i,num;
		double media,suma=0;
		System.out.println("Introduzca 6 valores");
		//Este for recorre el array para introducir los valores
		for(i = 0; i<array.length; i++) {
			num = sc.nextInt();
			array[i] = num;
			suma=array[i]+suma;
		}
		media = suma/array.length;
		System.out.println("La sumatoria del array es "+suma+" y la media del array es "+media);
	}

}
