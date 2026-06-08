public class TurmaEmSala {
    // Atributos públicos para representação direta da associação
    public Turma turma;
    public Sala sala;

    // Construtor padrão que encadeia para o construtor completo
    public TurmaEmSala() {
        this(null, null);
    }

    // Construtor completo que associa uma Turma a uma Sala
    public TurmaEmSala(Turma turma, Sala sala) {
        this.turma = turma;
        this.sala = sala;
    }
}