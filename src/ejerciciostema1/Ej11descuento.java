package ejerciciostema1;

public class Ej11descuento {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		double preciofinal=0;
		double precioinicial=100;
		double descuento=15;
		
		preciofinal=precioinicial*(1-descuento*0.01);
		System.out.println("El precio tras el descuento es: "+preciofinal+" €");
	}

}
