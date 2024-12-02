package es.curso;

public class Principal23 {
	public static void main(String[]args) {
		Persona p1=new Persona();
		p1.edad=20;
		Persona p2=new Persona();
		p2.edad=1;
		
		Persona[] lista= new Persona[] {p1,p2};
		//sumar las edades y sacar la media
		int suma=0;
		for(int i=0;i<lista.length;i++) {
			
		System.out.println(lista[i].edad);
	    suma=suma+lista[i].edad;
		}
		System.out.println(suma);
		System.out.println(suma/lista.length);
		}
	}
