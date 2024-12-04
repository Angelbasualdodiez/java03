package es.curso2;

public class PrincipalCalculadora1 {

public static void main(String[] args) {
		
Calculadora1 calculadora= new Calculadora1();
System.out.println("la suma es:"+calculadora.sumar(100, 10));
System.out.println("la resta es:"+calculadora.restar(100, 10));
System.out.println("la división es:"+calculadora.dividir(100, 10));
System.out.println("la multiplicación es:"+calculadora.multiplicar(100, 10));
}
//un metodo estatico lo invocas directamente y pertenece a la clase
//system.out.println(Calculadora1.sumar(100,10));
//system.out.println(Calculadora1.restar(100,10));
//system.out.println(Calculadora1.dividir(100,10));
//system.out.println(Calculadora1.multiplicar(100,10));
}
