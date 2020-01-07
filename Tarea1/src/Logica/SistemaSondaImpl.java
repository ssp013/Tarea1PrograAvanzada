/**
 * 
 */
package Logica;
import Dominio.*;

/**
 * @author ssp013
 *
 */
public class SistemaSondaImpl implements SistemaSonda {
	private ListaProgramadores listaProgramadores;
	/**
	 * 
	 */
	public SistemaSondaImpl() {
		// TODO Auto-generated constructor stub
		this.listaProgramadores = new ListaProgramadores(100);
	}
	@Override
	public boolean ingresarNovato(String Rut, int SueldoFijo, String Lenguaje) {
		// TODO Auto-generated method stub
		Programador novato = new Novato(Rut,SueldoFijo,Lenguaje);
		boolean ingresarProg = listaProgramadores.ingresarProgramador(novato);
		return ingresarProg;
	}
	@Override
	public boolean ingresarExperto(String Rut, int SueldoFijo, int año) {
		// TODO Auto-generated method stub
		Programador experto = new Experto(Rut, SueldoFijo, año);
		boolean ingresarProg = listaProgramadores.ingresarProgramador(experto);
		return ingresarProg;
	}
	@Override
	public String obtenerDatosProgramadores() {
		// TODO Auto-generated method stub
		return null;
	}
	@Override
	public String obtenerDatosNovatos() {
		// TODO Auto-generated method stub
		return null;
	}

}
