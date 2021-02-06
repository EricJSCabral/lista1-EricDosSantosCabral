package exercicio05;

public class Data {
	
	private int dia;
	private int mes;
	private int ano;
	
	public Data(int dia, int mes, int ano) {
		this.setDia (dia);
		this.setMes(mes);
		this.setAno(ano);
	}
	public int getDia() {
		return dia;
	}
	public void setDia(int dia) {
		if (dia < 1 || dia > 31) {
			System.out.println("Dia inválido");
		} else {
			this.dia = dia;
		}
	}
	public int getMes() {
		return mes;
	}
	public void setMes(int mes) {
		if (mes < 1 || mes > 12) {
			System.out.println("Mês inválido");
		} else {
			this.mes = mes;
		}
	}
	public int getAno() {
		return ano;
	}
	public void setAno(int ano) {
		if (ano < 1 || ano > 2021) {
			System.out.println("Ano inválido");
		} else {
			this.ano = ano;
		}
	}
	
	public void calculaDias (int dia, int mes) {
		
		final int DIAS_MES = 30;
		
		int totalDias = (DIAS_MES * mes) - dia; 
		
		System.out.println("Total de dias do ano até a data atual: " + totalDias);
	}
	
	

}
