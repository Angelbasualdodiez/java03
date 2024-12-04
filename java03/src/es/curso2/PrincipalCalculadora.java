package es.curso2;

public class PrincipalCalculadora {

	public static void main(String[] args) {
		Calculadora calculadora=new Calculadora(100,10);
		System.out.println("la suma es:"+calculadora.sumar());
		System.out.println("la resta es:"+calculadora.restar());
		System.out.println("la multiplicación es:"+calculadora.multiplicar());
		System.out.println("la división es:"+calculadora.dividir());

	}
}