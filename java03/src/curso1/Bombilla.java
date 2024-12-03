package curso1;

public class Bombilla {
private int intensidad;
//esto sirve para cuando el paquete es privado y lo quieres passar a publico para poder coger el valor//
public int getIntensidad() {
	return intensidad;
}
public void setIntensidad(int i) {
	if(i>=0 && i<=3)
	intensidad=i;
}
//pones void en vez de int o double xq no devuelves nada
public void incrementar() {
	//intensidad=intensidad+1;
	//lo de arriba no vale porque no pasa por el if
	setIntensidad(getIntensidad()+1);

}
public void decrementar() {
	//intensidad=intensidad-1;
	setIntensidad(getIntensidad()-1);
}
}