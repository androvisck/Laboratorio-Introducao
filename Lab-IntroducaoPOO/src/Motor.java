public class Motor {
    // Atributos (com acesso default para permitir alteração direta)
    int tipo;
    double capacidade;
    int potencia;

    // Construtor padrão (sem parâmetros) encadeado
    public Motor() {
        this(0, 0.0, 0);
    }

    // Construtor completo
    public Motor(int tipo, double capacidade, int potencia) {
        this.tipo = tipo;
        this.capacidade = capacidade;
        this.potencia = potencia;
    }

    // Método que mapeia o tipo numérico para texto usando switch
    public String getTipoString() {
        switch (this.tipo) {
            case 1:
                return "Gasolina";
            case 2:
                return "Alcool";
            case 3:
                return "Flex";
            case 4:
                return "Diesel";
            case 5:
                return "Eletrico";
            default:
                return "Outros";
        }
    }

    // Método que retorna a descrição formatada do motor
    public String getDescricao() {
        return "Motor: tipo=" + this.getTipoString() + ", capacidade=" + this.capacidade + "L, potencia=" + this.potencia + "CV.";
    }
}