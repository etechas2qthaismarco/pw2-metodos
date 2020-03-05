
public class ExemplosComRetorno {

	public static String concatenar(String nome, String sobrenome) {
		return nome + " " + sobrenome;
	}
	
	public static int tamanhoNomeCompleto(String nome, String sobrenome) {
		String nomeCompleto = concatenar (nome, sobrenome);
		return nomeCompleto.length();
		
	}

	public static void main(String[] args) {
		String nome = concatenar ("Thais","Viana");
		int tamanho = tamanhoNomeCompleto ("Thais","Viana");
		
		System.out.println("Nome: " + nome);
		System.out.println("Qtde: " + tamanho + " caracteres");
		
	}

}
