package es.curso;

public class Principal11 {
	public static void main(String[]args) {
//pasar los resultados a otra //
	Persona p=new Persona();
	p.edad=20;
	p.nombre="paula";
	
	Persona p1=new Persona();
	p1.edad=25;
	p1.nombre="manu";
	
	Persona[] alumnos=new Persona[] {p,p1};
	
	for( int i=0;i<alumnos.length;i++) {
		System.out.println(alumnos[i].nombre);
		System.out.println(alumnos[i].edad);
	}
}	
}	