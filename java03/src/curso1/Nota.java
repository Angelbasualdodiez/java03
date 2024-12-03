package curso1;

public class Nota {
private double valor;
	
//Esto sirve para cuando el paquetye es privado;poder pasarlo a publico//
public double getValor() {
	return valor;
	}
public void setValor(double v) {
	if(v>=0 && v<=1)
	valor=v;
}
}