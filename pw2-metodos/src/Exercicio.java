
public class Exercicio {

	public static int somar(int nroum, int nrodois) {
		return nroum + nrodois;

	}

	public static int proximo(int nroum) {
		return somar(nroum, 1);

	}

	public static int dobro(int nroum) {
		return nroum * 2;

	}

	public static void main(String[] args) {
		int nroum = 10;
		
		int nrodois = 100;
		
		int nrotres = 12;
		
		int nroquatro = 50;
		
		int rsoma = somar(nroum, nrodois);

		int rproximo = proximo(nrotres);
		
		int rdobro = dobro (nroquatro);

		System.out.println("A Soma de: " + nroum + " + " + nrodois +" será " + rsoma);
		System.out.println("O Próximo Depois de: " + nrotres + " será " + rproximo);
		System.out.println("O Dobro de: " + nroquatro + " será " + rdobro);

	}

}
