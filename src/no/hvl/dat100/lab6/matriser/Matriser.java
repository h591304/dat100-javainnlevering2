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
		int[][] nyMatrise = new int[matrise.length][matrise[0].length];
		
		for(arr1 = 0; arr1 < nyMatrise.length; arr1++) {
			nyMatrise[arr1] = new int[matrise[arr1].length];
			
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
				
				if(a == b) {
					return erLik;
				}
			}
		} 
		return !erLik;
	}
	
	// e)
	public static int[][] speile(int[][] matrise) {

		// TODO
		throw new UnsupportedOperationException("speile ikke implementert");
	
	}

	// f)
	public static int[][] multipliser(int[][] a, int[][] b) {

		// TODO
		throw new UnsupportedOperationException("multipliser ikke implementert");
	
	}
}
