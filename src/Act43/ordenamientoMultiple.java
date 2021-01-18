package Act43;

import java.util.Arrays;
import java.util.Scanner;

import Biblioteca.MyArrays;

/**
 * Dada una matriz N*N y un vector de tamaño N, determina si existe alguna
 * columna de la matriz que sea igual al vector, y en caso de que exista,
 * indicar que número de columna es. Ordenar en orden ascendente dicha columna
 * en la matriz dada (Utilizar un menú para elegir que método de ordenación se
 * utiliza) y mostrar dicha matriz con la columna ya ordenada.
 * 
 * 
 * Act43 de expansion de arrays y String
 * 
 * @author andre
 *
 */
public class ordenamientoMultiple {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Cuan grande desea la matriz y el vector:");
		int n = sc.nextInt();
		boolean correcto = true;
		int arrA[][] = new int[n][n];
		int arrB[] = new int[n];
		MyArrays.randomArr(arrA, 3, 1);
		MyArrays.randomArr(arrB, 3, 1);
		System.out.println(MyArrays.deepToString(arrA));
		System.out.println(Arrays.toString(arrB));
		int arrATrans[][] = MyArrays.Transponer(arrA);
		if (MyArrays.busquedaCoincidente(arrATrans, arrB) >= 0) {
			System.out.println("La columna coincidente es: " + (MyArrays.busquedaCoincidente(arrATrans, arrB) + 1));

		} else {
			System.out.println("No es coincidente");
		}
		int columnaCoincidente = MyArrays.busquedaCoincidente(arrATrans, arrB);
		do {
			if (MyArrays.busquedaCoincidente(arrATrans, arrB) >= 0) {
				System.out.println("Como lo quieres ordenar" + "\n 1.Burbuja" + "\n 2.Insercion Directa");
				int seleccion = sc.nextInt();

				switch (seleccion) {
				case 1:
					MyArrays.ordenacionBurbuja(arrATrans, MyArrays.busquedaCoincidente(arrATrans, arrB));
					arrA = MyArrays.Transponer(arrATrans);
					System.out.println(MyArrays.deepToString(arrA));
					correcto = false;
					break;
				case 2:
					MyArrays.InsercionDirecta(arrB);

					arrATrans[columnaCoincidente] = arrB;
					arrA = MyArrays.Transponer(arrATrans);
					System.out.println(MyArrays.deepToString(arrA));
					correcto = false;
					break;
				default:
					System.out.println("Seleccione uno de los 2 metodos disponibles porfavor");
					break;
				}
			}

		} while (correcto != false);
	}
}
