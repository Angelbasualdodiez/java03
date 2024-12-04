package es.curso2;
//crear la clase factura con numero e importe y un constructor 
//y un metodo que calcule el IVA//
//en esta no hay que poner lo de string args...
public class Factura {
//primero pones las variables y ya luego creas getters y setters//
		private int numero;
		private int importe;
		
		public int getNumero() {
			return numero;
		}
		public void setNumero(int numero) {
			this.numero = numero;
	
		}
		public int getImporte() {
			return importe ;
		}
		//lo puedo poner en cualquier lado mientra sea antes del 
		//cierre total
		public double calcularConIVA() {
				return importe *1.21;
		}
		public void setImporte(int importe) {
			this.importe = importe;
		}
		public Factura(int numero, int importe) {
			super();
			this.numero = numero;
			this.importe = importe;
			
			//es para si hay limitaciones por ejmplo if
			//setNumero(numero);
			//setImporte(importe);
		}
}