package br.edu.ufam.icomp.lab_encapsulamento;

public class Posicao {
    // Atributos privados (Encapsulamento)
    private double latitude;
    private double longitude;
    private double altitude;

    // Construtor
    public Posicao(double latitude, double longitude, double altitude) {
        this.latitude = latitude;
        this.longitude = longitude;
        this.altitude = altitude;
    }

    // Métodos Getters e Setters
    public double getLatitude() {
        return latitude;
    }

    public void setLatitude(double latitude) {
        this.latitude = latitude;
    }

    public double getLongitude() {
        return longitude;
    }

    public void setLongitude(double longitude) {
        this.longitude = longitude;
    }

    public double getAltitude() {
        return altitude;
    }

    public void setAltitude(double altitude) {
        this.altitude = altitude;
    }

    // Sobreposição do método toString conforme a especificação
    @Override
    public String toString() {
        return "Posição: " + latitude + ", " + longitude + ", " + altitude;
    }
}