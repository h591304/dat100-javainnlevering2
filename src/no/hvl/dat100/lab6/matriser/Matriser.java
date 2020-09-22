package no.hvl.dat100.lab6.matriser;

public class Matriser {

	// a)
	public static void skrivUt(int[][] matrise) {
		
		for (int[] arr1 : matrise) {
			for (int arr2 : arr1) {
				
				System.out.println(arr2);
				
			}
		}
	}

	// b)
	public static String tilStreng(int[][] matrise) {

		String str = "";
		
		for(int[] arr1 : matrise) {
			for(int arr2 : arr1) {
				str += arr2 + " ";			
			}	
			str += "\n";
		}
		return str;
	}

	// c)
	public static int[][] skaler(int tall, int[][] matrise) {
		
		int arr1;
		int arr2;
		
		//siden alle matriser er rektangulære, kan man bruke matrise[0] som lengdemål
		int[][] nyMatrise = new int[matrise.length][matrise[0].length];
		
		for(arr1 = 0; arr1 < nyMatrise.length; arr1++) {
			for(arr2 = 0; arr2 < nyMatrise[arr1].length; arr2++) {
				
				nyMatrise[arr1][arr2] = matrise[arr1][arr2] * tall;
			} 
		}
		return nyMatrise;
	}

	// d)
	public static boolean erLik(int[][] a, int[][] b) {

		boolean erLik = true;
		int i;
		int j;
		
		for(i = 0; i < a.length; i++) {
			for(j = 0; j < a[i].length; j++) {
				
				if(a[i][j] == b[i][j]) {
					return erLik;
				}
			}
		} 
		return !erLik;
	}
	
	// e)
	public static int[][] speile(int[][] matrise) {
		
		/*int rad;
		int kolonne;
		int[][] speiletMatrise = new int[matrise.length][matrise[0].length];
		
		for(rad = 0; rad < speiletMatrise.length; rad++) {
			int sKolonne = rad;
			
			for(kolonne = speiletMatrise[rad].length; kolonne >= 0; kolonne++) {
				int sRad = kolonne;
				int speil = matrise[rad][kolonne];
				speiletMatrise[sRad][sKolonne] = speil;
				
			} 
		}
		
		return speiletMatrise;*/
	
	}

	// f)
	public static int[][] multipliser(int[][] a, int[][] b) {
		
		/*int i;
		int j;
		int[][] multiMatrise;
		
		for(i = 0; i < a.length; i++) {
			for(j = 0; j < a[i].length; j++) {
				
				if(a.length == b[0].length && a[0].length == b.length) {
					multiMatrise = a*b;
				}
			}
		} 
		return multiMatrise;*/
	}
		
	
}
