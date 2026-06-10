package br.edu.ufam.icomp.lab_encapsulamento;

public class GISMain {
    public static void main(String[] args) {
        // Criando o vetor que armazena objetos que implementam Localizavel
        Localizavel[] vetorLocalizaveis = new Localizavel[4];

        // Instanciando e inserindo Celulares (codPais, codArea, numero)
        vetorLocalizaveis[0] = new Celular(55, 92, 991112222);
        vetorLocalizaveis[1] = new Celular(55, 11, 988887777);

        // Instanciando e inserindo Carros Luxuosos (placa)
        vetorLocalizaveis[2] = new CarroLuxuoso("PHO-0G26");
        vetorLocalizaveis[3] = new CarroLuxuoso("JXG-1234");

        // Percorrendo o vetor e imprimindo a posição de cada um
        for (int i = 0; i < vetorLocalizaveis.length; i++) {
            // O getPosicao() retorna um objeto Posicao, 
            // que é convertido para String pelo toString() automaticamente.
            System.out.println(vetorLocalizaveis[i].getPosicao());
        }
    }
}