import java.util.Calendar;

public class Aluno {
    // Atributos (acessíveis diretamente)
    String nome;
    int matricula;
    int anoNascimento;

    // Construtor padrão encadeado
    public Aluno() {
        this("Sem nome", 0, Calendar.getInstance().get(Calendar.YEAR));
    }

    // Construtor parametrizado
    public Aluno(String nome, int matricula, int anoNascimento) {
        this.nome = nome;
        this.matricula = matricula;
        this.anoNascimento = anoNascimento;
    }

    // Método para calcular a idade com base no ano atual
    public int getIdade() {
        int anoAtual = Calendar.getInstance().get(Calendar.YEAR);
        return anoAtual - this.anoNascimento;
    }

    // Método para retornar a descrição formatada do aluno
    public String getDescricao() {
        return this.nome + " (mat=" + this.matricula + ", idade=" + this.getIdade() + ")";
    }
}