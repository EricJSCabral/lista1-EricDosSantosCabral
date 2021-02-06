package exercicio04;

public class Pessoa {
	
	private String nome;
	private int idade;
	private String nomeMae;
	private String nomePai;
	
	public Pessoa (String n, int id, String nM, String nP) {
		this.setNome(n);
		this.setIdade(id);
		this.setNomeMae(nM);
		this.setNomePai(nP);
	}
	
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public int getIdade() {
		return idade;
	}
	public void setIdade(int idade) {
		this.idade = idade;
	}
	public String getNomeMae() {
		return nomeMae;
	}
	public void setNomeMae(String nomeMae) {
		this.nomeMae = nomeMae;
	}
	public String getNomePai() {
		return nomePai;
	}
	public void setNomePai(String nomePai) {
		this.nomePai = nomePai;
	}
	
	

}
