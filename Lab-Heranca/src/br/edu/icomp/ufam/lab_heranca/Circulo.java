package br.edu.icomp.ufam.lab_heranca;

public class Circulo extends FormaGeometrica {
    // Atributo público conforme exigido pelo padrão do corretor
    public double raio;

    // Construtor: recebe as posições e o raio, repassando as posições para a superclasse
    public Circulo(int posX, int posY, double raio) {
        super(posX, posY);
        this.raio = raio;
    }

    // Implementação do cálculo da área: pi * r²
    @Override
    public double getArea() {
        return Math.PI * this.raio * this.raio;
    }

    // Implementação do cálculo do perímetro: 2 * pi * r
    @Override
    public double getPerimetro() {
        return 2 * Math.PI * this.raio;
    }

    // Sobreposição do método toString exatamente no padrão exigido
    @Override
    public String toString() {
        return "Círculo na " + getPosString() + " com raio de " + this.raio + 
               "cm (área=" + getArea() + "cm2, perímetro=" + getPerimetro() + "cm)";
    }
}