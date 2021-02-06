package exercicio05;

public class MainData {

	public static void main(String[] args) {
		Data festa = new Data (20, 2, 2018);
		
		System.out.println("Data: " + festa.getDia() + "/" + festa.getMes() + "/" + festa.getAno());
	
		festa.calculaDias(festa.getDia(), festa.getMes());
		
		System.out.println("\n");
		Data reuniao = new Data (35, 20, 2050); //exemplo com dados errados
		
		System.out.println("Data: " + reuniao.getDia() + "/" + reuniao.getMes() + "/" + reuniao.getAno());
		
		reuniao.calculaDias(reuniao.getDia(), reuniao.getMes());
		
	}

}
