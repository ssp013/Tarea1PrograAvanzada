/**
 * 
 */
package Dominio;

/**
 * @author ssp013
 *
 */
public class Novato extends Programador{

	/**
	 * 
	 */
	private String Lenguaje;
	public Novato(String Rut, int SueldoFijo,String Lenguaje) {
		// TODO Auto-generated constructor stub
		super (Rut,SueldoFijo);
		this.Lenguaje = Lenguaje;
	}
	

	/**
	 * @return the lenguaje
	 */
	public String getLenguaje() {
		return Lenguaje;
	}


	/**
	 * @param lenguaje the lenguaje to set
	 */
	public void setLenguaje(String lenguaje) {
		Lenguaje = lenguaje;
	}


	@Override
	public int calcularSueldo() {
		// TODO Auto-generated method stub
		return this.getSueldoFijo();
	}


	@Override
	public String toString() {
		return "Programador Novato [ Cantidad de Lenguaje = " + Lenguaje + "]";
	}
	

}
