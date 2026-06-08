public class Sala {
    // Atributos públicos para permitir acesso e modificação direta
    public int bloco;
    public int sala;
    public int capacidade;
    public boolean acessivel;

    // Construtor padrão (sem argumentos) que encadeia para o construtor completo
    public Sala() {
        this(0, 0, 0, false); // Valores padrão
    }

    // Construtor completo que inicializa todos os atributos
    public Sala(int bloco, int sala, int capacidade, boolean acessivel) {
        this.bloco = bloco;
        this.sala = sala;
        this.capacidade = capacidade;
        this.acessivel = acessivel;
    }

    // Método que retorna a descrição formatada da sala
    public String getDescricao() {
        String statusAcessivel = this.acessivel ? "acessível" : "não acessível";
        return "Bloco " + this.bloco + ", Sala " + this.sala + " (" + this.capacidade + " lugares, " + statusAcessivel + ")";
    }
}