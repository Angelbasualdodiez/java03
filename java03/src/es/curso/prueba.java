package es.curso;

public class prueba {
//sumar valores de una lista//
	public static void main(String[] args) {
int[] lista=new int[] {2,5,6,7};
int suma=0;
for(int i=0;i<lista.length;i++) {
suma=suma+lista[i];
}
System.out.println(suma);
	}
}
