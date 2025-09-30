package no.hvl.dat100.matriser;

public class Matriser {

	// a)
	public static void skrivUt(int[][] matrise) {
		for(int[] rad : matrise) {
			for (int rekke : rad) {
				System.out.println(rekke);
				}
			}
				
				
	}

	// b)
	public static String tilStreng(int[][] matrise) {
		String svar = "";
		for(int[] rad : matrise) {
			for (int rekke : rad) {
				svar += rekke+" ";
				}
			svar += "\n";
			}
		return svar;
	}

	// c)
	public static int[][] skaler(int tall, int[][] matrise) {
		int[][] bedreMatrise = new int[matrise.length][matrise[0].length];
		for(int a = 0; a < matrise.length; a++) {
			for (int b = 0; b < matrise[a].length; b++) {
				bedreMatrise[a][b] = matrise[a][b]*tall;
				}
			}
		return bedreMatrise;
	}

	// d)
	public static boolean erLik(int[][] a, int[][] b) {
		if(a.length != b.length) {
			return false;
		}
		for (int f = 0; f < a.length; f++) {
			if(a[f].length != b[f].length) {
				return false;
			}
		}
		for(int f = 0; f < a.length; f++) {
			for (int s = 0; s < a[f].length; s++) {
				if (a[f][s] != b[f][s]) {
					return false;
				}
			}
		}
		return true;
	}
}
