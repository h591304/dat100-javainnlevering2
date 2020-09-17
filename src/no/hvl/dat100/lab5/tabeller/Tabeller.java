package no.hvl.dat100.lab5.tabeller;

public class Tabeller {

	
	// a)
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
		
		String str ="[";
		int i = 0;
		
		while(i < tabell.length) {
			
			str += String.valueOf(tabell[i]) + ", ";
			i++;
		}
		
		str = str.substring(i = 0, i = tabell.length-1);
		str += "]";
		
		return str;
		
	}

	// c)
	//variant 1
	public static int summer(int[] tabell1) {

		int sum = 0;
		int i;
		
		
		for(i = 0; i < tabell1.length; i++) {
			
			sum += tabell1[i];
		}
		
		return sum;
		
	}
	
	//variant 2
	public static int summer2(int[] tabell2) {
		
		int sum = 0;
		int i;
		
		i = 0;
		while(i < tabell2.length) {
			
			sum += tabell2[i];
			i++;
		}
		
		return sum;
		
	}
	
	//variant 3
	public static int summer3(int[] tabell3) {
		
		int sum = 0;
		
		for(int i : tabell3) {	
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
				
				return tabell[0];
				
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
		
		int tabellLengde = (tabell1.length + tabell2.length)-1;
		int [] newTable = new int[tabellLengde];
		int i;
		
		for (i = 0; i < newTable.length; i++) {
			newTable[i] = tabellLengde;
		
		}
		
		return newTable;
	}
}
