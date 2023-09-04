package org.example;



public class JogoSuperTrunfo {
    public static void main(String[] args) {
        Baralho baralho = new Baralho();
        baralho.geraBaralho();
        baralho.embaralhar();

        Jogador jogador1 = new Jogador("Jogador 1");
        Jogador jogador2 = new Jogador("Jogador 2");

        baralho.darCartas(jogador1, jogador2);

        int rodada = 1;
        Jogador jogadorAtual = jogador1; // inicialmente, o jogador 1 começa escolhendo

        while (true) {
            System.out.println("\nRodada " + rodada);
            System.out.println(jogador1);
            System.out.println(jogador2);

            int atributoEscolhido = jogadorAtual.escolherAtributo(); // o jogador atual escolhe o atributo

            Carta carta1 = jogador1.getCartaAtual();
            Carta carta2 = jogador2.getCartaAtual();

            System.out.println("Atributo escolhido por " + jogadorAtual.getNome() + ": " + getNomeAtributo(atributoEscolhido));
            System.out.println("Valor de " + getNomeAtributo(atributoEscolhido) + " de " + jogador1.getCartaAtual().getNome() + ": " + Integer.toString(carta1.comparaAtributoEscolhido(carta2, atributoEscolhido)));
            System.out.println("Valor de " + getNomeAtributo(atributoEscolhido) + " de " + jogador2.getCartaAtual().getNome() + ": " + Integer.toString(carta2.comparaAtributoEscolhido(carta1, atributoEscolhido)));


            int resultado = carta1.comparaAtributoEscolhido(carta2, atributoEscolhido);

            System.out.println("Resultado da rodada:");
            System.out.println(jogador1.getCartaAtual() + " vs. " + jogador2.getCartaAtual());

            if (carta1.comparaAtributoEscolhido(carta2, atributoEscolhido) > carta2.comparaAtributoEscolhido(carta2, atributoEscolhido)) {
                System.out.println(jogador1.getNome() + " venceu a rodada!");
                jogador1.receberCartas(jogador1.getCartasDaRodada());
                jogador1.limparCartasDaRodada();
                jogador1.adicionarCarta(carta2); // ogador 1 fica com a carta do jogador 2
                jogador2.removerCartaAtual();
                jogadorAtual = jogador1; // o jogador 1 escolhe na próxima rodada
            } else if (carta1.comparaAtributoEscolhido(carta2, atributoEscolhido) < carta2.comparaAtributoEscolhido(carta2, atributoEscolhido)) {
                System.out.println(jogador2.getNome() + " venceu a rodada!");
                jogador2.receberCartas(jogador2.getCartasDaRodada());
                jogador2.limparCartasDaRodada();
                jogador2.adicionarCarta(carta1); // jogador 2 fica com a carta do jogador 1
                jogador1.removerCartaAtual();
                jogadorAtual = jogador2; //  jogador 2 escolhe na próxima rodada
            } else {
                System.out.println("Empate!");
                jogador1.adicionarCarta(jogador1.getCartaAtual()); // move a carta atual do jogador 1 para o final da lista
                jogador1.removerCartaAtual();
                jogador2.adicionarCarta(jogador2.getCartaAtual()); // move a carta atual do jogador 2 para o final da lista
                jogador2.removerCartaAtual();
                jogadorAtual = jogadorAtual == jogador1 ? jogador2 : jogador1; // Troca o jogador atual para o proximo
            }

            if (baralho.semCartas() || jogador1.semCartas() || jogador2.semCartas()) {
                break;
            }

            rodada++;

            if (jogador1.getCartas().size() == 32) {
                System.out.println("\n" + jogador1.getNome() + " venceu o jogo!");
                break;
            } else if (jogador2.getCartas().size() == 32) {
                System.out.println("\n" + jogador2.getNome() + " venceu o jogo!");
                break;
            }
        }
    }

    private static String getNomeAtributo(int atributoEscolhido) {
        switch (atributoEscolhido) {
            case 1:
                return "Títulos Brasileiros";
            case 2:
                return "Títulos da Libertadores";
            case 3:
                return "Títulos Mundiais";
            default:
                return "Atributo Desconhecido";
        }
    }
}

