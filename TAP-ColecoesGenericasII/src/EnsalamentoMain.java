public class EnsalamentoMain {
    public static void main(String[] args) {
        // 1. Cria o gerenciador de ensalamento
        Ensalamento sistema = new Ensalamento();

        // 2. Cria uma Sala e adiciona ao sistema
        Sala sala1 = new Sala(6, 101, 50, true);
        sistema.addSala(sala1);

        // 3. Cria uma Turma, adiciona horários e adiciona ao sistema
        Turma turma1 = new Turma("Algoritmos", "Edleno Silva", 45, true);
        turma1.addHorario(1);  // segunda 8hs
        turma1.addHorario(15); // quarta 8hs
        sistema.addTurma(turma1);

        // 4. Executa o processo automático de alocação de turmas nas salas
        sistema.alocarTodas();

        // 5. Exibe os relatórios gerados pelo sistema para validar o resultado
        System.out.println("=== RESUMO DO ENSALAMENTO ===");
        System.out.println(sistema.relatorioResumoEnsalamento());

        System.out.println("=== TURMAS POR SALA ===");
        System.out.println(sistema.relatorioTurmasPorSala());

        System.out.println("=== SALAS POR TURMA ===");
        System.out.println(sistema.relatorioSalasPorTurma());
    }
}