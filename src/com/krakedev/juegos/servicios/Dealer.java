package com.krakedev.juegos.servicios;

import java.util.ArrayList;

import com.krakedev.juegos.entidades.Carta;

public class Dealer {
	private ArrayList<Carta>naipe;
	
	//metodo generar naipe 
	public void generarNaipe() {
		ArrayList<String> palos=new ArrayList<>();
		palos.add("T");
		palos.add("CN");
		palos.add("CR");
		palos.add("D");
		
		String [] valores = {"A","2","3","4","5","6","7","8","9","10","J","Q","K"};
			for (String palo :palos) {
				for(String valor : valores) {
					Carta carta=new Carta();
					carta.setValor(valor);
					carta.setPalo(palo);
					
					naipe.add(carta);
				}
			}
		}
		
	
	
	
//getters y setter
	public ArrayList<Carta> getNaipe() {
		return naipe;
	}

	public void setNaipe(ArrayList<Carta> naipe) {
		this.naipe = naipe;
	}
	  
	
	
	
	

}
