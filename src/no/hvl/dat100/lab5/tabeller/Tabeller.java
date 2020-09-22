package no.hvl.dat100.lab5.tabeller;

public class Tabeller {

	
	// a)
	//lagde en hvilken som helst tabell
	public static void skrivUt(int[] tabell) {
		
		System.out.println("Tabell-Analyse");
		System.out.println("***************");
		
		int ht1;
		
		for(ht1 = 0; ht1 < tabell.length; ht1++) {
				
			System.out.println("Heltall: " + tabell[ht1]);		
		}
		System.out.println("***************");	
	}
	

	// b)
	public static String tilStreng(int[] tabell) {
		
		int i;
		String str = ("[");

		for(i = 0; i < tabell.length; i++) {
			
			if(i != tabell.length - 1) {
				str += (tabell[i] + ",");
			}
			
			else {
				str += (tabell[i]);
			}
			
		}
		
		str += ("]");
		return str;
	}

	
	// c)
	/* modifiserte testSummer() funksjonen i TabellerEnhetsTester.java til å ha tre tilsvarende tester for hver av løkkene: for, while og for-each*/
	//Metode-variant 1 : for-loop
	public static int summer(int[] tabell) {

		int sum = 0;
		int i;
		
		
		for(i = 0; i < tabell.length; i++) {
			
			sum += tabell[i];
		}
		return sum;
	}
	
	//Metode-variant 2 : while-loop
	public static int summer2(int[] tabell) {
		
		int sum = 0;
		int i;
		
		i = 0;
		while(i < tabell.length) {
			
			sum += tabell[i];
			i++;
		}
		return sum;
	}
	
	//Metode-variant 3 : for-each-loop (Utvidet for-loop)
	public static int summer3(int[] tabell) {
		
		int sum = 0;
		
		for(int i : tabell) {	
			sum += i;
		}
		return sum;
	}
	
	
	// d)
	public static boolean finnesTall(int[] tabell, int tall) {
		
		boolean finnesTall = true;
		int ht = 0;
		
		for (ht = 0; ht < tabell.length; ht++) {
			if(tall == tabell[ht]) {
				return finnesTall;
			}
		}
		return !finnesTall;
	}
	

	// e)
	public static int posisjonTall(int[] tabell, int tall) {

		int i;
		
		for(i = 0; i < tabell.length; i++) {
			if(tall == tabell[i]) {
				return i;
			}	
		}
		return -1;
	}
	

	// f)
	public static int[] reverser(int[] tabell) {

		int[] reversedTable = new int[tabell.length];
		int tableIndex = tabell.length-1;
		int i;
		
		for(i = 0; i < tabell.length; i++) {
			reversedTable[i] = tabell[tableIndex];
			tableIndex--;
		}
		return reversedTable;
	}

	
	// g)
	public static boolean erSortert(int[] tabell) {
		
		boolean erSortert = true;
		int i;
		
		for(i = 0; i < tabell.length-1; i++) {
			if(tabell[i] > tabell[i+1]) {
				return !erSortert;
			}
		}
		return erSortert;
	}

	
	// h)
	public static int[] settSammen(int[] tabell1, int[] tabell2) {
		
		int tabellLengde = tabell1.length + tabell2.length;
		int [] tabell = new int[tabellLengde];
		int i = 0;
		
		for (int e : tabell1) {
			tabell[i] = e;
			i++;
		}
		
		for (int e : tabell2) {
			tabell[i] = e;
			i++;
		}
		return tabell;
	}

}
