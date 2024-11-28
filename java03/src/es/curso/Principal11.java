package es.curso;

public class Principal11 {
	public static void main(String[]args) {
//pasar los resultados a otra //
	persona p=new persona();
	p.edad=20;
	p.nombre="paula";
	
	persona p1=new persona();
	p1.edad=25;
	p1.nombre="manu";
	
	persona[] alumnos=new persona[] {p,p1};
	
	for( int i=0;i<alumnos.length;i++) {
		System.out.println(alumnos[i].nombre);
		System.out.println(alumnos[i].edad);
	}
}	
}	