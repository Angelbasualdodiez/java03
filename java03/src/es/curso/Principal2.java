package es.curso;

public class Principal2 {

	public static void main(String[] args) {
		//ejemplo 4 numeros, dos sumas y una resta//
		
		int numero1=5;
	    int numero2=7;
		System.out.println(sumar(numero1,numero2));
		System.out.println(restar(numero1,numero2));
		int numero3=8;
		int numero4=9;
		System.out.println(sumar(numero3,numero4));
}
	//concepto de función//
	public static int sumar(int n1,int n2) {
		int suma=n1+n2;
		return suma;
	}
	public static int restar(int n1,int n2) {
		int resta=n1-n2;
		return resta;
	}
}