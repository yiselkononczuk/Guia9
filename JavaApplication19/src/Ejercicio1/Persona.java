
package Ejercicio1;

import static java.util.Locale.US;
import java.util.Scanner;


public class Persona {
    private String nombre;
    private String apellido;
    private int edad;
    private int documento;
    private Perro perro;

    
    Scanner leer = new Scanner(System.in, "ISO-8859-1").useDelimiter("\n").useLocale(US);
    public Persona() {
    }

    public Persona(String nombre, String apellido, int edad, int documento, Perro perro) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.edad = edad;
        this.documento = documento;
        this.perro = perro;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public int getDocumento() {
        return documento;
    }

    public void setDocumento(int documento) {
        this.documento = documento;
    }

    public Perro getPerro() {
        return perro;
    }

    public void setPerro(Perro perro) {
        this.perro = perro;
    }

    
    public void solicitarDatoPersona(){
        System.out.println("Ingrese los datos");
        System.out.println("Nombre");
        this.setNombre(leer.next());
        System.out.println("Apellido");
        this.setApellido(leer.next());
        System.out.println("Edad");
        this.setEdad(leer.nextInt());
        System.out.println("DNI");
        this.setDocumento(leer.nextInt());
    }

    @Override
    public String toString() {
        return "Datos de la Persona{" + "nombre=" + nombre + ", apellido=" + apellido + ", edad=" + edad + ", documento=" + documento + ", perro=" + perro +  + '}';
    }

   
    
    
}
