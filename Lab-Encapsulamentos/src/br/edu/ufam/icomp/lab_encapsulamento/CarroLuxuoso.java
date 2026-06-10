package br.edu.ufam.icomp.lab_encapsulamento;

import java.util.Random;

public class CarroLuxuoso extends Carro implements Localizavel {

    // Construtor que repassa a placa para o construtor da classe pai (Carro)
    public CarroLuxuoso(String placa) {
        super(placa);
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
        // GPS do carro luxuoso: mais preciso que o celular, erro de 15.0 metros
        return 15.0;
    }
}