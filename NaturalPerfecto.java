/* Jose Javier Vega
// 24 de octubre (Cumpleaños de diego velazquez)
// Este programa confirma si el numero ingresado es de un natural perfecto */

import java.util.Scanner;

public class NaturalPerfecto {
	public static void main (String[] args) {
		Scanner scan = new Scanner(System.in);
		int number=0, i=0, factor=0, sum=0;

		System.out.print("Hola, introduce el número para ver si es perfecto: ");
		number = scan.nextInt();

		for(i=1; i<number; i++) { //El loop encuentra los factores
			if(number%i==0) {
				sum+=i; //Si i es factor del número, se agrega a la suma
			} //if end
		} //for end
		if(sum==number) { //Si la suma es igual al núnero, el número es natural perfecto.
			System.out.println("El número " + number + " SI es un número natural perfecto.");
		} //if end
		else {
			System.out.println("El número " + number + " NO es un número natural perfecto.");
		} //else end
	} //main end
} //class end