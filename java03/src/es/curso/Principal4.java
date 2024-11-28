package es.curso;

public class Principal4 {
//suma numeros hasta Nterminos//
	public static void main(String[] args) {
		System.out.println(sumaNTerminos(7));
	}
	
	public static int sumaNTerminos(int n) {
		int suma=0;
		for(int i=0;i<n;i++) {
			suma=suma+i;
		}
	return suma;
	}
	}