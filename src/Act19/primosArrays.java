package Act19;

import java.util.Arrays;

import Biblioteca.MyArrays;

/**
 * Act19 de expansion de arrays 
 * Dado un vector de números determina aquellos que sea primos.
 * @author andre
 *
 */
public class primosArrays {

	public static void main(String[] args) {
		int A[] = new int[10];
		MyArrays.randomArr(A, 100,1 );
		System.out.println(Arrays.toString(A));
		if(!Arrays.equals(MyArrays.primoArray(A), new int[0])) {
		System.out.println("Los numeros primos dentro del array son: "+Arrays.toString(MyArrays.primoArray(A)));
		}else {
			System.out.println("No hay numeros primos");
		}
	}

}
