package Act8;

import java.util.Scanner;

/**
 * Act8 expansion arrays
 * Elabore un programa que permita introducir un arreglo de 25 elementos de tipo
 * entero. Luego pedir al usuario que introduzca un número. el programa mostrara
 * el número de veces que se repite dicho valor en el arreglo.
 * @author andre
 *
 */
public class numerovecesArrayRepetido {

	public static void main(String[] args) {
		int array[] = new int[25];
		int i,cont=0;
		Scanner sc = new Scanner(System.in);
		System.out.println("Introduzca 25 numeros");
		//For usado para poder introducir el array
		for(i = 0 ; i<array.length;i++) {
			array[i]=sc.nextInt();
			}
		System.out.println("Introduzca un numero introducido anteriormente y te dire cuantas veces se repite");
		int num = sc.nextInt();
		//For usado para comparar el numero introducido con el array
		for(i =0; i<array.length;i++) {
			if(num==array[i]) {
				cont++;
			}
		}
		System.out.println("El numero "+num+" se repite "+cont+" veces");
		}

	}

