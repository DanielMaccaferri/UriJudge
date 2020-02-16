package iniciante;

import java.util.Scanner;

public class MaiorQue {

	public static void main(String[] args) {

		// Fazer um programa que identifique o maior numero entre tres citados

		int x, y, z;
		Scanner leia = new Scanner(System.in);

		x = leia.nextInt();
		y = leia.nextInt();
		z = leia.nextInt();

		if (x > y && x > z) {

			System.out.println("O maior é: " + x);
			
		}else if (y > z){

			System.out.println("O maior é " + y);
		}
		else
			System.out.println("O maior é "+z);

		}
	
	}
	
	
