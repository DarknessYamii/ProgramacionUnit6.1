package Act14;

import java.awt.LinearGradientPaint;
import java.util.Scanner;

import Biblioteca.MyArrays;

/**
 * act14 de la expansion de Array 
 * Dado una secuencia de número leídos y
 * almacenados en un vector A y un número leído determinar si dicho número se
 * encuentra o no en el vector.
 * 
 * @author andre
 *
 */
public class estaonoenelArray {

	public static void main(String[] args) {

		Scanner sc= new Scanner(System.in);
		System.out.println("Introduzca cuan grande desea el Array");
		int A[] = MyArrays.addArray(sc);
		System.out.println("Introduzca numero a buscar en el array");
		int x = sc.nextInt();

		if(MyArrays.linearSearch(A,x)>=0){
			System.out.println("Existe");
		}else {
			System.out.println("No Existe");
		}
	}
}
