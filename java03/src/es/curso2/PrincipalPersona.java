package es.curso2;

public class PrincipalPersona {

	public static void main(String[] args) {
		Persona p=new Persona("pedro",10);
		
		System.out.println(p.getEdad());
		System.out.println(p.getNombre());
	}
}
