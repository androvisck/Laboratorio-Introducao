import java.util.ArrayList;

public class Turma {
    // Atributos
    String disciplina;
    int ano;
    int semestre;
    Professor professor;
    ArrayList<Aluno> alunos;

    // Construtor parametrizado (inicializa a lista de alunos vazia)
    public Turma(String disciplina, int ano, int semestre, Professor professor) {
        this.disciplina = disciplina;
        this.ano = ano;
        this.semestre = semestre;
        this.professor = professor;
        this.alunos = new ArrayList<>(); 
    }

    // Adiciona um aluno se a matrícula dele já não estiver cadastrada
    public void addAluno(Aluno aluno) {
        if (getAluno(aluno.matricula) == null) {
            alunos.add(aluno);
        }
    }

    // Busca um aluno pela matrícula. Retorna null se não encontrar
    public Aluno getAluno(int matricula) {
        for (Aluno a : alunos) {
            if (a.matricula == matricula) {
                return a;
            }
        }
        return null;
    }

    // Calcula a média de idade dos alunos da turma
    public double getMediaIdade() {
        if (alunos.isEmpty()) {
            return 0.0;
        }
        
        double somaIdades = 0;
        for (Aluno a : alunos) {
            somaIdades += a.getIdade();
        }
        return somaIdades / alunos.size();
    }

    // Retorna a descrição detalhada da turma, professor e alunos listados
    public String getDescricao() {
        String descricao = "Turma " + this.disciplina + " - " + this.ano + "/" + this.semestre;
        
        if (this.professor != null) {
            descricao += " (" + this.professor.getDescricao() + "):\n";
        } else {
            descricao += " (Sem professor):\n";
        }

        for (int i = 0; i < alunos.size(); i++) {
            descricao += "  - Aluno " + (i + 1) + ": " + alunos.get(i).getDescricao();
            // Adiciona quebra de linha em todos os alunos, exceto no último
            if (i < alunos.size() - 1) {
                descricao += "\n";
            }
        }
        
        return descricao;
    }
}