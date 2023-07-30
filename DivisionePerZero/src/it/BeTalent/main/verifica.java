package it.BeTalent.main;

public class verifica {

		
		public static void testnumero( int a,int b) {
			int quoziente;
			if (b!=0) {
				quoziente=a/b;
				int resto=a%b;
				System.out.println(a+"/"+b+"= "+quoziente+","+resto);
				
			}
			else throw new IllegalArgumentException();
		}
		
}
