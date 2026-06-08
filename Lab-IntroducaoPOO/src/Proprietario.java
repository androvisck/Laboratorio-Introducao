public class Proprietario {
    // Atributos (com acesso default para permitir alteração direta)
    String nome;
    int cnh;
    int anoNascimento;

    // Construtor padrão (sem parâmetros) encadeado com o construtor completo
    public Proprietario() {
        this("", 0, 0); 
    }

    // Construtor completo
    public Proprietario(String nome, int cnh, int anoNascimento) {
        this.nome = nome;
        this.cnh = cnh;
        this.anoNascimento = anoNascimento;
    }

    // Método para calcular a idade com base em um ano de referência
    public int getIdade(int anoReferencia) {
        return anoReferencia - this.anoNascimento;
    }

    // Método que retorna a descrição formatada do proprietário
    public String getDescricao() {
        return "Proprietario: nome=" + this.nome + ", cnh=" + this.cnh + ", anoNascimento=" + this.anoNascimento + ".";
    }
}