package org.generation.italy;

import java.util.Scanner;

public class CalcolaBiglietto { // £ al km=0.21, 20% in meno a >18, 40% in - a <65// 

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		
		//informazzioni
		double prezzoDelBiglietto = 0.21;
		double kmDafare;
		int età;
		double sconto18 = 0.2;
		double sconto65 = 0.4;
		
		
		//calcolo km/sconto
		
		System.out.print("Inserire i km da percorrere: ");
		kmDafare = scanner.nextDouble();
		System.out.print("Digita la tua età: ");
		età = scanner.nextInt();
		double costoBigliettoAlKm = prezzoDelBiglietto * kmDafare;
		//double prezzoTotalebiglitto = costoBigliettoAlKm *
		
		if(età < 18) {
		   System.out.println("Costo del biglietto: " + (costoBigliettoAlKm - (costoBigliettoAlKm * sconto18))+ " euro");
		} else if(età > 65) {
			System.out.println("Costo del biglietto: " + (costoBigliettoAlKm - (costoBigliettoAlKm * sconto65))+ " euro");
		} else if(età >= 18 && età <= 64) {
			System.out.println("Costo del biglietto: " + costoBigliettoAlKm + " euro");
	    }
	    
		scanner.close();
	}

}
