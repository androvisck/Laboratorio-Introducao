import java.util.Scanner;

/*As cédulas do real começaram a entrar em circulação no Brasil em 1994. Diferentemente das moedas que haviam circulado anteriormente, o real não traz na sua nota personalidades da história nacional, mas sim animais da fauna brasileira, conforme mostra a tabela abaixo.
Animal	Valor da Cédula
Tartaruga	R$ 2
Garça	R$ 5
Arara	R$ 10
Mico-leão-dourado	R$ 20
Onça-pintada	R$ 50
Garoupa	R$ 100
Escreva um programa (classe AnimaisCedulas) que leia o valor de uma cédula e apresente na tela o nome do animal representado no verso da nota. Se não existir uma cédula no valor inserido, o programa deverá imprimir "erro".
Dica:
A saída é com acentos e com a primeira letra em maiúsculo.
*/

public class AnimaisCedulas {
	public static void main (String[] args){
		Scanner scanner = new Scanner(System.in);
		int cedula;
		
		while (true) {
			cedula = scanner.nextInt();
			
			if (cedula == 2){
				System.out.println("Tartaruga");
				break;
			} else if (cedula == 5) {
				System.out.println("Garça");
				break;
			} else if (cedula == 10) {
				System.out.println("Arara");
				break;
			} else if (cedula == 20) {
				System.out.println("Mico-leão-dourado");
				break;
			} else if (cedula == 50) {
				System.out.println("Onça-pintada");
				break;
			} else if (cedula == 100) {
				System.out.println("Garoupa");
				break;
			} else {
				System.out.println("erro");
				break;
			}
		}
	}	
}
