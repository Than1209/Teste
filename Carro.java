package com.thanderson.cursojava.aula28.labs;

public class Lampada {
	String marca;
	String cor;
	boolean ligada;
	double tensão;
	String volts;
	void ligar() {
		ligada = true;
	}
	void desligar() {
		ligada = false;
	}
	void mostrarEstado() {
		
		if(ligada) {
			System.out.println("lampada ligada " );
		}else {
		System.out.println("lampada desligada");
	    }
	}	
	
	void mudarEstado() {
		if(ligada) {
			desligar();
			System.out.println("A lampada esta desligada");
		}else {
			ligar();
			System.out.println("A lampada esta ligada");
		}
		
	}
}
