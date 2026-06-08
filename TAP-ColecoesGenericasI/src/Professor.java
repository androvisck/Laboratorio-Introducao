public class Professor {
    // Atributos (acessíveis diretamente)
    String titulacao;
    String nome;
    int matricula;

    // Construtor padrão encadeado
    public Professor() {
        this("Sem titulação", "Sem nome", 0);
    }

    // Construtor parametrizado
    public Professor(String titulacao, String nome, int matricula) {
        this.titulacao = titulacao;
        this.nome = nome;
        this.matricula = matricula;
    }

    // Método para retornar a descrição formatada do professor
    public String getDescricao() {
        return "Prof. " + this.titulacao + " " + this.nome + " - mat " + this.matricula;
    }
}