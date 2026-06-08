import java.util.ArrayList;

public class Turma {
    // Atributos públicos conforme a especificação
    public String nome;
    public String professor;
    public int numAlunos;
    public boolean acessivel;
    public ArrayList<Integer> horarios;

    // Construtor padrão que encadeia para o construtor completo
    public Turma() {
        this("", "", 0, false);
    }

    // Construtor completo com encadeamento e inicialização da lista de horários
    public Turma(String nome, String professor, int numAlunos, boolean acessivel) {
        this.nome = nome;
        this.professor = professor;
        this.numAlunos = numAlunos;
        this.acessivel = acessivel;
        this.horarios = new ArrayList<Integer>();
    }

    // Adiciona um horário à lista da turma
    public void addHorario(int horario) {
        this.horarios.add(horario); // Ocorre autoboxing de int para Integer
    }

    // Retorna a representação textual dos horários cadastrados
    public String getHorariosString() {
        if (this.horarios == null || this.horarios.isEmpty()) {
            return "";
        }

        // Arrays auxiliares mapeando as linhas e colunas da tabela fornecida
        String[] dias = {"segunda", "terça", "quarta", "quinta", "sexta"};
        String[] horas = {"8hs", "10hs", "12hs", "14hs", "16hs", "18hs", "20hs"};

        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < this.horarios.size(); i++) {
            int h = this.horarios.get(i); // Ocorre unboxing de Integer para int
            
            // A tabela avança verticalmente em cada dia da semana (7 horários por dia)
            // Exemplo: h = 15 -> coluna (dia) = (15-1)/7 = 2 (quarta), linha (hora) = (15-1)%7 = 0 (8hs)
            int indiceDia = (h - 1) / 7;
            int indiceHora = (h - 1) % 7;

            // Validação simples caso o número esteja fora dos limites da tabela
            if (indiceDia >= 0 && indiceDia < dias.length && indiceHora >= 0 && indiceHora < horas.length) {
                sb.append(dias[indiceDia]).append(" ").append(horas[indiceHora]);
            }

            // Adiciona a vírgula e o espaço se não for o último elemento
            if (i < this.horarios.size() - 1) {
                sb.append(", ");
            }
        }

        return sb.toString();
    }

    // Retorna a descrição completa formatada da turma
    public String getDescricao() {
        String statusAcessivel = this.acessivel ? "sim" : "não";
        
        return "Turma: " + this.nome + "\n" +
               "Professor: " + this.professor + "\n" +
               "Número de Alunos: " + this.numAlunos + "\n" +
               "Horário: " + this.getHorariosString() + "\n" +
               "Acessível: " + statusAcessivel;
    }
}