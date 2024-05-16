package br.com.fiap.baralho.model;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Baralho {

	private List<Carta> monte;

	public Baralho() {
		this.monte = new ArrayList<>();
<<<<<<< HEAD

		for (int i = 1; i <= 13; i++) {
			Carta c = new Carta(i, "Paus");
			this.monte.add(c);
			c = new Carta(i, "Ouros");
			this.monte.add(c);
			c = new Carta(i, "Copas");
			this.monte.add(c);
			c = new Carta(i, "Espadas");
			this.monte.add(c);

		}
	}

	public void embaralhar() {
		// TODO
		Random r = new Random();
		int cont = 0;
		while (cont < 1000) {
=======
		for(int i = 1; i <= 13; i++) {
			Carta c = new Carta(i, "PAUS");
			this.monte.add(c);
			c = new Carta(i, "COPAS");
			this.monte.add(c);
			c = new Carta(i, "ESPADAS");
			this.monte.add(c);
			c = new Carta(i, "OUROS");
			this.monte.add(c);
		}
	}
	
	public void embaralhar() {
		Random r = new Random();
		int contagem = 0;
				
		while (contagem < 100) {
>>>>>>> 5d68b26cb9db2c6b9e85775d32402246281988db
			int i = r.nextInt(52);
			int j = r.nextInt(52);
			Carta aux = monte.get(i);
			Carta aux2 = monte.get(j);
<<<<<<< HEAD

			monte.set(i, aux2);
			monte.set(j, aux);
			cont++;
		}
	}

	public void imprime() {
		for (Carta c : monte) {
			System.out.println(c);
			System.out.println(" ");

		}

	}

	public Carta comprar() {
		if (monte.isEmpty()) {
			return null;
		}
		return monte.remove(0);
	}


=======
			
			monte.set(i, aux2);
			monte.set(j, aux);
			contagem++;
		}
	}
	
	public void imprime() {
		/*
		 * int i = 0; while (i < monte.size()) { System.out.print(monte.get(i)); i++; }
		 */
		for(Carta c : monte) {
			System.out.print(c);
			System.out.print(" ");
		}
	}
	
	
	
	
	
	
	
>>>>>>> 5d68b26cb9db2c6b9e85775d32402246281988db
}
