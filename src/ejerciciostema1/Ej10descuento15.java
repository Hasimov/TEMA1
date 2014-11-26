package ejerciciostema1;

public class Ej10descuento15 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double preciofinal=0;
		double precioinicial=100;
		double descuento=20;
		int unidades=4;
		
		preciofinal=unidades*precioinicial*(1-descuento*0.01);
		System.out.println("El precio tras el descuento es: "+preciofinal+" €");
	}

}
