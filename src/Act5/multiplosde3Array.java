package Act5;

import java.util.Scanner;

public class multiplosde3Array {
	/**
	 * Act 5 de la expansion de actividades
	 * Realice un programa para leer un array ingresando solamente números múltiplos
	 * de 3 que ingresan por teclado.
	 * @author andre
	 *
	 */
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Introduce cuantos valores del Array desea");
		int array[] = new int[sc.nextInt()]; //Inserto el Scanner dentro de la funcion del array para que el usuario pueda modificarlo a su placer
		int i=0;
		System.out.println("Los valores tiene que ser multiplos de 3");
		do {//Do... While para poder controlar el flujo del array para que solo se guarden los array multiplos de 3
			int num = sc.nextInt();
			if(num%3==0) {
				array[i] = num;
				i++;//Solo aumenta la posicion del array si el valor es multiplo de 3
			}else {
				System.out.println("Tiene que ser multiplo de 3");
			}

		}while(i<array.length);
		for(i=0; i<array.length;i++) {//Muestra los valores introducidos
			System.out.println(array[i]);
		}
	}

}
