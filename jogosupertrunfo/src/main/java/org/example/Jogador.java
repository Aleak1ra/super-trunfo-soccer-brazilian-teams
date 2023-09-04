package org.example;

import java.util.ArrayList;
import java.util.Scanner;

public class Jogador {
    private String nome;
    private ArrayList<Carta> cartas;
    private ArrayList<Carta> cartasDaRodada;

    public Jogador(String nome) {
        this.nome = nome;
        cartas = new ArrayList<>();
        cartasDaRodada = new ArrayList<>();
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public ArrayList<Carta> getCartas() {
        return cartas;
    }

    public void setCartas(ArrayList<Carta> cartas) {
        this.cartas = cartas;
    }

    public void setCartasDaRodada(ArrayList<Carta> cartasDaRodada) {
        this.cartasDaRodada = cartasDaRodada;
    }

    public void adicionarCarta(Carta carta) {
        cartas.add(carta);
    }

    public boolean semCartas() {
        return cartas.isEmpty();
    }

    public Carta getCartaAtual() {
        if (!cartas.isEmpty()) {
            return cartas.get(0);
        }
        return null;
    }

    public void limparCartasDaRodada() {
        cartasDaRodada.clear();
    }

    public void transferirCarta(Jogador vencedor) {
        Carta cartaPerdedor = this.getCartaAtual();
        Carta cartaVencedor = vencedor.getCartaAtual();

        this.removerCartaAtual();
        vencedor.removerCartaAtual();

        vencedor.adicionarCarta(cartaPerdedor);
        vencedor.adicionarCarta(cartaVencedor);
    }

    public ArrayList<Carta> getCartasDaRodada() {
        return cartasDaRodada;
    }

    public void receberCartas(ArrayList<Carta> cartasRodada) {
        cartasDaRodada.addAll(cartasRodada);
    }

    public int escolherAtributo() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Escolha o atributo para comparar:");
        System.out.println("1 - Títulos Brasileiros");
        System.out.println("2 - Títulos da Libertadores");
        System.out.println("3 - Títulos Mundiais");

        int atributoEscolhido;
        do {
            System.out.print("Digite o número do atributo: ");
            atributoEscolhido = scanner.nextInt();
        } while (atributoEscolhido < 1 || atributoEscolhido > 3);

        return atributoEscolhido;
    }

    public void removerCartaAtual() {
        if (!cartas.isEmpty()) {
            cartas.remove(0);
        }
    }

    @Override
    public String toString() {
        return nome + " (Cartas: " + cartas.size() + ")";
    }
}
