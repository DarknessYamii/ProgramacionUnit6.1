package Biblioteca;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

/**
 * Clase MyArrays para poder facilitar el transcurso de las actividades de
 * expansion
 * 
 * @author andre
 *
 */
public class MyArrays {

	Scanner sc = new Scanner(System.in);

	/**
	 * Busqueda linear dentro de un Array
	 * 
	 * @param arr
	 * @param x
	 * @return
	 */
	public static int linearSearch(int arr[], int x) {
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] == x)
				return i;
		}
		return -1;
	}

	/**
	 * Linear Search sobrecargado para Matrices
	 * 
	 * @param arr
	 * @param x
	 * @return
	 */
	public static int[][] linearSearch(int arr[][], int x) {

		int[][] res = new int[arr.length * arr[0].length][2];

		int cont = 0;

		for (int i = 0; i < arr.length; i++) {

			for (int j = 0; j < arr[0].length; j++) {
				if (x == arr[i][j]) {
					res[cont][0] = i;
					res[cont][1] = j;
					cont++;
				}
			}
		}
		return Arrays.copyOf(res, cont);
	}

	/**
	 * Cambia los valores maximos y minimos de dos matrices
	 * 
	 * @param arrA
	 * @param arrB
	 */
	public static void swaper(int arrA[][], int arrB[][]) {
		int maxB = mayorArray(arrB);
		int minA = menorArray(arrA);
		for (int i = 0; i < arrA.length; i++) {
			for (int j = 0; j < arrA[0].length; j++) {
				if (maxB == arrB[i][j]) {
					arrB[i][j] = minA;
				}
				if (minA == arrA[i][j]) {
					arrA[i][j] = maxB;
				}
			}
		}
	}

	/**
	 * Genera un Array con tamaño arbitrario y permite la entrada de valores pon
	 * teclado
	 * 
	 * @param sc
	 * @return
	 */
	public static int[] addArray(Scanner sc) {

		int arr[] = new int[sc.nextInt()];
		for (int i = 0; i < arr.length; i++) {
			System.out.println("Valor de la posicion " + (i + 1) + ": ");
			arr[i] = sc.nextInt();
		}
		return arr;
	}

	/**
	 * Genera un Array con tamaño arbitrario que permite la entrada de Caracteres
	 * por teclado
	 * 
	 * @param sc
	 * @return
	 */

	/**
	 * Genera nuevos aleatorios dentro de un Array ya creado
	 * 
	 * @param arr
	 * @param mayor
	 * @param menor
	 */
	public static void randomArr(int arr[], int mayor, int menor) {
		Random r = new Random();
		for (int i = 0; i < arr.length; i++) {
			arr[i] = r.nextInt(mayor - (menor - 1)) + menor;
		}
	}

	/**
	 * Random sobrecargado para matrices
	 * 
	 * @param arr
	 * @param mayor
	 * @param menor
	 */
	public static void randomArr(int arr[][], int mayor, int menor) {
		for (int i = 0; i < arr.length; i++) {
			randomArr(arr[i], mayor, menor);

		}
	}

	/**
	 * Factorizamos el Array con el metodo ya anteriormente en la clase MyMath
	 * 
	 * @param arr
	 * @return
	 */
	public static int[] arrayFact(int arr[]) {
		int res[] = new int[arr.length];
		for (int i = 0; i < res.length; i++) {
			res[i] = MyMath.fact(arr[i]);
		}
		return res;
	}

	/**
	 * Suma de vectores
	 * 
	 * @param arrA
	 * @param arrB
	 * @return
	 */
	public static int[] sumaDosVectores(int arrA[], int arrB[]) {
		int arrC[] = new int[arrA.length];
		for (int i = 0; i < arrA.length; i++) {
			arrC[i] = arrA[i] + arrB[i];
		}
		return arrC;
	}

	/**
	 * Suma de matrices
	 * 
	 * @param arrA
	 * @param arrB
	 * @return
	 */
	public static int[][] sumaDosMatrices(int arrA[][], int arrB[][]) {
		int arrC[][] = new int[arrA.length][arrA[0].length];
		for (int i = 0; i < arrA.length; i++) {
			for (int j = 0; j < arrA[0].length; j++) {
				arrC[i][j] = arrA[i][j] + arrB[i][j];
			}
		}
		return arrC;
	}

	/**
	 * Encuentra el numero mayor dentro de un array
	 * 
	 * @param arr
	 * @return
	 */
	public static int mayorArray(int arr[]) {
		int mayor = arr[0];
		for (int i = 0; i < arr.length; i++) {
			if (mayor < arr[i]) {
				mayor = arr[i];
			}
		}
		return mayor;
	}

	/**
	 * Sobrecarga para encontrar numero mayor en un array 2D
	 * 
	 * @param arr
	 * @return
	 */
	public static int mayorArray(int arr[][]) {
		int mayor = arr[0][0];
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[0].length; j++) {
				if (mayor < arr[i][j]) {
					mayor = arr[i][j];
				}
			}

		}
		return mayor;
	}

	/**
	 * Encuentra el numero menor dentro de un array
	 * 
	 * @param arr
	 * @return
	 */
	public static int menorArray(int arr[]) {
		int menor = arr[0];
		for (int i = 0; i < arr.length; i++) {
			if (menor > arr[i]) {
				menor = arr[i];
			}
		}
		return menor;
	}

	/**
	 * Sobrecarga para encontrar numero menor en un array 2D
	 * 
	 * @param arr
	 * @return
	 */
	public static int menorArray(int arr[][]) {
		int menor = arr[0][0];
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[0].length; j++) {
				if (menor > arr[i][j]) {
					menor = arr[i][j];
				}
			}

		}
		return menor;
	}

	/**
	 * Detectar numeros primos dentro de un array
	 * 
	 * @param arr
	 * @return
	 */
	public static int[] primoArray(int arr[]) {
		int cont = 0;
		int res[] = new int[arr.length];
		for (int i = 0; i < arr.length; i++) {
			if (MyMath.esPrimo(arr[i])) {
				res[cont] = arr[i];
				cont++;
			}

		}
		return Arrays.copyOf(res, cont);
	}

	/**
	 * Muestra los numeros pares dentro de un array
	 * 
	 * @param arr
	 * @return
	 */
	public static int[] separarPar(int arr[]) {
		int res[] = new int[arr.length];
		int cont = 0;
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] % 2 == 0) {
				res[cont] = arr[i];
				cont++;

			}
		}
		return Arrays.copyOf(res, cont);
	}

	/**
	 * Muestra los numeros impares dentro de un ARRAY
	 * 
	 * @param arr
	 * @return
	 */
	public static int[] separarImpar(int arr[]) {
		int res[] = new int[arr.length];
		int cont = 0;
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] % 2 != 0) {
				res[cont] = arr[i];
				cont++;

			}
		}
		return Arrays.copyOf(res, cont);
	}

	/**
	 * deepToString pero bonito
	 * 
	 * @param arr
	 * @return
	 */
	public static String deepToString(int arr[][]) {
		String s = "";
		for (int i = 0; i < arr.length; i++) {
			s += Arrays.toString(arr[i]) + "\n";
		}
		return s;
	}

	/**
	 * Invertir la diagonal de una matriz
	 * 
	 * @param arr
	 */
	public static void diagonalInversa(int arr[][]) {
		for (int i = 0; i < arr.length / 2; i++) {
			int aux = arr[i][i];
			arr[i][i] = arr[arr.length - 1 - i][arr.length - 1 - i];
			arr[arr.length - 1 - i][arr.length - 1 - i] = aux;

		}
	}

	/**
	 * Encontrar semejanzas en dos arrays
	 * 
	 * @param arrA
	 * @param arrB
	 * @return
	 */
	public static boolean contenido(int arrA[], int arrB[]) {
		int cantidad_numeros;
		for (int i = 0; i < arrA.length; i++) {
			cantidad_numeros = 0;
			if (arrA.length - i < arrB.length) {
				return false;
			}
			for (int j = 0; j < arrB.length; j++) {
				if (arrA[i + j] == arrB[j]) {
					cantidad_numeros++;
				}
				if (cantidad_numeros == arrB.length) {
					return true;
				}
			}
		}
		return false;
	}

	/**
	 * Imprime la matriz latina N x N
	 * 
	 * @param n sera la encargada de decir cuan grande es la matriz
	 */
	public static void latinSquare(int n) {

		// Servira para controlar la rotacion
		int k = n + 1;

		// Imprimira las columnas
		for (int i = 1; i <= n; i++) {
			/**
			 * Esto solo se imprimira dps de la primera itineracion que imprimira los
			 * valores desde N a K
			 */
			int temp = k;

			while (temp <= n) {
				System.out.print(temp + " ");
				temp++;
			}

			/**
			 * Imprimer los valores desde N a -K
			 */
			for (int j = 1; j < k; j++)
				System.out.print(j + " ");

			k--;
			System.out.println();
		}
	}

	/**
	 * Genera la Matriz Caracol pidiendo por teclado los valores de N y X
	 * 
	 * @param n dimension de la matrix
	 * @param x Numero por el cual empezara
	 * @return
	 */
	public static int[][] generarMatrizCaracol(int n, int x) {
		int[][] M = new int[n + 1][n + 1];
		for (int a = 1; a <= n / 2; a++) {
			for (int i = a; i <= n - a; i++) {
				M[a][i] = x;
				x++;
			}
			for (int i = a; i <= n - a; i++) {
				M[i][n - a + 1] = x;
				x++;
			}
			for (int i = n - a + 1; i >= a + 1; i--) {
				M[n - a + 1][i] = x;
				x++;
			}
			for (int i = n - a + 1; i >= a + 1; i--) {
				M[i][a] = x;
				x++;
			}
		}
		if (n % 2 == 1) {
			M[n / 2 + 1][n / 2 + 1] = x;
		}
		return M;
	}

	/**
	 * Imprimira por pantalla de forma bonita la matriz caracol
	 * 
	 * @param M es la matriz a mostrar
	 * @param f filas de la matriz
	 * @param c columnas de la matriz
	 */
	public static void mostrarMatrizCaracol(int[][] M, int f, int c) {
		for (int i = 1; i <= f; i++) {
			for (int j = 1; j <= c; j++) {
				System.out.print("\t" + M[i][j]);
			}
			System.out.println();
		}

	}

	/**
	 * Ordenacion burbuja la cual ira intercambiando las variables de una matriz de
	 * la fila la cual especifiquemos La ordenacion burbuja hace varias pasadas
	 * hasta comprobar que no hay mas numeros intercambiables
	 * 
	 * @param arr
	 * @param fila
	 */
	public static void ordenacionBurbuja(int arr[][], int fila) {
		for (int i = fila; i <= fila; i++) {

			// Loop para las columnas
			for (int j = 0; j < arr[i].length; j++) {

				// Comparacion e intercambio
				for (int k = 0; k < arr[i].length - j - 1; k++) {
					if (arr[i][k] > arr[i][k + 1]) {

						// Intercambio de variables
						int aux = arr[i][k];
						arr[i][k] = arr[i][k + 1];
						arr[i][k + 1] = aux;
					}
				}
			}
		}
	}

	/**
	 * Ordenacion burbuja el cual ordena una matriz comparando el valor encontrado
	 * con el anterior y sigue haciendo loops hasta q no encuentra mas valores
	 * intercambiables
	 * 
	 * @param arr
	 */
	public static void ordenacionBurbuja(int arr[][]) {
		for (int i = 0; i <= arr.length; i++) {

			// Loop para las columnas
			for (int j = 0; j < arr[i].length; j++) {

				// Comparacion e intercambio
				for (int k = 0; k < arr[i].length - j - 1; k++) {
					if (arr[i][k] > arr[i][k + 1]) {

						// Intercambio de variables
						int aux = arr[i][k];
						arr[i][k] = arr[i][k + 1];
						arr[i][k + 1] = aux;
					}
				}
			}
		}
	}

	/**
	 * Transpone una matriz, basicamnete sus columnas se vuelven filas y viceversa
	 * 
	 * @param arr
	 * @return
	 */
	public static int[][] Transponer(int arr[][]) {
		int Trans[][] = new int[arr[0].length][arr.length];
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {
				Trans[j][i] = arr[i][j];
			}

		}
		return Trans;
	}

	/**
	 * Compara la fila de una matriz con un vector y devuelve cual fila de la matriz
	 * es similar a la del vector
	 * 
	 * @param arrA
	 * @param arrB
	 * @return
	 */
	public static int busquedaCoincidente(int arrA[][], int arrB[]) {
		for (int i = 0; i < arrA.length; i++) {
			if (Arrays.equals(arrA[i], arrB)) {
				return i;
			}
		}
		return -1;
	}

	/**
	 * Insercion directa compara un valor de un array con todos los anteriores y
	 * comprueba si el valor q esta siendo a comparar es menor que los anteriores
	 * valores a el
	 * 
	 * @param A
	 */
	public static void InsercionDirecta(int[] A) {
		int n = A.length;
		for (int i = 1; i < n; i++) {
			int v = A[i];
			int j = i - 1;
			while (j >= 0 && A[j] > v) {
				A[j + 1] = A[j];
				j--;
			}
			A[j + 1] = v;
		}
	}

	/**
	 * Busca un elemento del array que sea mayor de su columna y menor de su fila.
	 * Transpongo la matriz introducida para comparar de una forma mas eficiente los
	 * valores de sus columnas
	 * 
	 * @param arr
	 * @return
	 */
	public static int[][] puntoSilla(int arr[][]) {
		int minCol;
		int[][] res = new int[arr.length * arr[0].length][2];
		int cont = 0;
		int Trans[][] = Transponer(arr);
		for (int i = 0; i < arr.length; i++) {
			minCol = menorArray(arr[i]);
			for (int j = 0; j < arr.length; j++) {
				if (arr[i][j] == minCol && minCol == mayorArray(Trans[j])) {
					res[cont][0] = j;
					res[cont][1] = i;
					cont++;
				}
			}
		}
		return Arrays.copyOf(res, cont);
	}

}
