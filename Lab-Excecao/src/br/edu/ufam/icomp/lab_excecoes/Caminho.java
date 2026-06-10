package br.edu.ufam.icomp.lab_excecoes;

public class Caminho {
    private Coordenada[] caminho;
    private int tamanho;

    public Caminho(int maxTam) {
        this.caminho = new Coordenada[maxTam];
        this.tamanho = 0;
    }

    public int tamanho() {
        return this.tamanho;
    }

    public void addCoordenada(Coordenada coordenada) 
            throws TamanhoMaximoExcedidoException, DistanciaEntrePontosExcedidaException {
        
        // 1a Prioridade: Verificar se o vetor ja atingiu o limite maximo
        if (this.tamanho >= this.caminho.length) {
            throw new TamanhoMaximoExcedidoException();
        }

        // 2a Prioridade: Verificar a distancia do ultimo ponto adicionado (se houver algum)
        if (this.tamanho > 0) {
            Coordenada ultimoPonto = this.caminho[this.tamanho - 1];
            if (ultimoPonto.distancia(coordenada) > 15.0) {
                throw new DistanciaEntrePontosExcedidaException();
            }
        }

        // Se passou pelas validacoes, adiciona no vetor e incrementa o tamanho
        this.caminho[this.tamanho] = coordenada;
        this.tamanho++;
    }

    public void reset() {
        // Zera o tamanho e reinicializa o vetor limpando as referencias antigas
        this.tamanho = 0;
        this.caminho = new Coordenada[this.caminho.length];
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Dados do caminho:\n");
        sb.append("  - Quantidade de pontos: ").append(this.tamanho).append("\n");
        sb.append("  - Pontos:");
        
        for (int i = 0; i < this.tamanho; i++) {
            sb.append("\n    -> ").append(this.caminho[i].toString());
        }
        
        return sb.toString();
    }
}