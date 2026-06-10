package br.edu.ufam.icomp.lab_excecoes;

public class RoverCaminhoException extends RoverException {
    private static final long serialVersionUID = 1L;

    // 1. Default constructor (called when you do: throw new RoverCaminhoException())
    public RoverCaminhoException() {
        super("Exceção geral de caminho do rover");
    }

    // 2. String constructor (MISSING ONE - called by subclasses via super(message))
    public RoverCaminhoException(String message) {
        super(message);
    }
}