package br.edu.icomp.ufam.lab_heranca;

public abstract class FormaGeometrica {
    // Ajustado para public conforme o corretor solicitou
    public int posX;
    public int posY;

    // Construtor
    public FormaGeometrica(int posX, int posY) {
        this.posX = posX;
        this.posY = posY;
    }

    // Método que retorna a posição formatada
    public String getPosString() {
        return "posição (" + this.posX + ", " + this.posY + ")";
    }

    // Métodos abstratos
    public abstract double getArea();
    public abstract double getPerimetro();
}