import java.util.Scanner;
import java.util.Locale;

/*
 Faça um programa (classe PontoReta) para indicar se um ponto  do plano cartesiano pertence à reta . Sua saída deverá ser de acordo com os exemplos abaixo.
Exemplos de entrada e saída esperada:
Entrada: 0.5 2.0
Saída: Ponto (0.5, 2.0) pertence a reta 2x + y = 3.
Entrada: 6.0 3.8
Saída: Ponto (6.0, 3.8) nao pertence a reta 2x + y = 3.
*/

public class PontoReta {
	public static void main (String[] args) {
		Scanner scanner = new Scanner(System.in).useLocale(Locale.US);
		double x;
		double y;
		
		while (true) {
			x = scanner.nextDouble();
			y = scanner.nextDouble();
			double resultado = (2 * x) + y;
			
			if (Math.abs(resultado) == 3.0) {
				System.out.printf(Locale.US, "Ponto (%.1f, %.1f) pertence a reta 2x + y = 3.\n", x, y);
				break;
			} else {
				System.out.printf(Locale.US, "Ponto (%.1f, %.1f) nao pertence a reta 2x + y = 3.\n", x, y);	
				break;
			}
		}
	}

}
