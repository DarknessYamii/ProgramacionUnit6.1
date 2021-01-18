package Act1;

import java.util.Scanner;
/**
 * Act 1 de la expansion de actividades
 * Dado un vector de 5 enteros actualizar cada posición de dicho vector con un
 * número leído.
 * @author andre
 *
 */
public class actualizarVector {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int array[] = new int[5];
		int num = 0;
		System.out.println("Para finalizar el programa introduzca 0");
		//El do..while lo uso para estar siempre reiniciando el for hasta que se introduzca un 0
		do {
			//El for lo uso para recorrer el array desde el 0 al 4(porque el array es 5-1) 
			for(int i = 0; i<array.length; i++) {
				num = sc.nextInt(); 
				//La posicion de este If es primordial para que no guarde el 0 para finalizar el programa 
				if(num == 0) {
					break;
				}
				array[i] = num;
			}
		}while(num != 0);
			System.out.println("La lista de numeros introduzidos es:");
			//Este for muestra por pantalla los ultimos 5 numeros introducidos 
			for(int i = 0; i<array.length; i++) {
			System.out.println(array[i]);	
			}
	}

}
