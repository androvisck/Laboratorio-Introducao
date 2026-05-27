import java.util.Scanner;

/*Crie uma classe em Java chamada ParImpar que fique lendo números inteiros do teclado até que o número -1 seja digitado. Para cada número, imprimir se ele é "PAR" ou "IMPAR".
Exemplo de entrada e saída esperada:
Entrada: 6 67 32 7 -1
Saída: PAR
IMPAR
PAR
IMPAR
*/

public class ParImpar {
    public static void main(String[] args) {
    	Scanner scanner = new Scanner(System.in);
    	int numero;

        // O laço continuará executando indefinidamente até encontrar o 'break'
        while (true) {
            numero = scanner.nextInt();

            // Condição de parada: se o número for -1, encerra o programa
            if (numero == -1) {
                break;
            }

            // Verifica se o número é par ou ímpar usando o operador de resto (%)
            if (numero % 2 == 0) {
                System.out.println("PAR");
            } else {
                System.out.println("IMPAR");
            }
        }

        // Fecha o scanner para liberar os recursos
        scanner.close();
    }
}