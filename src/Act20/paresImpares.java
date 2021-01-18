package Act20;

import java.util.Arrays;

import Biblioteca.MyArrays;

/**
 * Act20 expansion de arrays Crear un programa llamado paresImpares que cree un
 * array de 100 números aleatorios del 1 al 1000. Una vez creado, mostrar el
 * contenido y después organizarlo de forma que estén juntos los elementos pares
 * y los impares en dos vectores distintos.
 * 
 * @author andre
 *
 */
public class paresImpares {

	public static void main(String[] args) {
		int A[] = new int[100];
		MyArrays.randomArr(A, 1000, 1);
		System.out.println("Los elementos pares son: "+Arrays.toString(MyArrays.separarPar(A)));
		System.out.println("Los elementos impares son: "+Arrays.toString(MyArrays.separarImpar(A)));


	}

}
