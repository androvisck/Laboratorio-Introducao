package br.edu.ufam.icomp.lab_excecoes;

public class CoordenadaForaDosLimitesException extends RoverCoordenadaException {
    private static final long serialVersionUID = 1L;

    // Construtor padrão (sem parâmetros)
    public CoordenadaForaDosLimitesException() {
        super("Coordenada com valores fora dos limites");
    }

    // ADICIONE ESTE CONSTRUTOR: Permite receber uma string personalizada
    public CoordenadaForaDosLimitesException(String message) {
        super(message);
    }
}