package Act33;

/**
 * Act33 de expansion de Array y String
 * Diseñar un programa que permita mover una ficha sobre un tablero de 8x8. En
 * las celdillas de dicho tablero tenemos varias minas. El juego finaliza cuando el
 * usuario topa con una de dichas minas.
 */
import java.util.Scanner;

import Biblioteca.MyArrays;
import Biblioteca.MyBuscaminas;

public class buscaMinas {

	public static void main(String[] args) {
		String mv;
		boolean bomb = false;
		int player = 2;
		int Tablero[][] = new int[8][8];
		/**
		 * He usado los 1 como referencia de minas, los 0 como espacios libres´
		 * y el 2 lo he usado como ficha referente al jugador
		 */
		MyArrays.randomArr(Tablero, 1, 0);
		Tablero[Tablero.length / 2][Tablero[0].length / 2] = 2;
		System.out.println(MyArrays.deepToString(Tablero));//Los imprimo para comprobar si cuando choca con un 1 funciona el game over
		do {
			System.out.println("Que desea hacer:");
			System.out.println(MyBuscaminas.menu());
			Scanner sc = new Scanner(System.in);
			mv = sc.next().toUpperCase();
			switch (mv) {
			/**
			 * Este Switch contendra los movimientos del jugador los cuales son siempre
			 * lo mismo simplemente cambiando la coordenada a la que van si es i o j 
			 * y si es negativo o positivo
			 * La I sera la columna y la J la fila 
			 */
			case "W":
				/**
				 * Todos los casos son iguales, recorro el array completo y busco al jugador
				 * una vez que lo encuentro le aplico el movimiento que ha deseado realizar el jugador
				 */
				for (int i = 0; i < Tablero.length; i++) {
					for (int j = 0; j < Tablero[0].length; j++) {
						if (Tablero[i][j] == player) {
							if(i==0) {
								System.out.println("Has llegado al limite del Tablero");
								break;
							}else if (Tablero[i - 1][j] == 1) {
								System.out.println("Game Over");
								bomb = true;
								break;
							} else if (Tablero[i - 1][j] == 0) {
								Tablero[i][j] = 0;
								Tablero[i - 1][j] = 2;
								System.out.println(MyArrays.deepToString(Tablero));//Los imprimo para comprobar si cuando choca con un 1 funciona el game over
								bomb = false;
								break;
							} 
						}
					}
				}
				break;
			case "S":
				for (int i = 0; i < Tablero.length; i++) {
					for (int j = 0; j < Tablero[0].length; j++) {
						if (Tablero[i][j] == player) {

							if (i == Tablero.length - 1) {
								System.out.println("Has llegado al limite del Tablero");
								break;
							} else if (Tablero[i + 1][j] == 1) {
								System.out.println("Game Over");
								bomb = true;
								break;
							} else if (Tablero[i + 1][j] == 0) {
								Tablero[i][j] = 0;
								Tablero[i + 1][j] = 2;
								System.out.println(MyArrays.deepToString(Tablero));//Los imprimo para comprobar si cuando choca con un 1 funciona el game over
								bomb = false;
								/**
								 * El i y j lo igualo a 8 para que no compare de vuelta
								 * los valores y se desplace hacia abajo infinitamente
								 */
								i = Tablero.length;
								j = Tablero.length;
								break;
							}
						}
					}
				}
				break;
			case "D":
				for (int i = 0; i < Tablero.length; i++) {
					for (int j = 0; j < Tablero[0].length; j++) {
						if (Tablero[i][j] == player) {
							if (j == Tablero.length - 1) {
								System.out.println("Has llegado al limite del Tablero");
								break;
							}else if (Tablero[i][j + 1] == 1) {
								System.out.println("Game Over");
								bomb = true;
								break;
							} else if (Tablero[i][j + 1] == 0) {
								Tablero[i][j] = 0;
								Tablero[i][j + 1] = 2;
								System.out.println(MyArrays.deepToString(Tablero));//Los imprimo para comprobar si cuando choca con un 1 funciona el game over
								bomb = false;
								break;
							} 
						}
					}
				}
				break;
			case "A":
				for (int i = 0; i < Tablero.length; i++) {
					for (int j = 0; j < Tablero[0].length; j++) {
						if (Tablero[i][j] == player) {
							if(j==0) {
								System.out.println("Has llegado al limite del Tablero");
								break;
							}else if (Tablero[i][j - 1] == 1) {
								System.out.println("Game Over");
								bomb = true;
								break;
							} else if (Tablero[i][j - 1] == 0) {
								Tablero[i][j] = 0;
								Tablero[i][j - 1] = 2;
								System.out.println(MyArrays.deepToString(Tablero));//Los imprimo para comprobar si cuando choca con un 1 funciona el game over
								bomb = false;
								break;
							} 
						}
					}
				}
				break;
			default:
				System.out.println("Por favor seleccione algo");
				break;
			}
		} while (bomb == false);
	}

}
