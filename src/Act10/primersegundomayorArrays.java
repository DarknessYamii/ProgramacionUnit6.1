package Act10;

import java.util.Scanner;

/**
 * Elabore un programa que permita encontrar el primer y segundo mayor de un
 * array de 15 elementos.
 * @author andre
 *
 */
public class primersegundomayorArrays {

	public static void main(String[] args) {
		int array[] = new int[15];
		Scanner sc = new Scanner(System.in);
		int mayor1=-999999, mayor2=-999999,i;
		System.out.println("Introduzca 15 numeros");
		for(i = 0 ; i < array.length; i++) {
			array[i] = sc.nextInt();
			if (array[i]>mayor1){
				mayor2=mayor1;
				mayor1=array[i];
			}
			else if (array[i]>mayor2) {
					mayor2=array[i];
				}
		}
		System.out.println("Los dos numeros mayores son "+mayor1+" y el segundo mayor "+mayor2);
		

	}

}
