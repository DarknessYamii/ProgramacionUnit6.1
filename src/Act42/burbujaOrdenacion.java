package Act42;

import java.util.Arrays;
import java.util.Scanner;

import Biblioteca.MyArrays;

/**
 * Act42 expansion array String Tenemos una matriz de [5][5] de la cual queremos
 * ordenar una fila concreta que vamos a especificar por teclado. A
 * continuación, nos mostrará la matriz ordenada. (0,5 puntos) d. Utilizar el
 * método de la burbuja para realizar la ordenación. e. Ahora queremos ordenar
 * la diagonal principal de la matriz. Realizar la ordenación por inserción
 * directa.
 * 
 * @author andre
 *
 */
public class burbujaOrdenacion {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int arr[][] = new int[5][5];
		int B[] = new int[5];
		MyArrays.randomArr(arr, 10, 1);
		System.out.println(MyArrays.deepToString(arr));
		System.out.println("Que fila desea ordenar:(1,2,3,4,5)");
		int fila = sc.nextInt();
		if (fila > 0 && fila <= 5) {
			fila--;
		} else {
			System.out.println("Introduzca una fila valida");
			System.out.println("Fin del programa");
			System.exit(0);
		}
		MyArrays.ordenacionBurbuja(arr, fila);
		System.out.println("La fila " + (fila + 1) + " ha sido ordenada");
		System.out.println(MyArrays.deepToString(arr));
		for (int i = 0; i < arr.length - 1; i++) {
			int aux = arr[0][0];
			B[i + 1] = arr[i + 1][i + 1];
			B[0] = aux;
		}
		MyArrays.InsercionDirecta(B);
		for (int i = 0; i < arr.length - 1; i++) {
			int aux = B[0];
			arr[i + 1][i + 1] = B[i];
			arr[0][0] = aux;
		}
		System.out.println("Diagonal por insercion directa: ");
		System.out.println(MyArrays.deepToString(arr));
	}

}
