package br.com.fiap.baralho.model;

public class App {
    public static void main(String[] args) {
        Baralho baralho = new Baralho();
       // baralho.imprime();
        //baralho.embaralhar();
       // baralho.imprime();

       Carta c = baralho.comprar();
       while (c != null) {
           System.out.println(c);
           c = baralho.comprar();
       }
    }
}
