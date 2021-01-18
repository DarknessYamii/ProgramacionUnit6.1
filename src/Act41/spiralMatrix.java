package Act41;

import java.util.Scanner;

import Biblioteca.MyArrays;

/**
 * ACT41 expansion array String Crear un programa que permita generar una matriz
 * �caracol�. El programa permitir� generar un entero (que ser� el orden de la
 * matriz) y devolver� la matriz �caracol� de dicho orden. Crear dos m�todos,
 * uno que sirva para rellenar la matriz caracol y otro para mostrarla. A
 * continuaci�n, se muestra un ejemplo de matrices caracol de orden 2, 3, 4 y 5
 * respectivamente.
 * 
 * @author andre
 *
 */
public class spiralMatrix {

	public static void main(String[] args) {
		System.out.println("Dimension de la matriz caracol:");
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		System.out.println("Numero por el cual empezara:");
		int x = sc.nextInt();
		MyArrays.mostrarMatrizCaracol(MyArrays.generarMatrizCaracol(n, x), n, n);

	}

}
