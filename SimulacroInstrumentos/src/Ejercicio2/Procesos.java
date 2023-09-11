package Ejercicio2;

import java.util.ArrayList;

import javax.swing.JOptionPane;

public class Procesos {
	/* 2. Haga un algoritmo donde se construya un arreglo resultante de la suma de 2 arreglos del mismo tamaño, 
	el nuevo arreglo mostrará en cada posición el resultado de la suma de las mismas posiciones de los otros 2, 
	para el llenado de los 2 arreglos, solicite el ingreso al usuario, adicionalmente debe mostrar el contenido 
	de los 3 arreglos, tanto los iniciales como el resultante. */
	ArrayList<Integer> suma1 = new ArrayList<Integer>();;
	ArrayList<Integer> suma2 = new ArrayList<Integer>();
	ArrayList<Integer> sumaTotal = new ArrayList<Integer>();
	public Procesos() {
		iniciar();
	}

	private void iniciar() {

		int cant = Integer.parseInt(JOptionPane.showInputDialog("ingrese la cantidad de numeros quie sea ingresas en el arreglo"));
		llenadoArreglos(cant);
		sumaArreglos();
		imprimirArreglos();
	}
	private void imprimirArreglos() {
		System.out.println("arreglo 1 " + suma1);
		System.out.println("arreglo 1 " + suma2);
		System.out.println("arreglo de suma: "+ sumaTotal);
	}

	private void sumaArreglos() {
		for (int i = 0; i < suma1.size(); i++) {
			sumaTotal.add(suma1.get(i)+suma2.get(i));
		}
	}


	public void llenadoArreglos(int cant) {
		int num;
		for (int i = 0; i < cant; i++) {
			num = Integer.parseInt(JOptionPane.showInputDialog("ingrese el numero " + (i+1) + "para el arreglo 1"));
			suma1.add(num);
		}
		for (int i = 0; i < cant; i++) {
			num = Integer.parseInt(JOptionPane.showInputDialog("ingrese el numero " + (i+1) + "para el arreglo 2"));
			suma2.add(num);
		}
	}
}
