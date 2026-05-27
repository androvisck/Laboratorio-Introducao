import java.util.Scanner;
import java.util.Locale;


/*
Considere o cenário do jogo Angry Birds (figura abaixo), onde um pássaro é lançado com uma velocidade inicial  a partir do estilingue, cujo elástico faz um ângulo  com o solo.

Figura: exemplo de trajetória. Fonte: polibentinhofisica.blogspot.com
Considere ainda que o pássaro e o porco-alvo estão na mesma altura em relação ao solo. O alcance máximo () do pássaro horizontalmente é dado pela seguinte equação:

onde  é o valor em módulo da velocidade inicial (sem considerar os componentes vertical ou horizontal) e  é a aceleração da gravidade.
Escreva um programa (classe AngryBirds) que leia a velocidade inicial , o ângulo  (em graus), e a distância horizontal  entre o pássaro e o porco, e informe se o pássaro atingirá (saída 1) ou não o porco (saída 0). Admita uma tolerância de . Ou seja, se  e , então podemos considerar que o pássaro acerta o porco.
Exemplos de entrada e saída esperada:
Entrada: 30 45 91.83
Saída: 1
Entrada: 30 45 100
Saída: 0
Dicas:
Funções trigonométricas do Java operam em radianos. Como resultado, você vai precisar converter a entrada do usuário de graus para radianos antes de calcular a distância. Para isso, use o método toRadians(double angdeg) da classe Math. Exemplo: double radians = Math.toRadians(45);
Use os métodos trigonométricos da classe Math para calcular o seno – Math.sin(double a), cosseno – Math.cos(double a) e arco cosseno – Math.acos(double a).
 */


public class AngryBirds {
    public static void main(String[] args) {
        // Define o local como US para aceitar ponto (.) como separador decimal
        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);
        
        if (scanner.hasNextDouble()) {
            double v = scanner.nextDouble();
            double anguloGraus = scanner.nextDouble();
            double distanciaPorco = scanner.nextDouble();
            
            // Constante da gravidade baseada no exemplo fornecido
            double g = 9.8; 
            
            // 1. Converter o ângulo de graus para radianos
            double anguloRadianos = Math.toRadians(anguloGraus);
            
            // 2. Calcular o alcance usando a fórmula: (v^2 * sin(2 * theta)) / g
            double alcance = (Math.pow(v, 2) * Math.sin(2 * anguloRadianos)) / g;
            
            // 3. Verificar se o pássaro acerta o porco dentro da tolerância de 0.1
            if (Math.abs(alcance - distanciaPorco) <= 0.1) {
                System.out.println(1); // Acertou
            } else {
                System.out.println(0); // Errou
            }
        }
        
        scanner.close();
    }
}