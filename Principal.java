import java.util.Scanner;
import java.util.ArrayList;

public class Principal{
	public static void main(String args[]){

		Scanner scanner = new Scanner(System.in);
		String nombre = "";

		ArrayList<Persona> listaPersonas = new ArrayList<Persona>();

		for(int i=0; i < 3; i++){
			Persona persona = new Persona(); //Instancia de clase persona
			System.out.println("Escriba un nombre");
			nombre = scanner.nextLine();
			persona.setNombre(nombre); 
			persona.saludar(); // ejecucion de metodo declarado en Clase Persona
			listaPersonas.add(i, persona); //El metodo add agrega un objeto a mi ArrayList -> 
		}

		//forEach
		for (Persona persona : listaPersonas) {
    		System.out.println(persona.getNombre());
		}

	}
}