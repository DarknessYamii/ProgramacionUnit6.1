package Act28;

import java.util.Scanner;

import Biblioteca.MyString;

/**
 * Act28 expansion arrays y String Realizar un programa que lea una cadena de
 * caracteres e indique si la cadena es un palíndromo. Un palíndromo es una
 * cadena que se lee de igual forma de derecha a izquierda y de izquierda a
 * derecha.
 * 
 * @author andre
 *
 */
public class esPalidromo {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Introduzca una palabra");
		String s = sc.next();
		if (MyString.esPalindromo(s.toLowerCase())) {
			System.out.println("La palabra " + s + " es un palidromo");
		} else {
			System.out.println("La palabra " + s + " NO es un palidromo");
		}
	}

}
