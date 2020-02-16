package iniciante;

import java.util.Scanner;

public class Problema1005 {

	public static void main(String[] ars) {

		double a, b, media;

		Scanner leia = new Scanner(System.in);

		a = leia.nextDouble();
		b = leia.nextDouble();

		media = ((a * 3.5) + (b * 7.5)) / 11;

		System.out.printf("MEDIA = %.5f\n", media);
		leia.close();
	}

}
