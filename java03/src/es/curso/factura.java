package es.curso;

public class factura {

	public double importe;
public double calcularConIVA() {
	//accedo a la propiedad
	return importe *1.21;
}		
public double calcularSoloIVA(){
	//accedo a la propiedad
	return importe *0.21;
	}
}
	


