package br.edu.ufam.icomp.lab_encapsulamento;

import java.util.Random;

public class Celular implements Localizavel {
    // Atributos privados
    private int codPais;
    private int codArea;
    private int numero;

    // Construtor
    public Celular(int codPais, int codArea, int numero) {
        setCodPais(codPais);
        setCodArea(codArea);
        setNumero(numero);
    }

    // Getters e Setters (com validações e marcados como final)
    public int getCodPais() {
        return codPais;
    }

    public final void setCodPais(int codPais) {
        if (codPais >= 1 && codPais <= 1999) {
            this.codPais = codPais;
        } else {
            this.codPais = -1;
        }
    }

    public int getCodArea() {
        return codArea;
    }

    public final void setCodArea(int codArea) {
        if (codArea >= 10 && codArea <= 99) {
            this.codArea = codArea;
        } else {
            this.codArea = -1;
        }
    }

    public int getNumero() {
        return numero;
    }

    public final void setNumero(int numero) {
        if (numero >= 10000000 && numero <= 999999999) {
            this.numero = numero;
        } else {
            this.numero = -1;
        }
    }

    // Métodos da Interface Localizavel
    
    @Override
    public Posicao getPosicao() {
        Random r = new Random();
        
        // Sorteia latitude entre -3.160000 e -2.960000
        double latitude = -3.160000 + (-2.960000 - (-3.160000)) * r.nextDouble();
        
        // Sorteia longitude entre -60.120000 e -59.820000
        double longitude = -60.120000 + (-59.820000 - (-60.120000)) * r.nextDouble();
        
        // Sorteia altitude entre 15.0 e 100.0
        double altitude = 15.0 + (100.0 - 15.0) * r.nextDouble();
        
        // Retorna um novo objeto Posicao instanciado com os valores gerados
        return new Posicao(latitude, longitude, altitude);
    }

    @Override
    public double getErroLocalizacao() {
        // GPS de celular: erro fixo de 50.0 metros
        return 50.0;
    }
}