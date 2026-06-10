package br.edu.ufam.icomp.lab_encapsulamento;

public interface Localizavel {
    
    // Retorna um objeto do tipo Posicao
    Posicao getPosicao();
    
    // Retorna o erro estimado da localização em metros
    double getErroLocalizacao();
    
}