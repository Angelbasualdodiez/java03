package es.curso;

public class Principal3 {
//ejemplo de sumar tres numeros con una función
	public static void main(String[] args) {
		//declaras los valores y los invocas//
		int numero1=20;
	    int numero2=15;
	    int numero3=10;
	    System.out.println(sumar(numero1,numero2,numero3));	
	}
	//concepto de función//
	public static int sumar(int n1,int n2,int n3) {
		int suma=n1+n2+n3;
		return suma;
	}
	}