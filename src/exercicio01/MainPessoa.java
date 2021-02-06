package exercicio01;

public class MainPessoa {

	public static void main(String[] args) {

		Pessoa p1 = new Pessoa("Eric Cabral", 2000, 1.75f);
		p1.dados();
		p1.calcIdade(p1.getAnoNascimento());
		
		System.out.println("\n");
		
		Pessoa p2 = new Pessoa("Carlos", 1980, 1.60f);
		p2.dados();
		p2.calcIdade(p2.getAnoNascimento());
		
		
		
	}

}
