package es.curso;

public class Principal6 {
//crear una copia de un valor cambiando ese valor//
	public static void main(String[] args) {
	int numero1=2;
	cambiar(numero1);
	System.out.println(numero1);
	}
	public static void cambiar(int n1) {
	n1=7;
	System.out.println("cambiado"+n1);
	}
	}