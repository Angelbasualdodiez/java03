package es.curso;
//poner 4 rectangulos y sacar la suma de sus areas
public class Principal24rectangulo {
	public static void main(String[]args) {
		
rectangulo r=new rectangulo();
r.setLado1(50);
r.setLado2(20);

rectangulo r1=new rectangulo();
r1.setLado1(10);
r1.setLado2(20);

rectangulo r2=new rectangulo();
r2.setLado1(30);
r2.setLado2(20);

rectangulo r3=new rectangulo();
r3.setLado1(5);
r3.setLado2(2);

rectangulo lista[]=new rectangulo[] {r,r1,r2,r3};
double areaTotal=0;
for(int i=0;i<lista.length;i++){
	System.out.println(lista[i].calcularArea());
	areaTotal=areaTotal+lista[i].calcularArea();	
}
System.out.println(areaTotal);
}
}

