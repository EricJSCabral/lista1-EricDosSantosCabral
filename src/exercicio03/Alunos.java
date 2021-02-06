/*Escreva uma classe cujos objetos representam alunos matriculados em uma
disciplina. Cada objeto dessa classe deve guardar os seguintes dados do aluno:
matrícula, nome, 2 notas de prova e 1 nota de trabalho. Escreva os seguintes
métodos:
a. calculoMedia: método que calcule a média do aluno, sendo que as provas e
o trabalho tem o mesmo peso.
b. situacao: método que informa se o aluno está aprovado (média >= 6), em
IFA ( 6 > média >= 4) ou reprovado (média < 4). */

package exercicio03;

public class Alunos {
	private int matricula;
	private String nome; 
	private float prova1;
	private float prova2;
	private float trabalho;
	private float media;
	
	public Alunos(int m, String n, float p1, float p2, float t1) {
		this.setMatricula(m);
		this.setNome(n);
		this.setProva1(p1);
		this.setProva2(p1);
		this.setTrabalho(t1);
	}
	
	public float calculoMedia(float p1,float p2, float t1) {
		this.media = (p1 + p2 + t1)/ 3;
		return this.media;
	}
	
	public void situacao(float m) {
		
		if (m >= 6)
			System.out.println("Media: " + m + " Aprovado!");
		else if (m < 6 && media >= 4)
			System.out.println("Media: " + m + " IFA");
		else 
			System.out.println("Media: " + m + " REPROVADO");
	}
	
	public void status() {
		System.out.println("Nome: " + this.getNome());
		System.out.println("Matrícula: " + this.getMatricula());
		System.out.println("P1: " + this.getProva1() + " P2: " + this.getProva2() + " Trabalho: " + this.getTrabalho());
		calculoMedia(this.getProva1(), this.getProva2(), this.getTrabalho());
		situacao(this.media);
	}
	
	
	public int getMatricula() {
		return matricula;
	}
	public void setMatricula(int matricula) {
		this.matricula = matricula;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public float getProva1() {
		return prova1;
	}
	public void setProva1(float prova1) {
		if (prova1 > 10 || prova1 < 0)
			System.out.println("Nota da prova 1 Inválida");
		else
			this.prova1 = prova1;
	}
	public float getProva2() {
		return prova2;
	}
	public void setProva2(float prova2) {
		if (prova2 > 10 || prova2 < 0)
			System.out.println("Nota da prova 2 Inválida");
		else
			this.prova2 = prova2;
	}
	public float getTrabalho() {
		return trabalho;
	}
	public void setTrabalho(float trabalho) {
		if (trabalho > 10 || trabalho < 0)
			System.out.println("Nota do trabalho Inválida");
		else
			this.trabalho = trabalho;
	}
	public float getMedia() {
		return media;
	}
	
	
	

}
