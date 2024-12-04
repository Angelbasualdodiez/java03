package es.curso2;

public class Caja {
private int largo;
private int ancho;
private int fondo;
public int getLargo() {
	return largo;
}
public void setLargo(int largo) {
	this.largo = largo;
}
public int getAncho() {
	return ancho;
}
public void setAncho(int ancho) {
	this.ancho = ancho;
}
public int getFondo() {
	return fondo;
}
public void setFondo(int fondo) {
	this.fondo = fondo;
}
public Caja(int largo, int ancho, int fondo) {
	super();
	this.largo = largo;
	this.ancho = ancho;
	this.fondo = fondo;
}
public double calcularVolumen() {
	return largo*ancho*fondo;
}
}