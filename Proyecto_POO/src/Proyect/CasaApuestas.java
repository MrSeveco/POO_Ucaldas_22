package Proyect;
import java.util.Scanner;
import java.awt.TextField;

import javax.swing.JTextField;

public class CasaApuestas {
	private static Scanner lee = new Scanner(System.in); 

	public static void main(String[] args) {
		
		Persona persona = new Persona(null,null,null,null,null,null,null);
System.out.print("Welcome: \nIngrese su Usuario: ");
persona.setUsuario(lee.next());
System.out.println("Su usuario es: " + persona.getUsuario());

	}
}
