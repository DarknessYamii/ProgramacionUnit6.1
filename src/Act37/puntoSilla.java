package Act37;

import java.util.Scanner;

import Biblioteca.MyArrays;

/**
 * Act37 expansion array String Una matriz tiene un punto de silla en una de sus
 * componentes si es el mayor valor de su columna y el menor de su fila. Diseñar
 * un algoritmo que recibiendo una matriz cuadrada de NxN, escriba en la
 * pantalla las coordenadas de todos sus puntos silla.
 * 
 * @author andre
 *
 */
public class puntoSilla {

	public static void main(String[] args) {
		System.out.println("AVISO: Los puntos de silla son raros, no se mostrara nada en consola si no existen");
		System.out.println("Cuan grande deseas la matriz:");

		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int arr[][] = new int[n][n];
		MyArrays.randomArr(arr, 9, 1);
		System.out.println(MyArrays.deepToString(arr));
		// Haz un RUN hasta que exista un punto de silla, son muy raros
		System.out.println(MyArrays.deepToString(MyArrays.puntoSilla(arr)));

	}

}
