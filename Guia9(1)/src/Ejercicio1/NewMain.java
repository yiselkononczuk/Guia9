package Ejercicio1;

import java.util.ArrayList;
import static java.util.Locale.US;
import java.util.Scanner;

public class NewMain {

    public static void main(String[] args) {
    
        ArrayList<Persona> listadoPersona = new ArrayList();
        ArrayList<Perro> listadoPerro = new ArrayList();

        Scanner leer = new Scanner(System.in, "ISO-8859-1").useDelimiter("\n").useLocale(US);
        int contadorPersona=0;
        int contadorPerro=0;
       
        do {
            Persona persona = new Persona();
            persona.solicitarDatoPersona();
             contadorPersona= contadorPersona +1;
            listadoPersona.add(persona);
        } while(contadorPersona< 2);                           

        do {
            Perro perro = new Perro();
            perro.solicitarDatoPerro();
            boolean bandera = false;
            do {
                System.out.println("Quien es el dueño del perro?");
                String dueno = leer.next();
                for (Persona auxPersona : listadoPersona) {
                    if (auxPersona.getNombre().equalsIgnoreCase(dueno)) {
                        auxPersona.setPerro(perro);
                        bandera = true;
                       contadorPerro= contadorPerro +1;    
                    }
                }   
            } while (bandera == false);
             
        } while (contadorPerro<2);
               

        for (Persona auxPersona : listadoPersona) {
            System.out.println(auxPersona.toString());
        }
    }
    
}
