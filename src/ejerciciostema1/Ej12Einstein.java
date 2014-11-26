package ejerciciostema1;

public class Ej12Einstein {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		double energia=0;
		double masa=9.109*Math.pow(10,-31);
		final int c = 300000000; // m/s 
		
		energia=masa*Math.pow(c, 2);
		System.out.printf("la energía del cuerpo es: %e", +energia);
		
	}

}
