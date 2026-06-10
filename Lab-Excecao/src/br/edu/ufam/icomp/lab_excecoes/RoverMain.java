package br.edu.ufam.icomp.lab_excecoes;

public class RoverMain {
    public static void main(String[] args) {
        // Cria um caminho com capacidade para ate 5 coordenadas
        Caminho caminho = new Caminho(5);

        try {
            // Simulando a criacao de coordenadas validas
            // Nota: O terceiro parametro e o digito verificador (posX + posY) % 10
            Coordenada c1 = new Coordenada(10, 20, 0); // (10+20)%10 = 0 (Valido)
            Coordenada c2 = new Coordenada(15, 25, 0); // (15+25)%10 = 0 (Valido, dist de c1 ~ 7.07m)
            Coordenada c3 = new Coordenada(22, 28, 0); // (22+28)%10 = 0 (Valido, dist de c2 ~ 7.61m)
            
            // Adicionando as coordenadas ao caminho
            caminho.addCoordenada(c1);
            caminho.addCoordenada(c2);
            caminho.addCoordenada(c3);

            /* * VOCE PODE DESCOMENTAR AS LINHAS ABAIXO NO ECLIPSE PARA TESTAR OS ERROS:
             */
            
            // Teste 1: Descomente para forcar DigitoInvalidoException
            // Coordenada erroDigito = new Coordenada(10, 20, 5); 
            // caminho.addCoordenada(erroDigito);

            // Teste 2: Descomente para forcar DistanciaEntrePontosExcedidaException (> 15m)
            // Coordenada erroDistancia = new Coordenada(50, 50, 0); 
            // caminho.addCoordenada(erroDistancia);

            // Se tudo der certo, imprime o caminho completo enviado
            System.out.println(caminho.toString());

        } catch (RoverException e) {
            // Captura qualquer excecao da nossa hierarquia (Coordenada ou Caminho)
            System.out.println(e.getMessage());
            
            // Reseta o caminho para o rover ficar parado por seguranca
            caminho.reset();
        }
    }
}