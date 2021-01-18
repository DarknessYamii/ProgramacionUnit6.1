package Act6;

import java.util.Scanner;
/**
 * Act 6 de la expansion de actividades
 * Leer un array de 10 elementos y efectuar una búsqueda de un elemento,
 * mostrando la posición en la que se encuentra dicho elemento.
 * @author andre
 *
 */
public class busqueda_posicionArray {

	public static void main(String[] args) {
		int array[] = {20,80,75,7,99,420,500,69,77,777};
		Scanner sc = new Scanner(System.in);
		System.out.println("Introduzca el valor a buscar(20,80,75,7,99,420,500,69,77,777)");
		int buscado = sc.nextInt();
		for(int i = 0 ; i<array.length;i++) {//Un for para recorrer la lista predefinida 
			if(array[i] == buscado) {//Compara el numero de la lista predefinida con el numero introducido 
				System.out.println("El valor se encuentra en la posicion "+(i+1));
				break;
			}
		}
	}

}
