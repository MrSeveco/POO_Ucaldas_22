package Proyect;

public class Persona {

	private String Usuario;
	private String Contraseña;
	private String ConfirmarContraseña;
	private String Correo;
	private String Edad;
	private String Sexo;
	private String CC;
	
	public String getUsuario() {
		return Usuario;
	}
	public void setUsuario(String usuario) {
		Usuario = usuario;
	}
	public String getContraseña() {
		return Contraseña;
	}
	public void setContraseña(String contraseña) {
		Contraseña = contraseña;
	}
	public String getConfirmarContraseña() {
		return ConfirmarContraseña;
	}
	public void setConfirmarContraseña(String confirmarContraseña) {
		ConfirmarContraseña = confirmarContraseña;
	}
	public String getCorreo() {
		return Correo;
	}
	public void setCorreo(String correo) {
		Correo = correo;
	}
	public String getEdad() {
		return Edad;
	}
	public void setEdad(String edad) {
		Edad = edad;
	}
	public String getSexo() {
		return Sexo;
	}
	public void setSexo(String sexo) {
		Sexo = sexo;
	}
	public String getCC() {
		return CC;
	}
	public void setCC(String cc) {
		CC = cc;
	}
	
	public Persona(String usuario, String contraseña, String confirmarContraseña, String correo, String edad,
			String sexo, String cc) {
		super();
		Usuario = usuario;
		Contraseña = contraseña;
		ConfirmarContraseña = confirmarContraseña;
		Correo = correo;
		Edad = edad;
		Sexo = sexo;
		CC = cc;
	}
	}
	
	

