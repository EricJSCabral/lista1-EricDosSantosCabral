package exercicio06;

public class MainTempo {

	public static void main(String[] args) {

		Tempo t1 = new Tempo (20, 30, 40);
		Tempo t2 = new Tempo (15, 20, 5);
		
		System.out.println(t1.getHora() + ":" + t1.getMinuto() + ":" + t1.getSegundo());
		System.out.println(t2.getHora() + ":" + t2.getMinuto() + ":" + t2.getSegundo());
		
		Tempo t3 = new Tempo ();
		
		int horaT3 = t3.subtraiHora(t1.getHora(), t2.getHora());
		int minutoT3 = t3.subtraiMinuto(t1.getMinuto(), t2.getMinuto());
		int segundoT3 = t3.somaSegundo(t1.getSegundo(), t2.getSegundo());
		
		t3.setHora(horaT3);
		t3.setMinuto(minutoT3);
		t3.setSegundo(segundoT3);
		
		System.out.println(t3.getHora() + ":" + t3.getMinuto() + ":" + t3.getSegundo());
		
	}

}
