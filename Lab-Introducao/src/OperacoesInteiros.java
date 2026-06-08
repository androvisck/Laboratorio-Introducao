import java.util.Scanner;

public class OperacoesInteiros {
    public static void main(String[] args) {
        int contador = 0;
        double item, soma = 0, mediaColecao;

        Scanner scan = new Scanner(System.in);

        item = scan.nextDouble();

        while(item != -1) {
            soma += item;
            contador++;
            item = scan.nextDouble();
        }

        if (contador > 0) {
            mediaColecao = soma / contador;
            System.out.printf("%.2f\n", mediaColecao);
        } else {
        }

        scan.close();
    }
}