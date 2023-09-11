import java.util.ArrayList;
import java.util.Iterator;
import javax.swing.JOptionPane;

public class Procesos {
	ArrayList<String>listaPersonas = new ArrayList<String>();
	int cantidadReg = 0, personasIng = 0, personasMay = 0, personasMen = 0;
	
	/*1. Haga un algoritmo que solicite el nombre, documento, edad y profesión de n personas e imprima la siguiente información:
		- Total personas registradas
		- Cantidad de personas ingresadas
		- Cantidad de personas mayores de edad
		- Cantidad de personas menores de edad. */

	public Procesos() {
		iniciar();
	}

	private void iniciar() {
		String opc = JOptionPane.showInputDialog("Cuntos usuarios desea ingresar: ");
		for (int i = 0; i < Integer.parseInt(opc); i++) {
			solicitarDatos();
		}
		System.out.println("El total de personas registradas fue: " + opc);
		System.out.println("La cantidad de personas ingresadas fue: " + cantidadReg);
		System.out.println("La cantidad de personas mayores de edad fue: " + personasMay);
		System.out.println("La cantidad de personas menores de edad fue: " + personasMen);
	}

	private void solicitarDatos() {
		cantidadReg++;
		String nombre = JOptionPane.showInputDialog("ingrese el nombre de la persona");
		String documento = JOptionPane.showInputDialog("ingrese el documento de la persona");
		String edad = JOptionPane.showInputDialog("ingrese la edad de la persona");
		validarEdad(Integer.parseInt(edad));
		String profesion = JOptionPane.showInputDialog("ingrese ela profesion de la persona");
		
		listaPersonas.add(nombre);
		listaPersonas.add(documento);
		listaPersonas.add(edad);
		listaPersonas.add(profesion);

	}

	private void validarEdad(int edad) {
		if (edad >= 18) {
			personasMay++;
		}else {
			personasMen++;
		}
		
	}
	
}
