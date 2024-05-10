package br.com.fiap.baralho.model;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class JogadorCpu {

    private List<Carta> mao;
    private int pontos;

    public JogadorCpu() {
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
        if (this.pontos < 17) {
            return true;
        } else {
            return false;
        }
    }
}
