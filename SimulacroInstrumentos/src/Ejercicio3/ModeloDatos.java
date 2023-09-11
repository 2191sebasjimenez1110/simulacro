package Ejercicio3;

import java.util.ArrayList;
import java.util.HashMap;

import javax.swing.JOptionPane;

public class ModeloDatos {
	HashMap<String, ArrayList<String>> mapaEmpleados;
	
	public ModeloDatos() {
		mapaEmpleados = new HashMap<String, ArrayList<String>>();
	}
	
	public void consultarEmpleado(String nombre) {
		ArrayList<String> listaEmpleados = new ArrayList<String>();
	if (mapaEmpleados.containsKey(nombre)) {
		listaEmpleados=mapaEmpleados.get(nombre);
		System.out.println(" \nNombre: " + listaEmpleados.get(0) + 
				" \nEstrato: " + listaEmpleados.get(1) +
				" \nSueldo: " + listaEmpleados.get(2) +
				" \nDescuento: " + listaEmpleados.get(3) +
				" \nSubTotal: " + listaEmpleados.get(4));
	}else {
		JOptionPane.showMessageDialog(null, "La persona no fue resgitrada",
		"Advertencia",JOptionPane.WARNING_MESSAGE);
	}
	}
	
	public void guardarDatos(ArrayList<String> listaEmpleados) {
		mapaEmpleados.put(listaEmpleados.get(0), listaEmpleados);
		JOptionPane.showConfirmDialog(null,"registro exitoso");
	}
	
	public HashMap<String, ArrayList<String>> getMapaEstudiantes(){
		return mapaEmpleados;
	}

	
	public void imprimirMapa() {
		for (String documento:mapaEmpleados.keySet()) {
			System.out.println(documento + " - "+mapaEmpleados.get(documento));
		}
	}
}