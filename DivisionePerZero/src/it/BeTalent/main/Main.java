package it.BeTalent.main;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner input=new Scanner(System.in);
		
				
		boolean flag=true;
		
		do {
			System.out.println("Inserisci due numeri interi");
			int uno=input.nextInt();
			int due=input.nextInt();
			try {
				verifica.testnumero(uno, due);
		
				flag=true;
				
			}
		 catch (Exception e){
			 System.out.println("Numeri errati");
			 flag=false;
			 
		 }
		}while (!flag);
	
		
		}
}