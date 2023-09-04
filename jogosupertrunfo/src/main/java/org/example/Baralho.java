package org.example;

import java.util.ArrayList;
import java.util.Collections;

public class Baralho {
    private ArrayList<Carta> cartas;

    public Baralho() {
        cartas = new ArrayList<>();
    }

    public void geraBaralho() {
        // Adicione as cartas ao baralho
        cartas.add(new Carta("Flamengo", 8, 2, 3, false));
        cartas.add(new Carta("São Paulo FC", 6, 3, 3, false));
        cartas.add(new Carta("Palmeiras", 10, 0, 0, false));
        cartas.add(new Carta("Corinthians", 7, 1, 2, false));
        cartas.add(new Carta("Santos", 8, 3, 2, false));
        cartas.add(new Carta("Grêmio", 7, 3, 3, false));
        cartas.add(new Carta("Internacional", 7, 2, 2, false));
        cartas.add(new Carta("Cruzeiro", 4, 2, 2, false));
        cartas.add(new Carta("Atlético-MG", 1, 0, 0, false));
        cartas.add(new Carta("Botafogo", 2, 0, 0, false));
        cartas.add(new Carta("Fluminense", 4, 0, 0, false));
        cartas.add(new Carta("Vasco da Gama", 4, 0, 1, false));
        cartas.add(new Carta("Bahia", 2, 0, 0, false));
        cartas.add(new Carta("Sport", 1, 0, 0, false));
        cartas.add(new Carta("Coritiba", 1, 0, 0, false));
        cartas.add(new Carta("Athletico-PR", 3, 0, 1, false));
        cartas.add(new Carta("Fortaleza", 1, 0, 0, false));
        cartas.add(new Carta("Ceará", 1, 0, 0, false));
        cartas.add(new Carta("Goiás", 2, 0, 0, false));
        cartas.add(new Carta("Chapecoense", 0, 0, 0, false));
        cartas.add(new Carta("América-MG", 0, 0, 0, false));
        cartas.add(new Carta("Figueirense", 0, 0, 0, false));
        cartas.add(new Carta("Ponte Preta", 0, 0, 0, false));
        cartas.add(new Carta("Avaí", 0, 0, 0, false));
        cartas.add(new Carta("Vitória", 0, 0, 0, false));
        cartas.add(new Carta("Náutico", 0, 0, 0, false));
        cartas.add(new Carta("Santa Cruz", 0, 0, 0, false));
        cartas.add(new Carta("CSA", 0, 0, 0, false));
        cartas.add(new Carta("Joinville", 0, 0, 0, false));
        cartas.add(new Carta("Juventude", 0, 0, 0, false));
        cartas.add(new Carta("CRB", 0, 0, 0, false));

        // Carta Super Trunfo
        cartas.add(new Carta("Super Trunfo", 10, 10, 10, true));
    }

    public void embaralhar() {
        Collections.shuffle(cartas);
    }

    public void darCartas(Jogador jogador1, Jogador jogador2) {
        // distribua as cartas alternadamente para os jogadores
        for (int i = 0; i < cartas.size(); i++) {
            Carta carta = cartas.get(i);
            if (i % 2 == 0) {
                jogador1.adicionarCarta(carta);
            } else {
                jogador2.adicionarCarta(carta);
            }
        }
    }

    public boolean semCartas() {
        return cartas.isEmpty();
    }
}