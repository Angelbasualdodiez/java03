package es.curso;

public class Principal10 {
//sacar notas de gente aprobada de una lista//
	public static void main(String[] args) {
		int[] lista = new int[] { 2, 5, 6, 7 };
		int aprobado = numeroAprobados(lista);
	}

	public static int numeroAprobados(int[] miArray) {
		int aprobado = 5;
		for (int i = 0; i < miArray.length; i++) {
			if (miArray[i] >= aprobado) {
				System.out.println(miArray[i]);
			}
		}
		return aprobado;
	}
}
