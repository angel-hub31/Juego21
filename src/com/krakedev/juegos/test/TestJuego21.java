package com.krakedev.juegos.test;

import java.util.ArrayList;

import com.krakedev.juegos.entidades.Jugador;
import com.krakedev.juegos.servicios.Juego21;

public class TestJuego21 {

	public static void main(String[] args) {
		Juego21 juego = new Juego21();

        juego.agregarJugador(new Jugador("Angel"));
        juego.agregarJugador(new Jugador("Marcos"));
        juego.agregarJugador(new Jugador("Bot-Krakedev"));

        for (int i = 1; i <= 10; i++) {
            System.out.println("\n=== SIMULACIÓN DE JUEGO #" + i + " ===");
            
            juego.inicializar();
            
            ArrayList<Jugador> ganadores = juego.jugar();

            if (ganadores.size() > 0) {
                System.out.println("¡GANADOR(ES) ENCONTRADO(S)!");
                for (Jugador g : ganadores) {
                    g.imprimir(); 
                    System.out.println("Puntaje Total: " + g.getPuntajeCartas());
                }
            } else {
                System.out.println("No hubo ganadores en esta simulación (Nadie llegó a 21).");
            }
            
            System.out.println("Cartas restantes en el mazo: " + juego.getDealer().getNaipe().size());
        }
    }
}

