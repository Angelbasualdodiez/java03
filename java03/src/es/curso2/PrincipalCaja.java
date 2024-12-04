package es.curso2;
//crear caja con largo, ancho y fondo y calcular el volumen
public class PrincipalCaja {

	public static void main(String[] args) {
	Caja caja=new Caja(5,10,15);
	
	System.out.println("el largo es:"+caja.getLargo());
	System.out.println("el ancho es:"+caja.getAncho());
	System.out.println("el fondo es:"+caja.getFondo());
	System.out.println("el volumen es:"+caja.calcularVolumen());
	}
}

