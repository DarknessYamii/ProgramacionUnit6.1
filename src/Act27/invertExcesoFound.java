package Act27;

import java.util.Scanner;

import Biblioteca.MyString;

/**
 * Act27 expansion de arrays y String Dado un String en la que solo incluimos
 * caracteres alfabéticos, realizar las siguientes operaciones sobre ella:
 * 
 * @author andre
 *
 */
public class invertExcesoFound {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		// a. Mostrar la cadena con los caracteres invertidos.
		System.out.println("Apartado A:");
		System.out.println("Introduzca una frase");
		String s = sc.nextLine();
		System.out.println(MyString.reverseString(s));

//		b. Mostrar por consola el número de veces que aparecen las letras a, o y e
//		en la String introducida. Además, si el número de veces que se repite la
//		a es superior a 10 debe aparecer el mensaje "Exceso de a", si el número
//		de veces que se repite la o es superior a 5 debe mostrarse "Exceso de
//		o" y si se repite más de 3 veces la letra e debe mostrarse "Exceso de e".

		if (MyString.contarLetras(s, 'a') < 10) {
			System.out.println("Hay " + MyString.contarLetras(s, 'a') + " A");
		} else {
			System.out.println("Exceso de A");
		}
		if (MyString.contarLetras(s, 'o') < 5) {
			System.out.println("Hay " + MyString.contarLetras(s, 'o') + " O");
		} else {
			System.out.println("Exceso de O");
		}
		if (MyString.contarLetras(s, 'e') < 3) {
			System.out.println("Hay " + MyString.contarLetras(s, 'e') + " E");
		} else {
			System.out.println("Exceso de E");
		}

		// c. Realizar la búsqueda de una palabra que introducimos por teclado dentro
		// del String original.

		System.out.println("Que palabra quieres buscar?");
		String buscar = sc.nextLine();
		if (MyString.buscarPalabra(s.toCharArray(), buscar.toCharArray())) {
			System.out.println("La palabra " + buscar + " se encuentra en la frase");
		} else {
			System.out.println("La palabra " + buscar + " NO se encuentra en la frase");
		}
	}

}
