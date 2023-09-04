package org.example;

public class Carta {
    private String nome;
    private int titulosBrasileiro;
    private int titulosLibertadores;
    private int titulosMundial;
    private boolean superTrunfo;

    public Carta(String nome, int titulosBrasileiro, int titulosLibertadores, int titulosMundial, boolean superTrunfo) {
        this.nome = nome;
        this.titulosBrasileiro = titulosBrasileiro;
        this.titulosLibertadores = titulosLibertadores;
        this.titulosMundial = titulosMundial;
        this.superTrunfo = superTrunfo;
    }

    public int comparaAtributoEscolhido(Carta cartaDaVez, int atributo) {
        switch (atributo) {
            case 1:
                return Integer.compare(this.titulosBrasileiro, cartaDaVez.titulosBrasileiro);
            case 2:
                return Integer.compare(this.titulosLibertadores, cartaDaVez.titulosLibertadores);
            case 3:
                return Integer.compare(this.titulosMundial, cartaDaVez.titulosMundial);
            default:
                return 0; // Empate
        }
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getTitulosBrasileiro() {
        return titulosBrasileiro;
    }

    public void setTitulosBrasileiro(int titulosBrasileiro) {
        this.titulosBrasileiro = titulosBrasileiro;
    }

    public int getTitulosLibertadores() {
        return titulosLibertadores;
    }

    public void setTitulosLibertadores(int titulosLibertadores) {
        this.titulosLibertadores = titulosLibertadores;
    }

    public int getTitulosMundial() {
        return titulosMundial;
    }

    public void setTitulosMundial(int titulosMundial) {
        this.titulosMundial = titulosMundial;
    }

    public boolean isSuperTrunfo() {
        return superTrunfo;
    }

    public void setSuperTrunfo(boolean superTrunfo) {
        this.superTrunfo = superTrunfo;
    }


    @Override
    public String toString() {
        return nome;
    }
}