package exercicio02;

public class Agenda{
	private String nome;
	private int ddd;
	private int telefone;
	private String tipo;
	
	public Agenda (String n, int d, int t, String tipo) {
		this.setNome(n);
		this.setDdd(d);
		this.setTelefone(t);
		this.setTipo(tipo);
	}
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	
	public int getDdd() {
		return ddd;
	}

	public void setDdd(int ddd) {
		String TesteDdd = Integer.toString(ddd);
		if (TesteDdd.length() != 2) {
			System.out.println("DDD inválido");
		} else {
		this.ddd = ddd;
		}
	}

	public int getTelefone() {
		return telefone;
	}
	public void setTelefone(int telefone) { 
		String fone = Integer.toString(telefone);
		if (fone.length() != 9) {
			System.out.println("Telefone inválido");
		} else {
		this.telefone = telefone; 
		}
	}
	public String getTipo() {
		return tipo;
	}
	public void setTipo(String tipo) {
		this.tipo = tipo;
	}

	public void dados() {
		System.out.println("Nome: " + this.getNome());
		System.out.println("Telefone: (" + this.getDdd() + ") " + this.telefone);
	}
}
