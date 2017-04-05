import javax.swing.JOptionPane;

/**
 * Clase principal donde se ejecutan las funciones
 * 
 */
public class Principal {
	static Traductor diccionario = new Traductor();
	static String tipo = "";

	/**
	 * Metodo para instaciar la clase Traductor e invocar las de busqueda .
	 */
	static void ejecutar() {
		JOptionPane.showMessageDialog(null, "Bienvenido al traductor binario",
				"Bienvenida", JOptionPane.INFORMATION_MESSAGE);
		tipo = JOptionPane.showInputDialog("Ingrese el directorio donde se encuentran las palabras : ");
		System.out.println("Busqueda inOrder: ");
		diccionario.crear(tipo);
		diccionario.in();
		tipo = JOptionPane.showInputDialog("Ingrese el directorio donde se encuentra la oracion a traducir: ");
		System.out.println("Oracion traducida: ");
		diccionario.buscar(tipo);
	}

	/**
	 * Metodo main
	 * @param args
	 */
	public static void main(String args[]) {
		ejecutar();

	}
}