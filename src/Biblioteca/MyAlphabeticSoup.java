package Biblioteca;

import java.util.Arrays;
import java.util.Random;

/**
 * Biblioteca usada para la actividad 36 de sopa de letra
 * 
 * @author andre
 *
 */
public class MyAlphabeticSoup {
	/**
	 * Colocar letra sirve para coger un String e introducirlo en un array de
	 * caracteres separando cada caracter del string en posiciones
	 * 
	 * @param s
	 * @param Soup
	 * @param charOcupadas
	 */
	public static void colocarLetras(String s, char Soup[][], Array2D charOcupadas) {
		int longPalabra = s.length();
		boolean Ocupado;
		int posPalabra[][] = new int[longPalabra][2];
		do {
			Ocupado = false;
			seleccionarPosicion(longPalabra, posPalabra);

			int[][] aux = charOcupadas.getMatrix();

			for (int[] i : aux) { // Recorre el array de aux el cual contiene las posiciones de los caracteres ya
									// introducidos

				for (int j = 0; j < longPalabra; j++) {
					/**
					 * Analiza si puede meter la palabra o no en esas posiciones o si pueden llegar
					 * a compartir letra, ya que con el boolean vamos a repetir el bucle hasta que
					 * se introduzca
					 */
					if (Soup[i[0]][i[1]] != s.charAt(j) && Arrays.equals(i, posPalabra[j])) {
						Ocupado = true;

					}

				}
			}
		} while (Ocupado);
		/**
		 * Coloca las letras y va rellenando la matriz la cual contiene las posiciones
		 * de cada caracter de cada palabra introducida por el usuario
		 */
		for (int i = 0; i < longPalabra; i++) {
			Soup[posPalabra[i][0]][posPalabra[i][1]] = s.charAt(i);
			charOcupadas.addMatrix(posPalabra[i]);

		}

	}

	/**
	 * Selecciona una posicion y una forma para introducir las palabras dentro de la
	 * sopa
	 * 
	 * @param longPalabra
	 * @param posPalabra
	 */
	public static void seleccionarPosicion(int longPalabra, int[][] posPalabra) {
		Random r = new Random();
		int direccion, fila, columna;
		direccion = r.nextInt(4);
		switch (direccion) {
		case 0: // VERTICAL ABAJO

			fila = r.nextInt(15 - longPalabra);
			columna = r.nextInt(15);

			for (int i = 0; i < longPalabra; i++) {
				posPalabra[i][0] = fila + i;
				posPalabra[i][1] = columna;
//				System.out.println(Arrays.toString(posPalabra[i]));
			}

			break;
		case 1: // HORIZONTAL DERECHA
			fila = r.nextInt(15);
			columna = r.nextInt(15 - longPalabra);

			for (int i = 0; i < longPalabra; i++) {
				posPalabra[i][0] = fila;
				posPalabra[i][1] = columna + i;
//				System.out.println(Arrays.toString(posPalabra[i]));

			}
			break;

		case 2: // VERTICAL ARRIBA

			fila = r.nextInt(15 - longPalabra) + longPalabra;
			columna = r.nextInt(15);

			for (int i = longPalabra - 1; i >= 0; i--) {
				posPalabra[i][0] = fila - i;
				posPalabra[i][1] = columna;
			}

			break;

		case 3: // HORIZONTAL IZQUIERDA
			fila = r.nextInt(15);
			columna = r.nextInt(15 - longPalabra) + longPalabra;

			for (int i = longPalabra - 1; i >= 0; i--) {
				posPalabra[i][0] = fila;
				posPalabra[i][1] = columna - i;

			}
			break;
		}

	}

}
