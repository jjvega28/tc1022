/* Jose Javier Vega
// 24 de octubre (Cumpleaños de diego velazquez)
// Este programa confirma si el numero ingresado es de un primo circular */

import java.util.Scanner;

public class PrimoCircular {
	public static void main (String[] args) {
		Scanner scan = new Scanner(System.in);
		int number=0, digits=0, i=0, factor=0, sum=0;

		System.out.print("Hola, introduce el número para ver si es primo circular: ");
		number = scan.nextInt();
		digits = String.valueOf(number).length();
		sum+=isPrime(number);
		if(sum==digits) {
			System.out.println("El número "+number+" es primo circular");
		}//if end
		else {
			System.out.println("El número "+number+" NO es primo circular");
		}// else end

	} //main end
	public static int isPrime(int myNumber) {
		int i = 0;
		for(i=2; i<myNumber; i++) {
			if(myNumber%i==0) {
				return 0;
			} //if end
		} //for end
		return 1;
	} //method end
} //class end