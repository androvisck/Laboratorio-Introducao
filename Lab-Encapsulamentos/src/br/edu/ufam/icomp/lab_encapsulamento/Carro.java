package br.edu.ufam.icomp.lab_encapsulamento;

public class Carro {
    // Atributo protegido (acessível por subclasses e classes do mesmo pacote)
    protected String placa;

    // Construtor
    public Carro(String placa) {
        this.placa = placa;
    }

    // Getter e Setter
    public String getPlaca() {
        return placa;
    }

    public void setPlaca(String placa) {
        this.placa = placa;
    }
}