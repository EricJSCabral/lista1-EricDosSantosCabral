package exercicio02;

public class MainAgenda {

	public static void main(String[] args) {

	Agenda contato1 = new Agenda("Theresa Martin",  11, 912345678, "Celular");
	contato1.dados();
	System.out.println("\n");
	
	Agenda contato2 = new Agenda ("Maria Beatriz", 55, 956324782, "Celular");
	contato2.dados();
	System.out.println("\n");
	
	Agenda contato3 = new Agenda ("Carlos Barra", 200, 658712, "Telefone"); //exemplo com dados errados
	contato3.dados();
	System.out.println("\n");
	}

}
