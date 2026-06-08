public class Carro {
    // Atributos (com acesso default para manter o padrão das questões anteriores)
    String marca;
    String modelo;
    Proprietario proprietario;
    Placa placa;
    Motor motor;

    // Construtor completo conforme o diagrama
    public Carro(String marca, String modelo, Proprietario proprietario, Placa placa, Motor motor) {
        this.marca = marca;
        this.modelo = modelo;
        this.proprietario = proprietario;
        this.placa = placa;
        this.motor = motor;
    }

    // Método que junta as descrições de todos os componentes do carro
    public String getDescricao() {
        return "Carro " + this.marca + "/" + this.modelo + ". " + 
               this.proprietario.getDescricao() + " " + 
               this.placa.getDescricao() + " " + 
               this.motor.getDescricao();
    }
}