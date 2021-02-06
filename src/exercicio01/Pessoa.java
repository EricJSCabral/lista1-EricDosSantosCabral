/* Crie uma classe para representar uma pessoa, com os atributos privados de nome,
data de nascimento e altura. Crie os métodos públicos necessários para sets e gets
e também um método para imprimir todos dados de uma pessoa. Crie um método
para calcular a idade da pessoa. */

package exercicio01;

public class Pessoa {
	final int anoAtual = 2021;
	
	private String nome;
	private int anoNascimento;
	private int idade;
	private float altura;
	
	public Pessoa(String n, int ano, float f)
	{
		this.setNome(n);
		this.setAnoNascimento(ano);
		this.setAltura(f);
	}
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public int getAnoNascimento() {
		return anoNascimento;
	}
	public void setAnoNascimento(int anoNascimento) {
		this.anoNascimento = anoNascimento;
	}
	public float getAltura() {
		return altura;
	}
	public void setAltura(float altura) {
		this.altura = altura;
	}
	
	public void dados() {
		System.out.println("Nome: " + this.nome);
		System.out.println("Ano nascimento: " + this.anoNascimento);
		System.out.println("altura: " + this.altura);	
		
	}
	
	public void calcIdade(int anoNasc) {
		this.idade = anoAtual - anoNasc;
		System.out.println("Idade: " + this.idade);
	}
}
