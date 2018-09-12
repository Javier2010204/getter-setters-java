public class Persona{

	//Propiedades de la clase Persona: Son todos los atributos que tiene una persona
	String nombre = "";
	String apellido = "";

	Persona(){
	}

	//*********************************************
	//CADA PROPIEDAD DEBE TENER UN SET Y UN GET PARA RECIBIR UNA VALOR(SET) Y DEVOLVER EL VALOR QUE CONTIENE(GET)
	//*********************************************

	//setter & getter de Nombre
	public void setNombre(String nombre){
		this.nombre = nombre;
	}
	public String getNombre(){
		return nombre;
	}

	// setter & getter de apellido
	public void setApellido(String apellido){
		this.apellido = apellido;
	}
	public String getApellido(){
		return apellido;
	}

	// Metodo para saludar
	public void saludar(){
		System.out.println("Hola Gildardo");
	}
}