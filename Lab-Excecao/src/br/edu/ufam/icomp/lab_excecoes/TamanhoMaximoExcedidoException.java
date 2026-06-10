package br.edu.ufam.icomp.lab_excecoes;

public class TamanhoMaximoExcedidoException extends RoverCaminhoException {
    private static final long serialVersionUID = 1L;

    public TamanhoMaximoExcedidoException() {
        super("Quantidade máxima de coordenadas excedida");
    }

    public TamanhoMaximoExcedidoException(String message) {
        super(message);
    }
}