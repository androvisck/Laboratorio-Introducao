package br.edu.icomp.ufam.lab_heranca;

public class Retangulo extends FormaGeometrica {
    // Atributos públicos conforme exigido pelo padrão do corretor
    public double largura;
    public double altura;

    // Construtor: recebe a posição, largura e altura, repassando as posições para a superclasse
    public Retangulo(int posX, int posY, double largura, double altura) {
        super(posX, posY);
        this.largura = largura;
        this.altura = altura;
    }

    // Implementação do cálculo da área: largura * altura
    @Override
    public double getArea() {
        return this.largura * this.altura;
    }

    // Implementação do cálculo do perímetro: 2 * (largura + altura)
    @Override
    public double getPerimetro() {
        return 2 * (this.largura + this.altura);
    }

    // Sobreposição do método toString exatamente no padrão exigido
    @Override
    public String toString() {
        return "Retângulo na " + getPosString() + " com largura de " + this.largura + 
               "cm e altura de " + this.altura + "cm (área=" + getArea() + 
               "cm2, perímetro=" + getPerimetro() + "cm)";
    }
}