package Act25;

import java.util.Scanner;

import Biblioteca.MyString;

/**
 * Act25 expansion array String
 * Realiza un programa que realice una sustituci�n de una palabra por otra
 * dentro de una cadena que tenga las palabras separadas por un car�cter blanco.
 * 
 * @author andre
 *
 */
public class sustitucionPalabras {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Escriba una frase");
		String s = sc.nextLine();
		System.out.println("Que palabra desea cambiar?");
		String palabra = sc.next();
		System.out.println("Que palabra desea poner en su lugar?");
		String remplazar = sc.next();
		System.out.println(MyString.cambiarPalabra(s, palabra, remplazar));

	}

}
