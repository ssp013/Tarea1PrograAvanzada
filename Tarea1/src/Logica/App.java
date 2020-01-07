/**
 * 
 */
package Logica;
import Dominio.*;
import java.io.*;
import ucn.*;
/**
 * @author ssp013
 *
 */
public class App {
	public void Menu(SistemaSonda Sistema) {
		StdOut.println("HOLA");
		
		/**try{
			StdOut.println(sistema.obtenerDatosFuncionariosProyecto(codigo)); 
			}catch(NullPointerException ex){
			StdOut.println(ex.getMessage()); 
			}		
		
	}**/
	/**
	 * @param args
	 */
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		SistemaSonda Sistema = new SistemaSondaImpl();
		
	}

}
