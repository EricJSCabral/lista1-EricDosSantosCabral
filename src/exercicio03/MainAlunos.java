package exercicio03;

public class MainAlunos {

	public static void main(String[] args) {

		Alunos a1 = new Alunos (12345678, "João", 10, 7, 8);
		a1.status();
			
		System.out.println("\n");
		
		Alunos a2 = new Alunos (523697, "Calors", 11, -2, 455); //exemplo com dados inválidos
		a2.status();
		
		System.out.println("\n");
		
		Alunos a3 = new Alunos(12345682, "Eric", 5, 4, 3);
		a3.status();
	}

}
