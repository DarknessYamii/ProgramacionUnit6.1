package Biblioteca;

import java.util.Arrays;
import java.util.Random;

/**
 * Biblioteca propia para funciones con Strings
 * 
 * @author andre
 *
 */
public class MyString {
	/**
	 * Cambia una palabra de una frase por la que el usuario quiera
	 * 
	 * @param s
	 * @param palabra
	 * @param remplazar
	 * @return
	 */
	public static String cambiarPalabra(String s, String palabra, String remplazar) {
		String[] str = s.split(" ");
		for (int i = 0; i < str.length; i++) {
			if (str[i].equals(palabra)) {
				str[i] = remplazar;
			}
		}
		return String.join(" ", str);
	}

	/**
	 * Metodo Cesar Cifrado de letras para cambiar sus posiciones codificadas
	 * 
	 * @param text
	 * @param str
	 * @return
	 */
	public static String caesarMethod(String s, int offset) {
		String str = s.toLowerCase();
		char[] charArr = str.toCharArray();
		for (int i = 0; i < charArr.length; i++) {

			if (charArr[i] != ' ') {
				int auxCode = charArr[i] - 'a';
				auxCode = (auxCode + offset) % 26;
				charArr[i] = (char) ('a' + auxCode);
			}

		}
		return String.valueOf(charArr);
	}

	/**
	 * Le da la vuelta a un String Ejemplo HOLA ALOH
	 * 
	 * @param s
	 * @return
	 */
	public static String reverseString(String s) {
		String res = "";
		char[] arr = s.toCharArray();
		for (int i = arr.length - 1; i >= 0; i--) {
			res += arr[i];
		}
		return res;
	}

	/**
	 * Cuenta cuantos Char repetidos hay dentro de un String
	 * 
	 * @param s
	 * @param c Caracter a buscar dentro del String
	 * @return
	 */
	public static int contarLetras(String s, char c) {
		int cont = 0;
		String s2 = s.toLowerCase();
		for (int i = 0; i < s2.length(); i++) {
			if (s2.charAt(i) == c) {
				cont++;
			}
		}
		return cont;
	}

	/**
	 * Compara dos String, uno principal que contiene una frase y otro que contiene
	 * una palabra y lo que hace es encontrar la palabra del 2º String en el primero
	 * 
	 * @param arrA
	 * @param arrB
	 * @return
	 */
	public static boolean buscarPalabra(char arrA[], char arrB[]) {
		int cantidad_letras;

		for (int i = 0; i < arrA.length; i++) {
			cantidad_letras = 0;
			if (arrA.length - i < arrB.length) {
				return false;
			}
			for (int j = 0; j < arrB.length; j++) {
				if (arrA[i + j] == arrB[j]) {
					cantidad_letras++;
				}
				if (cantidad_letras == arrB.length) {
					return true;
				}
			}
		}
		return false;
	}

	/**
	 * Compara si una palabra se escribe igual del derecho que del reves
	 * 
	 * @param s
	 * @return
	 */
	public static boolean esPalindromo(String s) {
		if (reverseString(s).equals(s)) {
			return true;
		} else {
			return false;
		}
	}

	/**
	 * Analiza la validez de un DNI contando que los primeros 8 valores deben de ser
	 * digitos del 0 al 9 y que el ultimo valor es una letra de la A a la Z
	 * 
	 * @param s
	 * @return
	 */
	public static boolean esNIF(String s) {
		/**
		 * 0 = 48 9 = 57 a = 97 z = 122
		 */
		if (s.length() != 9) {
			return false;
		}
		char[] NIF = s.toLowerCase().toCharArray();
		if (NIF[8] < 97 || NIF[8] > 122) {
			return false;
		}
		for (int i = 0; i < NIF.length - 1; i++) {
			if (NIF[i] < 48 || NIF[i] > 57) {
				return false;
			}
		}
		return true;
	}
	/**
	 * Transponer pero cadenas de caracteres
	 * @param arr
	 * @return
	 */
	public static char[][] Transponer(char arr[][]) {
		char Trans[][] = new char[arr[0].length][arr.length];
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {
				Trans[j][i] = arr[i][j];
			}

		}
		return Trans;
	}
	/**
	 * Genera una Matriz con letras aleatorias
	 * @param arr
	 * @param menor
	 * @param mayor
	 */
	public static void randomLetras(char[][] arr, int menor, int mayor){
		Random r = new Random();
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j<arr.length;j++) {
			arr[i][j] = (char) (r.nextInt(mayor - menor ) + menor);
			}
		}
	}
	/**
	 * deepToString pero bonito
	 * 
	 * @param arr
	 * @return
	 */
	public static String deepToString(char arr[][]) {
		String s = "";
		for (int i = 0; i < arr.length; i++) {
			s += Arrays.toString(arr[i]) + "\n";
		}
		return s;
	}

}
