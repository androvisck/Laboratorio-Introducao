public class Placa {
    // Atributos (com acesso default para permitir alteração direta)
    String placa;
    int tipo;

    // Construtor padrão (sem parâmetros) encadeado
    public Placa() {
        this("", 0);
    }

    // Construtor completo
    public Placa(String placa, int tipo) {
        this.placa = placa;
        this.tipo = tipo;
    }

    // Método que mapeia o tipo numérico para texto usando switch
    public String getTipoString() {
        switch (this.tipo) {
            case 1:
                return "Normal";
            case 2:
                return "Servico";
            case 3:
                return "Oficial";
            case 4:
                return "Auto Escola";
            case 5:
                return "Prototipo";
            case 6:
                return "Colecionador";
            default:
                return "Outros";
        }
    }

    // Método que verifica se o estacionamento é livre (tipos 2 ou 3)
    public boolean temEstacionamentoLivre() {
        return this.tipo == 2 || this.tipo == 3;
    }

    // Método que retorna a descrição formatada da placa
    public String getDescricao() {
        return "Placa: placa=" + this.placa + ", tipo=" + this.getTipoString() + ", estacionamentoLivre=" + this.temEstacionamentoLivre() + ".";
    }
}