package es.curso;

public class Principal22 {
	public static void main(String[]args) {
		Persona p1=new Persona();
		p1.edad=20;
		p1.nombre="ceci";
		Persona p2=new Persona();
		p2.edad=1;
		p2.nombre="catalina";
		
		//es un array//
		Persona[] lista= new Persona[] {p1,p2};
		//que ponga la edad y los nombres
		for(int i=0;i<lista.length;i++) {
		System.out.println(lista[i].edad);
		System.out.println(lista[i].nombre);
		}
	}

}
