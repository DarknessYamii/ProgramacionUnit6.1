package Act15;

import java.util.Arrays;

import Biblioteca.MyArrays;
import Biblioteca.MyMath;

/**
 * Act15 de expansion de arrays 
 * Leer una secuencia de 20 números y almacenar en
 * un vector sus factoriales.
 * 
 * @author andre
 *
 */
public class arrayFactorial {

	public static void main(String[] args) {
		int array[] = new int[20];
		MyArrays.randomArr(array, 10, 1);
		System.out.println(Arrays.toString(array));
		System.out.println(Arrays.toString(MyArrays.arrayFact(array)));
	}
}
