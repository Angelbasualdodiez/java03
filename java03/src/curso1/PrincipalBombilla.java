package curso1;

public class PrincipalBombilla {
public static void main(String[] args) {
			
	Bombilla bombilla1=new Bombilla();
	
	//si dejo incrementar me suma 1 y decrementar -1
	bombilla1.setIntensidad(2);
	bombilla1.decrementar();
	//bombilla1.incrementar();
	System.out.println(bombilla1.getIntensidad());
	}
}