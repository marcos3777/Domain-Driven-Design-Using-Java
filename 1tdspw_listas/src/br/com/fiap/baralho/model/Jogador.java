package br.com.fiap.baralho.model;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Jogador {

    private List<Carta> mao;
    private int pontos;

    public Jogador() {
        this.mao = new ArrayList<>();
        this.pontos = 0;
    }

    public void receberCarta(Carta c) {
        this.mao.add(c);
        if (c.getValor() >= 10) {
            this.pontos += 10;
        } else {
            this.pontos += c.getValor();
        }
    }

    public int getPontos() {
        return this.pontos;
    }

    public boolean querCarta() {

        for (Carta c : mao) {
            System.out.println(c);
        }
        Scanner tec = new Scanner(System.in);
        System.out.println("Deseja mais uma carta? (s/n)");
        String resp = tec.nextLine();
        if (resp.equals("s")) {
            return true;
        } else {
            return false;
        }
    }
}
