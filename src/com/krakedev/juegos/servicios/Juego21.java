package com.krakedev.juegos.servicios;

import java.util.ArrayList;

import com.krakedev.juegos.entidades.Carta;
import com.krakedev.juegos.entidades.Jugador;

public class Juego21 {
	private ArrayList<Jugador> jugadores;
	private Dealer dealer;
	
	
	
	public void cargarValores() {
		
		ArrayList<Carta> naipes = dealer.getNaipe();
        for (Carta carta : naipes) {
            String valor = carta.getValor();
            if (valor.equals("A")) {
                carta.setValorJuego(11); 
            } else if (valor.equals("J") || valor.equals("Q") || valor.equals("K")) {
                carta.setValorJuego(10); 
            } else {
                carta.setValorJuego(Integer.parseInt(valor));
            }
        }
    }
	public void inicializar() {
        dealer = new Dealer(); 
        cargarValores();       
    }
	
	public void agregarJugador(Jugador jugador) {
        jugadores.add(jugador); 
    }
	
	
	
}


