package es.curso;

public class rectangulo {

		private double lado1;
		private double lado2;
		//el get los obtiene
		public double getLado1() {
			return lado1;
		}
		//el set los asigna
		public void setLado1(double lado1) {
			this.lado1 = lado1;
		}
		public double getLado2() {
			return lado2;
		}
		public void setLado2(double lado2) {
			this.lado2 = lado2;
		}
		public double calcularArea() {
			return lado1*lado2;
		}
	}