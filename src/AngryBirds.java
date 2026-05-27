import java.util.Scanner;
import java.util.Locale;


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