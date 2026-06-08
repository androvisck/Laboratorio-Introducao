public class CarroMain {
    public static void main(String[] args) {
        // 1. Criando as partes do carro (dados do exemplo do DeLorean)
        Proprietario docBrown = new Proprietario("Emmett L. Brown", 98008173, 1920);
        Placa placaDeLorean = new Placa("OAT-3966", 6); // 6 = Colecionador
        Motor motorDeLorean = new Motor(1, 2.85, 130); // 1 = Gasolina

        // 2. Criando o carro e associando os objetos
        Carro delorean = new Carro("DeLorean", "DMC-12", docBrown, placaDeLorean, motorDeLorean);

        // 3. Imprimindo o resultado final esperado
        System.out.println(delorean.getDescricao());
    }
}