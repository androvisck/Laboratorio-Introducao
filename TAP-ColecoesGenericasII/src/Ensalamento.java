import java.util.ArrayList;

public class Ensalamento {
    // Atributos públicos conforme especificado
    public ArrayList<Sala> salas;
    public ArrayList<Turma> turmas;
    public ArrayList<TurmaEmSala> ensalamento;

    // Construtor padrão inicializando as listas vazias
    public Ensalamento() {
        this.salas = new ArrayList<Sala>();
        this.turmas = new ArrayList<Turma>();
        this.ensalamento = new ArrayList<TurmaEmSala>();
    }

    // Adiciona uma sala ao sistema
    public void addSala(Sala sala) {
        this.salas.add(sala);
    }

    // Adiciona uma turma ao sistema
    public void addTurma(Turma turma) {
        this.turmas.add(turma);
    }

    // Retorna a sala onde a turma foi alocada, ou null caso não esteja alocada
    public Sala getSala(Turma turma) {
        for (TurmaEmSala ts : this.ensalamento) {
            if (ts.turma.equals(turma)) {
                return ts.sala;
            }
        }
        return null;
    }

    // Verifica se a sala está disponível em um determinado horário
    public boolean salaDisponivel(Sala sala, int horario) {
        for (TurmaEmSala ts : this.ensalamento) {
            // Se a sala sendo avaliada já possui uma turma alocada
            if (ts.sala.equals(sala)) {
                // Varre os horários da turma que já ocupa a sala
                for (int h : ts.turma.horarios) {
                    if (h == horario) {
                        return false; // Conflito de horário encontrado
                    }
                }
            }
        }
        return true; // Sala livre neste horário
    }

    // Verifica se a sala está disponível para uma lista completa de horários
    public boolean salaDisponivel(Sala sala, ArrayList<Integer> horarios) {
        for (int h : horarios) {
            if (!salaDisponivel(sala, h)) {
                return false; // Ocupada em pelo menos um dos horários
            }
        }
        return true; // Livre em todos os horários
    }

    // Tenta alocar uma turma específica em uma sala específica
    public boolean alocar(Turma turma, Sala sala) {
        // Requisito 1: Turma acessível exige sala acessível
        if (turma.acessivel && !sala.acessivel) {
            return false;
        }
        // Requisito 2: Capacidade da sala deve comportar os alunos
        if (turma.numAlunos > sala.capacidade) {
            return false;
        }
        // Requisito 3: Sala deve estar disponível em todos os horários da turma
        if (!salaDisponivel(sala, turma.horarios)) {
            return false;
        }

        // Se passou em todos os testes, realiza a alocação
        TurmaEmSala novaAlocacao = new TurmaEmSala(turma, sala);
        this.ensalamento.add(novaAlocacao);
        return true;
    }

    // Varre todas as turmas e tenta alocá-las sequencialmente nas salas disponíveis
    public void alocarTodas() {
        for (Turma turma : this.turmas) {
            for (Sala sala : this.salas) {
                if (alocar(turma, sala)) {
                    break; // Passa para a próxima turma se conseguiu alocar esta
                }
            }
        }
    }

    // Retorna a quantidade total de turmas alocadas
    public int getTotalTurmasAlocadas() {
        int contador = 0;
        for (TurmaEmSala ts : this.ensalamento) {
            if (ts.sala != null) {
                contador++;
            }
        }
        return contador;
    }

    // Retorna o somatório dos espaços ociosos das salas ocupadas
    public int getTotalEspacoLivre() {
        int totalEspacoLivre = 0;
        for (TurmaEmSala ts : this.ensalamento) {
            if (ts.sala != null) {
                totalEspacoLivre += (ts.sala.capacidade - ts.turma.numAlunos);
            }
        }
        return totalEspacoLivre;
    }

    // Cria o cabeçalho padrão compartilhado por todos os relatórios
    private String getCabecalhoRelatorio() {
        return "Total de Salas: " + this.salas.size() + "\n" +
               "Total de Turmas: " + this.turmas.size() + "\n" +
               "Turmas Alocadas: " + this.getTotalTurmasAlocadas() + "\n" +
               "Espaços Livres: " + this.getTotalEspacoLivre() + "\n";
    }

    // Relatório 1: Resumo simples do estado do Ensalamento
    public String relatorioResumoEnsalamento() {
        return getCabecalhoRelatorio();
    }

    // Relatório 2: Lista as salas do sistema e quais turmas estão nelas
    public String relatorioTurmasPorSala() {
        StringBuilder sb = new StringBuilder(getCabecalhoRelatorio());

        for (Sala sala : this.salas) {
            sb.append("\n--- ").append(sala.getDescricao()).append(" ---\n");
            
            // Busca se existem turmas alocadas para esta sala
            for (TurmaEmSala ts : this.ensalamento) {
                if (ts.sala.equals(sala)) {
                    sb.append("\n").append(ts.turma.getDescricao()).append("\n");
                }
            }
        }
        return sb.toString();
    }

    // Relatório 3: Lista todas as turmas do sistema e qual sala receberam
    public String relatorioSalasPorTurma() {
        StringBuilder sb = new StringBuilder(getCabecalhoRelatorio());

        for (Turma turma : this.turmas) {
            sb.append("\n").append(turma.getDescricao()).append("\n");
            
            Sala salaAlocada = getSala(turma);
            if (salaAlocada != null) {
                sb.append("Sala: ").append(salaAlocada.getDescricao()).append("\n");
            } else {
                sb.append("Sala: SEM SALA\n");
            }
        }
        return sb.toString();
    }
}