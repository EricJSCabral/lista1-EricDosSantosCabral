package exercicio04;

public class MainPessoa {

	public static void main(String[] args) {
		
		Pessoa p1 = new Pessoa("Eric Cabral", 20, "Maria Cabral", "João Cabral");
		
		System.out.println("Nome: " + p1.getNome() + "\nIdade: " + p1.getIdade());
		System.out.println("Nome da mãe: " + p1.getNomeMae() + "\nNome do pai: " + p1.getNomePai());
		
		System.out.println("\n");
		
		Pessoa p2 = new Pessoa("João Cabral", 40, "Valda Cabral", "Jaime Cabral");
		
		System.out.println("Nome: " + p2.getNome() + "\nIdade: " + p2.getIdade());
		System.out.println("Nome da mãe: " + p2.getNomeMae() + "\nNome do pai: " + p2.getNomePai());
	}

}
