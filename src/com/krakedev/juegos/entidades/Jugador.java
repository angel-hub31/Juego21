package com.krakedev.juegos.entidades;

import java.util.ArrayList;

public class Jugador {
	private String nicname;
	private ArrayList<Carta> cartas = new ArrayList<>();
	private int puntajeCartas;
	


	public void recibirCarta(Carta carta) {
		cartas.add(carta);

	}

	public void imprimir() {
		System.out.println("Jugador: " + nicname);
		for (Carta carta : cartas) {
			carta.imprimir();
		}

	}
	
	
	
	public String getNicname() {
		return nicname;
	}

	public void setNicname(String nicname) {
		this.nicname = nicname;
	}

	public ArrayList<Carta> getCartas() {
		return cartas;
	}

	public void setCartas(ArrayList<Carta> cartas) {
		this.cartas = cartas;
	}

	public int getPuntajeCartas() {
		return puntajeCartas;
	}

	public void setPuntajeCartas(int puntajeCartas) {
		this.puntajeCartas = puntajeCartas;
	}
}
