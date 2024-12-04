package es.curso2;

public class PrincipalFactura {

	public static void main(String[] args) {
	Factura factura= new Factura(1,100);
	
	System.out.println(factura.getNumero());
	System.out.println(factura.getImporte());
	System.out.println(factura.calcularConIVA());
	}
}
