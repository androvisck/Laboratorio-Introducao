package br.edu.ufam.icomp.lab_excecoes;

public class CoordenadaNegativaException extends RoverCoordenadaException {
    private static final long serialVersionUID = 1L;

    // Construtor padrão
    public CoordenadaNegativaException() {
        super("Coordenada com valor negativo");
    }

    // Construtor com String (O que estava faltando)
    public CoordenadaNegativaException(String message) {
        super(message);
    }
}