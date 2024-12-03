package curso1;

public class ejercicio2 {
	//recorrer la cadena "hola que tal estas" e imprimir sus vocales
	public static void main(String[]args) {
	String cadena1="hola que tal estas";
	System.out.println(cadena1);
	System.out.println("las vocales son:");
	
	for(int i=0;i<cadena1.length();i++) {
		if(cadena1.charAt(i)=='a'|| cadena1.charAt(i)=='e'|| cadena1.charAt(i)=='i'|| cadena1.charAt(i)=='o'|| cadena1.charAt(i)=='u') {
		System.out.println(cadena1.charAt(i));
	}
	}
}
}