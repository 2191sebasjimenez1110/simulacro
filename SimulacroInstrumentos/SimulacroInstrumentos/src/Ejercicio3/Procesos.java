package Ejercicio3;

import java.util.ArrayList;

import javax.swing.JOptionPane;

public class Procesos {
	ModeloDatos miData;
	ArrayList<String> listaEmpleados;
	String menu,opc;
	
	
	public Procesos() {
		miData=new ModeloDatos();
		iniciar();
	}

	private void iniciar() {
		menu = "Menu De Opciones\n";
		menu += "\n1. Registrar Persona";
		menu += "\n2. consultar Persona";
		menu += "\n3. Imprimir lista de Personas";
		menu += "\n4. salir";
		menu += "\n Ingrese una opcion";
		
		
		do {
			opc = JOptionPane.showInputDialog(menu);
			menu(opc);
		} while (!opc.equals("4"));
	}

	int count;
	private void menu(String opc) {
		
		switch (opc) {
		case "1":
			ingrresoDatos();
			count = 1;
			break;
		case "2":
				if(count == 1)	{
					String nombre = JOptionPane.showInputDialog("ingrese el nombre que desea consultat");
					miData.consultarEmpleado(nombre);
				}else {
					JOptionPane.showConfirmDialog(null, "tiene que ingresar primero datos");
				}
			break;
		case "3":
			if(count == 1)	{
				miData.imprimirMapa();
			}else {
				JOptionPane.showConfirmDialog(null, "tiene que ingresar primero datos");
			}
			
			break;
		case "4":
			break;

		default:
			JOptionPane.showConfirmDialog(null, "Ingrese una opcion valida");
			break;
		}
		
	}

	private void consultar(String nombre) {
		// TODO Auto-generated method stub
		
	}

	private void ingrresoDatos() {
		String nombre;
		int estrato;
		Double sueldo = 0.0, sueldoTotal = 0.0, descuento = 0.0;
		listaEmpleados = new ArrayList<String>();
		opc = JOptionPane.showInputDialog("ingrese la cantidad de empleados que desea ingresar");
		for (int i = 0; i < Integer.parseInt(opc); i++) {
			nombre = JOptionPane.showInputDialog("ingrese el nombre del empleado que desea ingresar");
			estrato =Integer.parseInt(JOptionPane.showInputDialog("ingrese el estrato del empleado " + nombre));
			sueldo = Double.parseDouble(JOptionPane.showInputDialog("ingrese el sueldo del empleado " + nombre));
			descuento = calcularDescuento(estrato,sueldo);
			sueldoTotal = sueldo-descuento;
			
			listaEmpleados.add(nombre);
			listaEmpleados.add(estrato + "");
			listaEmpleados.add(sueldo  + "");
			listaEmpleados.add(descuento  + "");
			listaEmpleados.add(sueldoTotal  + "");
			
			miData.guardarDatos(listaEmpleados);
		}
		
		
	}

	private Double calcularDescuento(int estrato, Double sueldo) {
		double valDescuento = 0.0, totalDesc = 0.0;
		if (estrato == 1 || estrato == 2) {
			valDescuento = 0.02;
			totalDesc = valDescuento*sueldo;
		} else if(estrato == 3 || estrato == 4) {
			valDescuento = 0.04;
			totalDesc = valDescuento*sueldo;
		} else if(estrato == 5) {
			valDescuento = 0.08;
			totalDesc = valDescuento*sueldo;
		} else if(estrato == 6) {
			valDescuento = 0.10;
			totalDesc = valDescuento*sueldo;
		} else {
			JOptionPane.showConfirmDialog(null, "ingrese una opcion valida");
		}
		return totalDesc;
	}

	
	
}
