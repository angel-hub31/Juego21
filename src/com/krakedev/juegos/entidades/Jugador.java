package com.krakedev.juegos.entidades;

import java.util.ArrayList;

public class Jugador {
	private String nicname;
	private ArrayList<Carta> cartas = new ArrayList<>();

	public void recibirCarta(Carta carta) {
		cartas.add(carta);

	}

	public void imprimir() {
		System.out.println("Jugador: " + nicname);
		for (Carta carta : cartas) {
			carta.imprimir();
		}

	}
}
