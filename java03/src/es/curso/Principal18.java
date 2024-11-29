package es.curso;

public class Principal18 {
	public static void main(String[] args) {
		String[] lista=new String[] {"hola","que","tal","estas"};
		for (int i=0;i<lista.length;i++) {
			
			for(int j=0;j<lista[i].length();j++) {
		char caracter=lista[i].charAt(j);
		System.out.println(caracter);
		}
		System.out.println();
	}
	}
}

