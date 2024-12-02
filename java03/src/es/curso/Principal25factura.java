package es.curso;

public class Principal25factura {
	public static void main(String[]args) {
		factura f=new factura();
		f.importe=100;
		System.out.println(f.importe);
		System.out.println(f.calcularConIVA());
		
		
	}
	
	}
