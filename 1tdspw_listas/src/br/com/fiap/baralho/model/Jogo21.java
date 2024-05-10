package br.com.fiap.baralho.model;

public class Jogo21 {

    public static void main(String[] args) {
        Baralho baralho = new Baralho();
        Jogador j1 = new Jogador();
        JogadorCpu j2 = new JogadorCpu();
        
        baralho.embaralhar();
        
        j1.receberCarta(baralho.comprar());
        j1.receberCarta(baralho.comprar());
        
        j2.receberCarta(baralho.comprar());
        j2.receberCarta(baralho.comprar());
        
        while (j1.querCarta()) {
            j1.receberCarta(baralho.comprar());
        }
        
        while (j2.querCarta()) {
            j2.receberCarta(baralho.comprar());
        }
        
        System.out.println("Jogador 1: " + j1.getPontos());
        System.out.println("Jogador 2: " + j2.getPontos());
    }
    
}
