package br.edu.icomp.ufam.lab_heranca;

public class FormasMain {
    public static void main(String[] args) {
        // Criando um vetor de FormaGeometrica com 3 posições
        FormaGeometrica[] formas = new FormaGeometrica[3];

        // Populando o vetor com diferentes subclasses (Polimorfismo)
        formas[0] = new Circulo(32, 87, 6.0);
        formas[1] = new Retangulo(12, 65, 2.0, 7.0);
        formas[2] = new Quadrado(45, 39, 6.0);

        // Iterando sobre o vetor e imprimindo cada objeto
        for (int i = 0; i < formas.length; i++) {
            System.out.println(formas[i]);
        }
    }
}