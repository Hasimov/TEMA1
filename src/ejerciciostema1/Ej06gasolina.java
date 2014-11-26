package ejerciciostema1;

public class Ej06gasolina {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		double dinero=0;
		double kilometros=300;
		double consumo=8.2; //a los 100 km
		double precio=1.43; // € por litro
		dinero=kilometros*consumo*precio*0.01;
				
		
		System.out.println("El gasto en gasolina para tu viaje es: " +dinero+ " €");
		
	}

}
