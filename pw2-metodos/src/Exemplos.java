
public class Exemplos {

	public static void main(String[] args) {
		ehMaiorIdade(17);
		classificar(-1);

	}

	public static void ehMaiorIdade(int idade) {

		if (idade >= 18) {
			System.out.println("Maior");
		} else {
			System.out.println("Menor");

		}
	}

	public static void classificar(int num) {
		if (num > 0) {
			System.out.println("Positivo");

		} else if (num < 0) {
			System.out.println("Negativo");

		} else {
			System.out.println("Zero");

		}

	}
}
