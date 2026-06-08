package br.edu.icomp.ufam.lab_heranca;

public class Quadrado extends Retangulo {

    // Construtor: repassa o 'lado' para os campos de largura e altura do Retangulo
    public Quadrado(int posX, int posY, double lado) {
        super(posX, posY, lado, lado);
    }

    // Sobreposição do método toString exatamente no padrão exigido
    @Override
    public String toString() {
        // Como largura e altura são iguais, podemos usar qualquer um deles para representar o lado
        return "Quadrado na " + getPosString() + " com lado de " + this.largura + 
               "cm (área=" + getArea() + "cm2, perímetro=" + getPerimetro() + "cm)";
    }
}