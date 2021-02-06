package exercicio06;

public class Tempo {
	
	private int hora;
	private int minuto;
	private int segundo;
	
	public Tempo () {
		
	}
	
	public Tempo (int hora, int minuto, int segundo) {
		this.setHora(hora);
		this.setMinuto(minuto);
		this.setSegundo(segundo);
	}
	
	public int getHora() {
		return hora;
	}
	public void setHora(int hora) {
		if (hora < 0 || hora > 23) {
			System.out.println("Hora inválida");
		}else{
			this.hora = hora;
		}
	}
	public int getMinuto() {
		return minuto;
	}
	public void setMinuto(int minuto) {
		if(minuto < 1 || minuto > 60) {
			System.out.println("Minutos inválidos");
		} else {
			this.minuto = minuto;
		}
	}
	public int getSegundo() {
		return segundo;
	} 
	public void setSegundo(int segundo) {
		if (segundo < 1 || segundo > 60) {
			System.out.println("Segundos Inválidos");
		} else {
			this.segundo = segundo;
		}
	}
	
	public int somaHora (int h1, int h2) {
		int h3 = h1 + h2;
		return h3;
	}
	
	public int somaMinuto (int m1, int m2) {
		int m3 = m1 + m2;
		return m3;
	}
	
	public int somaSegundo (int s1, int s2) {
		int s3 = s1 + s2;
		return s3;
	}
	
	public int subtraiHora (int h1, int h2) {
		int h3 = h1 - h2;
		return h3;
	}
	
	public int subtraiMinuto (int m1, int m2) {
		int m3 = m1 - m2;
		return m3;
	}
	
	public int subtraiSegundo (int s1, int s2) {
		int s3 = s1 - s2;
		return s3;
	}
	

}
