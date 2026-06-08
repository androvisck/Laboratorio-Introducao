public class TurmaMain {
    public static void main(String[] args) {
        // 1. Criar o professor
        Professor prof = new Professor("Dr.", "Hubert J. Farnsworth", 2208);

        // 2. Criar a turma
        Turma turma = new Turma("Iniciação Tecnológica e Científica", 2016, 1, prof);

        // 3. Criar os alunos (usando anos de nascimento retroativos para bater com o exemplo)
        Aluno a1 = new Aluno("Emmett L. Brown", 7714, 2004); // Idade: 22 em 2026
        Aluno a2 = new Aluno("Egon Spengler", 5907, 2006);  // Idade: 20 em 2026
        Aluno a3 = new Aluno("Peter Weyland", 7734, 2007);  // Idade: 19 em 2026

        // 4. Adicionar alunos na turma
        turma.addAluno(a1);
        turma.addAluno(a2);
        turma.addAluno(a3);
        turma.addAluno(a1); // Tentativa duplicada (não deve adicionar)

        // 5. Exibir resultado
        System.out.println(turma.getDescricao());
        System.out.printf("Média de Idade da Turma: %.2f\n", turma.getMediaIdade());
    }
}